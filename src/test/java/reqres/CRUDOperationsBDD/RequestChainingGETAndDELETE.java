package reqres.CRUDOperationsBDD;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChainingGETAndDELETE {

	@Test
	public void getAndDeleteUser() {
		baseURI = "https://reqres.in";
		
		Response resp =when().get("/api/users/2");
		
		int id = resp.jsonPath().get("data.id");
		
		resp.then()
				.assertThat().statusCode(200)
				.log().all();
		
		when()
			.delete("/api/users/"+id)
		.then()
			.assertThat()
				.statusCode(204)
			.log().all();
		
	}
}
