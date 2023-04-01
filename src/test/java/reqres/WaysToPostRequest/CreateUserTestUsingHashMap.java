package reqres.WaysToPostRequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUserTestUsingHashMap {

	@Test
	public void createUserTest() {
		HashMap<String,String> obj = new HashMap<String,String>();
		obj.put("name", "srivalli");
		obj.put("job", "trainer");
		
		baseURI = "https://reqres.in";
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
		.when()
			.post("/api/users")
		.then()
			.log().all()
			.assertThat()
				.statusCode(201);
	}
}
