package One_To_One_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mohaseen");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch b = new Branch();
		b.setName("jalahalli");
		b.setState(" kar");
		b.setCountry("india");

		Address a = new Address();
		a.setArea("mathikere");
		a.setLocality("bangloer");
		a.setPincode(560013);
		b.setBid(a);
		et.begin();
		em.persist(b);
		em.persist(a);
		et.commit();
	}
}
