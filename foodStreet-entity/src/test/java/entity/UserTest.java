package entity;

import org.junit.Test;

public class UserTest {
    @Test
    public void test() {
        User user = new User();
        user.setId(1);
        user.setUsername("pjj");
        //user.setPassword("123456");

        System.out.println(user);
    }
}
