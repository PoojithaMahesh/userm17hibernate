package userm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import net.bytebuddy.matcher.ElementMatcher;

public class DeleteUser {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User user=entityManager.find(User.class, 100);
	if(user!=null) {
//		id is present so you can delete the data call remove method
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
	}else {
//		id is not present if you are going to invoke remove method it will give you an exception
		System.out.println("Sorry Id is not present");
	}
}
}
