package userm17;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUser {
public static void main(String[] args) {
	User user=new User();
	user.setName("Pooj");
	user.setAddress("Mysore");
	
	System.out.println("Please enter id to be updated");
	int id=1000;
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pooji");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, id);
	if(dbUser!=null) {
//		id is present in the database so if im going to call merge method then it will update the data
//		it wont insert the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		user.setId(id);
		entityManager.merge(user);
		entityTransaction.commit();
	}else {
//		id is not present
//		if im going to call merge method then it will insert the datat
//		intelligent me is not going to call merge method
		System.out.println("Sorry Id is not present");
	}
	
}
}
