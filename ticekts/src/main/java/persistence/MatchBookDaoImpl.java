package com.matchBook.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.matchBook.entity.USER;

public class MatchBookDaoImpl implements MatchBookDao {

	private StandardServiceRegistry ssr;
	private Metadata meta;
	private SessionFactory factory;

	public MatchBookDaoImpl() {
		ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		meta = new MetadataSources(ssr).getMetadataBuilder().build();

		factory = meta.getSessionFactoryBuilder().build();

	}
	
	public boolean insertUser(USER user) {

		Session session = null;
		Transaction tr = null;
		try {
			session = factory.openSession();
			tr = session.beginTransaction();

			session.save(user);

			tr.commit();

		} catch (Exception ex) {
			tr.rollback();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

}
