package emlakcepte.dao;

import java.util.ArrayList;
import java.util.List;

import emlakcepte.model.User;

public class UserDao {
	
	private static List<User> userList = new ArrayList<>();
	private static UserDao userDao;

	private UserDao() {
	}

	public static UserDao getInstance(){
		if (userDao==null){
			userDao=new UserDao();
		}
		return userDao;
	}
	public void createUser(User user) {
		userList.add(user);
	}
	
	public List<User> findAllUsers() {	
		return userList;
	}

}
