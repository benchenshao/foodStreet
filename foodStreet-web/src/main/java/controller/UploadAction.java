package controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
/**
* @author benchenshao
* @create 2017/10/23 11:22
* @desc
*/
/**
 * @author benchenshao
 */
public class UploadAction extends ActionSupport {
    private File picture;
    private String username;
    private String password;

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
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

    @Override
    public String execute() throws Exception {
        String path = ServletActionContext.getServletContext().getRealPath("/images");
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        FileUtils.copyFile(picture, new File(file,username));
        return SUCCESS;
    }
}
