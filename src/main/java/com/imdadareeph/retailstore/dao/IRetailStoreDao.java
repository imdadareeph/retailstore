package com.imdadareeph.retailstore.dao;

import com.imdadareeph.retailstore.dto.CustomerHolder;
import com.imdadareeph.retailstore.entity.CustomerDetails;

/**
 * @author imdadareeph
 *
 */
public interface IRetailStoreDao {

	String registerNewCustomer(CustomerHolder customerHolder);
	
	CustomerDetails loadCustomerDetails(String customerId);
	
	
}
