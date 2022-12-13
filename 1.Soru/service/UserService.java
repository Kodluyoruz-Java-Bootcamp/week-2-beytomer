package mediumCom.service;

import mediumCom.dao.UserDao;
import mediumCom.model.Story;
import mediumCom.model.User;

import java.util.List;

public class UserService {

    private UserDao userDao=new UserDao();

    public UserService() {
    }

    public void createUser(User user){
        userDao.createUser(user);
    }

    public List<User>getAllUser(){
        return userDao.findAllUsers();
    }

}
