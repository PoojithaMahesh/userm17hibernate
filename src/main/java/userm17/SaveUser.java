package userm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
public static void main(String[] args) {
	User user=new User();
	user.setName("sunil");
	user.setAddress("Mysore");
	
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(user);
	entityTransaction.commit();
}
}
