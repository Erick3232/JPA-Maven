package application;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;
import dominio.Sellers;

public class Program {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Carlos", "carlos@hotmail.com", 1199748942, new Date(),236911321,4000.0,"Tecnology" );
		Pessoa p2 = new Pessoa(null, "Bob", "bob@hotmail.com", 112687921, new Date(),236911321,4000.0,"Industrial" );
		Pessoa p3 = new Pessoa(null, "Josh", "josh@hotmail.com", 112843223, new Date(),236911321,4000.0,"Mechanical" );
		
		Sellers s1 = new Sellers(null, "Carlos", "Candy", 10.99,new Date(),"Industrial");
		Sellers s2 = new Sellers(null, "Ezquel", "Automobilitcs", 200.00,new Date(),"Industrial");
		Sellers s3 = new Sellers(null, "Tony", "Computers", 2500.99,new Date(),"Tecnology");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		
		em.getTransaction().commit();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Sucess!");
		
		em.close();
		emf.close();
	}
}
