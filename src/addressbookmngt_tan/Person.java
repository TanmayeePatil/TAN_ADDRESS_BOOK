/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookmngt_tan;

import org.json.simple.JSONObject;
/**
 *
 * @author tanmayee
 */
public class Person {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	
	public Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	
	public JSONObject toJsonObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("First Name", firstName);
		jsonObject.put("Last Name", lastName);
		jsonObject.put("Address", address);
		jsonObject.put("City", city);
		jsonObject.put("State", state);
		jsonObject.put("Zip", zip);
		jsonObject.put("Phone Number", phoneNumber);
		return jsonObject;
	}
}
