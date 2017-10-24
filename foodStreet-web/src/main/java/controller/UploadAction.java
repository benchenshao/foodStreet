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

public class UploadAction extends ActionSupport {
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String result;

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

    @Override
    public String execute() throws Exception {
        String path = ServletActionContext.getServletContext().getRealPath("D://files");
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        FileUtils.copyFile(upload, new File(file,uploadFileName));
        result="上传成功！";
        return SUCCESS;
    }

}
