package com.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

public final class  HibernateConfig {
	
	private HibernateConfig(){
		
	}

	public static SessionFactory getSessionFctory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
}
