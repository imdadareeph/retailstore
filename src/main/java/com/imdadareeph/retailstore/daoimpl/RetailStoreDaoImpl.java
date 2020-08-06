package com.imdadareeph.retailstore.daoimpl;

import javax.inject.Named;

import com.imdadareeph.retailstore.dao.IRetailStoreDao;
import com.imdadareeph.retailstore.dto.CustomerHolder;
import com.imdadareeph.retailstore.dto.HibernateUtil;
import com.imdadareeph.retailstore.entity.CustomerDetails;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 * @author imdadareeph
 *
 */
@Named
public class RetailStoreDaoImpl implements IRetailStoreDao {


	@Override
	public String registerNewCustomer(CustomerHolder customerHolder) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
				session.beginTransaction();
				CustomerDetails customer = new CustomerDetails();
				customer.setCustomerName(customerHolder.getCustomerName());
				customer.setGender(customerHolder.getGender());
				customer.setAddress(customerHolder.getAddress());
				customer.setCreatedDate(customerHolder.getCreatedDate());
				customer.setEmail(customerHolder.getEmail());
				customer.setTelephone(customerHolder.getTelephone());
				customer.setCustomerType(customerHolder.getCustomerType());
				session.save(customer);
				session.getTransaction().commit();
				return "Success";
		} catch (HibernateException exception) {
			
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			throw exception;
			
		} finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imdadareeph.retailstore.dao.IRetailStoreeDao#loadCustomerDetails(java.lang.String)
	 */
	@Override
	public CustomerDetails loadCustomerDetails(String customerId) {

		CustomerDetails customer = new CustomerDetails();

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
				session.beginTransaction();
				Criteria criteria = session.createCriteria(CustomerDetails.class);
				criteria.add(Restrictions.eq("customerId",Integer.parseInt(customerId)));
				customer = (CustomerDetails) criteria.uniqueResult();
				session.getTransaction().commit();
			
		} catch (Exception exception) {
			customer = new CustomerDetails();
			session.getTransaction().rollback();
			throw exception;
		} finally {
			session.close();
			HibernateUtil.getSessionFactory().close();
		}

		return customer;
	}

}
