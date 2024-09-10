package userm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindUser {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User user=entityManager.find(User.class, 100);
	if(user!=null) {
//		id is present
		System.out.println(user);
	}else {
//		user=null means id is not present
		System.out.println("Sorry Id is not present");
	}
}
}
