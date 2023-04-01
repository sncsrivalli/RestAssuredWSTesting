package reqres.SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclasses.PetStoreUserLibrary;

public class DeserializationTest {

	@Test
	public void deserialization() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		PetStoreUserLibrary petstore = mapper.readValue(new File("./src/test/resources/petstoreuser.json"), PetStoreUserLibrary.class);
		
		System.out.println(petstore.id);
		System.out.println(petstore.username);
		
	}
}
