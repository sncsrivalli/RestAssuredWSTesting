package reqres.SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclasses.PetStoreUserLibrary;

public class SerializationTest {

	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {

		PetStoreUserLibrary obj = new PetStoreUserLibrary(101, "ABC", "Mr.", "XYZ", "abc@gmail.com", "12345",
				"9876543210", 1);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/petstoreuser.json"), obj);
	}
}
