package com.app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.domain.Patient;

public class PatientDao {
	public void addUserDetails(String pName, String age, String bloodGroop) {
		try {

			Configuration configuration = new Configuration().configure("/com/app/resourses/hibernate.cfg.xml");

			SessionFactory sessionFactory = configuration.buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			Patient pt = new Patient();
			pt.setpName(pName);
			pt.setAge(age);
			pt.setBloodGroop(bloodGroop);

			session.save(pt);
			transaction.commit();
			System.out.println("\n\n Details Added \n");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

}
