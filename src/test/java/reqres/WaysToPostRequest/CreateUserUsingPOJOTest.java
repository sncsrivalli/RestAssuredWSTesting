package reqres.WaysToPostRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoclasses.UserLibrary;

public class CreateUserUsingPOJOTest {

	@Test
	public void createUserTest() {
		UserLibrary obj = new UserLibrary("Srivalli", "Trainer");
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.log().all()
			.assertThat()
				.statusCode(201);
	}
}
