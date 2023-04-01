package reqres.CRUDOperationsBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUserTest {

	@Test
	public void createUserTest() {
		// Step 1: Create prerequisites -> body

		JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.assertThat()
				.statusCode(201)
			.log().all();
	}
}
