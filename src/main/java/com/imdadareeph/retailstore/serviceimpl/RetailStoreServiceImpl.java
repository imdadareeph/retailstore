package com.imdadareeph.retailstore.serviceimpl;

import com.imdadareeph.retailstore.dao.IRetailStoreDao;
import com.imdadareeph.retailstore.dto.CustomerHolder;
import com.imdadareeph.retailstore.entity.CustomerDetails;
import com.imdadareeph.retailstore.service.IRetailStoreService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author imdadareeph
 *
 */

@Named
public class RetailStoreServiceImpl implements IRetailStoreService {

	@Inject
	IRetailStoreDao retailDao;

	@Override
	public String registerNewCustomer(CustomerHolder customerHolder) {

		return retailDao.registerNewCustomer(customerHolder);

	}

	@Override
	public CustomerHolder loadCustomerDetails(String customerId) {

		CustomerHolder customerHolder = new CustomerHolder();

		CustomerDetails customer = retailDao.loadCustomerDetails(customerId);

		if (null != customer) {

			customerHolder.setCustomerId(String.valueOf(customer.getCustomerId()));
			customerHolder.setCustomerName(customer.getCustomerName());
			customerHolder.setGender(customer.getGender());
			customerHolder.setAddress(customer.getAddress());
			customerHolder.setEmail(customer.getEmail());
			customerHolder.setTelephone(customer.getTelephone());
			customerHolder.setCustomerType(customer.getCustomerType());
			customerHolder.setCreatedDate(customer.getCreatedDate());

		}

		return customerHolder;
	}

}
