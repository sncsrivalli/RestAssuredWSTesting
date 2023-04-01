package reqres.responseValidation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ResponseHeaderValidation {

	@Test
	public void headerValidation() {
		baseURI = "https://reqres.in";
		when()
			.get("/api/users/2")
		.then()
			.assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.header("X-Powered-By", "Express")
				.header("CF-Cache-Status", "HIT")
			.log().all();
			
	}
}
