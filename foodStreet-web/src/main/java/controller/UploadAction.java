package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import dao.UserDao;
import entity.User;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import service.UserService;

import java.io.File;
/**
* @author benchenshao
* @create 2017/10/23 11:22
* @desc
*/

public class UploadAction extends ActionSupport {
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String result;

    private String username;
    private String password;
    private String paasword1;
    private String phone;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

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

    public String getPaasword1() {
        return paasword1;
    }

    public void setPaasword1(String paasword1) {
        this.paasword1 = paasword1;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    User user = new User();
    UserService userService = new UserService();

    @Override
    public String execute() throws Exception {
        String path = ServletActionContext.getServletContext().getRealPath("/images");
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        FileUtils.copyFile(upload, new File(file,uploadFileName));
        result="上传成功！";
        return SUCCESS;
    }

    public String register() {
        System.out.println("---register---");

        user.setUsername(username);
        user.setPassword(password);
        user.setPassword(phone);
        ValueStack vs = ActionContext.getContext().getValueStack();
        vs.set("username",username);
        userService.register(user);

        return "register";
    }

}
