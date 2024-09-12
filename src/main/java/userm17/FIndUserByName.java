package userm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FIndUserByName {
public static void main(String[] args) {
	String name="PoojithaJM";
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query=entityManager.createQuery("Select u from User u where u.name=?1");
	query.setParameter(1, name);
	
	
//	inside this query only we are having a result
	
	User user=(User) query.getSingleResult();
	
	System.out.println(user);
	
}
}
