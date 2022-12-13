package mediumCom.dao;

import mediumCom.model.User;
import mediumCom.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User>userList=new ArrayList<>();

    public void createUser(User user){
        userList.add(user);
    }

    public List<User> findAllUsers(){
        return userList;
    }

}
