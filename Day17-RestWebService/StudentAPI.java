package com.techment;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/student")
public class StudentAPI {

	@GET
	@Path("/studentdetails")
	public String getStudentDetails()
	{
		return "Hello this is student details";
	}
	
	@GET
	@Path("/byname/{name}")
	public String getStudentDetailsByName(@PathParam("name") String name)
	{
		return "Your name is "+name;
	}
	
	@GET
	@Path("/getstudent")
	@Produces(MediaType.APPLICATION_JSON)
	public Students getStudentDetails2()
	{
		Students stu = new Students();
		stu.setId(1);
		stu.setName("Aditi");
		stu.setDept("Cse");
		return stu;
		
		
	}
}
