package reqres.CRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsersTest {

	@Test
	public void getAllUsersTest() {
		//Step 1: Create prerequisites
		
		//Step 2: Send the request
		Response response = RestAssured.get("https://reqres.in/api/users");
		
		//Step 3: Validate the response
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(200);
		val.log().all();
	}
}
