package com;

//For REST Service
import javax.ws.rs.*; 
import javax.ws.rs.core.MediaType; 
//For JSON
import com.google.gson.*;

import model.Bill; 

@Path("/bill")
public class BillService {
	
	Bill BillObj = new Bill();
	
	 @POST
	 @Path("/")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.TEXT_PLAIN)
	 public String insertComplain(String insertData)
	 {
			//Convert the input string to a JSON object 
		 JsonObject insertObject = new JsonParser().parse(insertData).getAsJsonObject();
		 
		 String name = insertObject.get("name").getAsString();
		 String date = insertObject.get("date").getAsString();
		 String complaintype = insertObject.get("period").getAsString();

		 String output = billObj.insertBill(name, date, period);
		 return output; 
	 }
	 
	 @GET
	 @Path("/") 
	 @Produces(MediaType.TEXT_HTML) 
	 public String readBill() 
	  { 
		  return billObj.readBill(); 
	  }
	 
	 @PUT
	 @Path("/")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.TEXT_PLAIN)
	 public String updateBill(String updateData)
	 {
		 JsonObject updateObject = new JsonParser().parse(updateData).getAsJsonObject();
		 
		 String idbill = updateObject.get("idbill").getAsString();
		 String name = updateObject.get("name").getAsString();
		 String date = updateObject.get("date").getAsString();
		 String period = updateObject.get("period").getAsString();
		 
		 String output = billObj.updateBill(idbill, name, date, period);
		 return output;
	 }
	 
	 @DELETE
	 @Path("/")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.TEXT_PLAIN)
	 public String deleteBill(String deleteData)
	 {
		 JsonObject updateObject = new JsonParser().parse(deleteData).getAsJsonObject();
		 
		 String idbill = updateObject.get("idbill").getAsString();
		 
		 String output = billObj.deleteBill(idbill);
		 return output;

	 }
	
}
