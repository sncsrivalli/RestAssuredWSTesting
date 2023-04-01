package reqres.CRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteUserTest {

	@Test
	public void deleteUserTest() {
		Response response = RestAssured.delete("https://reqres.in/api/users/2");
		
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(204);
		val.log().all();
	}
}
