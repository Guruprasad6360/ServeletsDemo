package com.hibernatehelloworld1;
import org.hibernate.Session;


import com.hibernatehelloworld.domain.Message;
import com.hibernatehelloworld.utils.HibernatesUtils;
public class HibernateDemo {
	public static void main(String[] args) {
   	Session session = HibernatesUtils.getSessionFactory().openSession();
   	session.beginTransaction();
   	Message message = new Message("hello from Hibernate");
   	session.save(message);
   	session.getTransaction().commit();
   	session.close();
 }
}
