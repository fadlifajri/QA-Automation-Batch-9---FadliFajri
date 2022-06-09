package tugas05;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import com.github.javafaker.Faker;


public class TugasAPITest {
	


	@Test
	//Create user successfully
	public void createUser1() {
		Faker faker = new Faker();
		
		String username = faker.name().fullName().replaceAll(" ", "");
		String password = faker.internet().password();
		String email = faker.internet().emailAddress();
		String phonenumber = faker.phoneNumber().cellPhone().trim();
		
		JSONObject body = new JSONObject();
	
		body.put("username", username);
		body.put("password", password);
		body.put("email", email);
		body.put("phonenumber", phonenumber);
	
		System.out.println(body);
		given().
			body(body).
		when().
			post("https://kolakproject.herokuapp.com/register").
		then().
			statusCode(201).log().all();
		
		
	}
		
	
	

}
