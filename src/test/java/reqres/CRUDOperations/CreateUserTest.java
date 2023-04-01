package reqres.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {

	@Test
	public void createUserTest() {
		
		//Step 1: Create prerequisites -> body
		
		JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		//Step 2: Send request
		Response response = request.post("https://reqres.in/api/users");
		
		//Step 3: Validate the response
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(201);
		val.log().all();
	}
}
