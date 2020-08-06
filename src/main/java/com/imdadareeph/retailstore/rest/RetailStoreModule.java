package com.imdadareeph.retailstore.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.imdadareeph.retailstore.dto.CustomerHolder;
import com.imdadareeph.retailstore.service.IRetailStoreService;

/**
 * @author imdadareeph
 *
 */
@Path("/retailStore")
public class RetailStoreModule {

	@Inject
	IRetailStoreService retailService;

	@GET
	@Path("/custData/{customerId}")
	@Produces("application/json")
	public String loadCustomerDetails(@PathParam("customerId") String customerId) {

		CustomerHolder customerHolder = new CustomerHolder();
		Gson gson = new Gson();

		try {
			customerHolder = retailService.loadCustomerDetails(customerId);
			return gson.toJson(customerHolder);
		} catch (Exception exception) {
			customerHolder = new CustomerHolder();
			return gson.toJson(customerHolder);
		}

	}
	
	
	@POST
	@Path("registerUser")
	@Consumes("application/json")
	public String registerNewCustomer(String data) {

		Gson gson = new Gson();
		CustomerHolder customerHolder = gson.fromJson(data, CustomerHolder.class);
		try {
			String status = retailService.registerNewCustomer(customerHolder);
			return status;
		} catch (Exception exception) {
			customerHolder = new CustomerHolder();
			return "Failed";
		}

	}

}
