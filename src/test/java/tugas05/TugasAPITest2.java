package tugas05;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;


public class TugasAPITest2 {
	


	@Test
	//Create user successfully
	public void createUser1() {
		
		Faker faker = new Faker();
		
		
		String username = faker.name().fullName().replaceAll(" ", "");
		String password = faker.internet().password();
		String email = faker.internet().emailAddress();
		String phonenumber = faker.phoneNumber().cellPhone().trim();
		
		Map<String, String> body = new HashMap<String, String>();
		body.put("username", username);
		body.put("password", password);
		body.put("email", email);
		body.put("phonenumber", phonenumber);
	

		given().
			baseUri("https://kolakproject.herokuapp.com/register").contentType(ContentType.JSON).body(body).log().all().
		when().
			post().
		then().
			assertThat().statusCode(201);
		
		
	}
		
	
	

}
