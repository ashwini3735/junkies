package RestAshured;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Crudopration {
	
	public void post()
	{
		JSONObject json = new JSONObject();
		json.put("cratedby", "ashu");
		json.put("projectName", "abcd");
		json.put("ststus", "on going");
		json.put("team size", 4);
		given()
		.body(json).contentType(ContentType.JSON)
		.when().post(" ")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
		
	}
	public void Hashmap()
	{
		HashMap map = new HashMap();
		map.put("cratedby", "ashu");
		map.put("projectName", "abcd");
		map.put("ststus", "on going");
		map.put("team size", 4);
		String edata = "ty";
		Response resp = given()
		 
				.body(map)
				.contentType(ContentType.JSON);
		when().post("http://rmgtestingserver:8084/addProject");
		String achudata = resp.jsonPath().get("projectid");
		.th
		
		Assert.assertEquals(edata,achudata);
		.given()
		.auth().basic(DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH)
		.auth().digest(DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH)
		.auth().preemptive().basic(DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH)
		.auth().oauth2(DEFAULT_BODY_ROOT_PATH)
		.pathParam("id", achudata)
		.when().get("{id}").then().assertThat().statusCode(200).log().all();
		
		
	}

}
