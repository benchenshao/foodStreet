package service;

import dao.UserDao;
import entity.User;
/**
* @author benchenshao
* @create 2017/10/24 19:38
* @desc
*/
public class UserService {
    UserDao userDao = new UserDao();
    public void register(User user) {
        userDao.register(user);
    }

    public boolean login(String username, String password) {
        return userDao.login(username,password);
    }
}
