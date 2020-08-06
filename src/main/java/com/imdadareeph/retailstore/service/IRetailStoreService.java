package com.imdadareeph.retailstore.service;


import com.imdadareeph.retailstore.dto.CustomerHolder;

/**
 * @author imdadareeph
 *
 */
public interface IRetailStoreService {

    String registerNewCustomer(CustomerHolder customerHolder);

	CustomerHolder loadCustomerDetails(String customerId);

}
