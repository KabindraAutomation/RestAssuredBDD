package com.qa.rest.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.hamcrest.Matchers;
public class GetCallBDD {
	
	@Test
	public void test_numberOfCircuitsFor2017_Season() {
		
//		given().
//		when().
//		then().
//		assert()
		
		given().
		when().
			get("http://ergast.com/api/f1/2017/Circuits.json").
		then().
			assertThat().
			statusCode(200).
			and(). 
			
			body("MRData.CircuitTable.Circuits.circuitId",  Matchers.hasSize(20)).
			and().header("Content-Length", Matchers.equalTo("4551")).and();
			
			
	}



}
