package com.jbk.git.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.git.entity.Product;

public class HibernateConfig {
	private static SessionFactory sessionfacory = null;

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure().addAnnotatedClass(Product.class);
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		return sessionfactory;

	}

}
