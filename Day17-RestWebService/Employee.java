package com.techment;
import javax.ws.rs.Path;

@Path("employee")
public class Employee {
	
	@Path("empdetails")
	public String getEmpDetails()
	{
		return "Hello this is employee details";
	}
	

}
