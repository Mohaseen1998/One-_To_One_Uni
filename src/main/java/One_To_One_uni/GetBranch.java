package One_To_One_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBranch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mohaseen");
		EntityManager em = emf.createEntityManager();
		Branch b = em.find(Branch.class, 1);
		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getState());
		System.out.println(b.getCountry());
		Address a = b.getBid();
		System.out.println(a.getArea());
		System.out.println(a.getLocality());
		System.out.println(a.getPincode());
	}
}
