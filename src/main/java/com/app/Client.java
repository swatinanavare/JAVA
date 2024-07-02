package com.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("cust_shop");
EntityManager em=emf.createEntityManager();
em.getTransaction().begin();
Shop shop=new Shop("SNShop");
Customer c1=new Customer("Swati", shop);
Customer c2=new Customer("BHAKTI", shop);
Customer c3=new Customer("Shradha", shop);
em.persist(shop);
em.persist(c3);
em.persist(c2);
em.persist(c1);
em.getTransaction().commit();
em.close();
emf.close();
System.out.println("Sucess");
	}

}