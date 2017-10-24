package dao;

import entity.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void registerTest() {
        UserDao userDao = new UserDao();
        User user1 = new User();
        user1.setUsername("zss");
        user1.setPassword("123456");
        user1.setPhone("1597536842");
        User user2 = new User();
        user2.setUsername("lss");
        user2.setPassword("123456");
        user2.setPhone("12345678910");

        //userDao.register(user);
    }
}
