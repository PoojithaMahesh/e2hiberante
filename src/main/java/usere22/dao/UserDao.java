package usere22.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import usere22.dto.User;

public class UserDao {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	

	public void saveUser(User user) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}
	
	public void updateUser(int id,User user) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User dbUser=entityManager.find(User.class, id);
		
		if(dbUser!=null) {
//			id is present
			entityTransaction.begin();
			user.setId(id);
			entityManager.merge(user);
			entityTransaction.commit();
			
			
		}else{
//			id is not present
			System.out.println("sorry id is not present");
		}
	
	}
	
	
	
	
	
	
	public void selectUser(int id) {
		EntityManager entityManager=getEntityManager();
		User dbUser=entityManager.find(User.class, id);
		if(dbUser!=null) {
//			id is present
			System.out.println(dbUser);
			
		}else {
//			id is not present
			System.out.println("sorry id is not present");
		}
	}
	
	public void deleteUser(int id) {
		EntityManager entityManager=getEntityManager();
		User dbUser=entityManager.find(User.class, id);
		if(dbUser!=null) {
//			id is present
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(dbUser);
		entityTransaction.commit();
			
		}else {
//			id is not present
			System.out.println("sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
}
