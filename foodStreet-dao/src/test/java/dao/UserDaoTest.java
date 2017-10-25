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

        userDao.register(user1);

    }
}
