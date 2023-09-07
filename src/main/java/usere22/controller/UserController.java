package usere22.controller;

import java.util.Scanner;

import usere22.dao.UserDao;
import usere22.dto.User;

public class UserController {
public static void main(String[] args) {
	UserDao userDao=new UserDao();
	
	Scanner scanner=new Scanner(System.in);
	boolean condition=true;
	do {
		System.out.println("Press 1. to save the User");
		System.out.println("Press 2 to update the User");
		System.out.println("Press 3 to delete the User");
		System.out.println("Press 4 to select the User");
		System.out.println("Press 5 to exit the application");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:{
//			save the data
			System.out.println("Please enter your id");
			int id=scanner.nextInt();
			System.out.println("Please enter your name");
			String name=scanner.next();
			System.out.println("please enter your address");
			String address=scanner.next();
			User user=new User();
			user.setId(id);
			user.setName(name);
			user.setAddress(address);
			userDao.saveUser(user);
//			inserted successfully
			System.out.println("user data saved succesfully");
			break;
		}
		
		case 2:{
//			update the data
			System.out.println("Please enter your id to be updated");
			int id=scanner.nextInt();
			System.out.println("Please enter your name");
			String name=scanner.next();
			System.out.println("please enter your address");
			
			String address=scanner.next();
			User user=new User();
			user.setName(name);
			user.setAddress(address);
			
			userDao.updateUser(id, user);
			System.out.println("User data updated successfully");

			break;
		}
		
		
		
		
		case 3:{
//			delete the data
			System.out.println("please enter your id to be deleted");
			int id=scanner.nextInt();
			userDao.deleteUser(id);
			System.out.println("user deleted successfully");
			break;
		}
		case 4:{
//			select the data
			System.out.println("please enter your id to be selected");
			int id=scanner.nextInt();
			userDao.selectUser(id);
			System.out.println("user selected successfully");
			break;
		}
		case 5:{
			condition=false;
			System.out.println("THANK YOU VISIT AGAIN!!!!!!!!");
		}
		}
//		switch case
		
	}while(condition);
}
}
