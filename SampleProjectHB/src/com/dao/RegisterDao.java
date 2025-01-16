package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.configuration.HibernateConfig;
import com.entity.Customer;

public class RegisterDao {

	public boolean register(Customer customer) {
		// ith asto hb cha code database cha
		
		SessionFactory factory =	 HibernateConfig.getSessionFctory();
		Session session=factory.openSession();
		
		session.get(Customer.class, 6);
		session.beginTransaction().commit();//shortcut
		return true;
		
		
		
	}

	public List<Customer> getAllCustomer() {
		SessionFactory factory =	 HibernateConfig.getSessionFctory();
		Session session=factory.openSession();//pratek different kamasathi vegla session
		//all data pahije get fakt ekach data deto
		Criteria criteria = session.createCriteria(Customer.class);
		//ith condition if needed
		
		List<Customer> list= 	criteria.list();//returns collection list
		return list;
	
	}

	public List<Customer> getCustomerByLocation(String location) {
		SessionFactory factory =	 HibernateConfig.getSessionFctory();
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		//criteria.add(Restrictions.lt("mobile", 444444L));//ith int madhe compare kartoy so used L
		criteria.add(Restrictions.eq("location", location));
		List<Customer> list= 	criteria.list();
		return list;
		
		
	}

	public List<Long> maxMobileNumber() {
		SessionFactory factory =	 HibernateConfig.getSessionFctory();
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		
		criteria.setProjection(Projections.max("mobile"));
		List<Long> list= 	criteria.list();//data long madhe yetoy
		return list;
	}

	public List<Long> minMobileNumber() {
		SessionFactory factory =	 HibernateConfig.getSessionFctory();
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		
		criteria.setProjection(Projections.min("mobile"));
		List<Long> list= 	criteria.list();//data long madhe yetoy
		return list;
	}

	public List<Long> avgMobileNumber() {
		SessionFactory factory =	 HibernateConfig.getSessionFctory();
		Session session=factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		
		criteria.setProjection(Projections.avg("mobile"));
		List<Long> list= 	criteria.list();//data long madhe yetoy
		return list;
	}



}
