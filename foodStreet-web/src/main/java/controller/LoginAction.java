package controller;

import com.opensymphony.xwork2.ActionSupport;
import service.UserService;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    UserService userService = new UserService();

    @Override
    public String execute() throws Exception {
        boolean b = userService.login(username,password);
        if (b==true) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }
}
