package controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
* @author benchenshao
* @create 2017/10/23 19:17
* @desc
*/
public class DownloadAction extends ActionSupport {
    public String inputPath;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String filename;

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public InputStream getInputStream() throws IOException {
        String path = ServletActionContext.getServletContext().getRealPath("/images");
        String filepath = path + "\\" + filename ;
        File file = new File(filepath);

        return FileUtils.openInputStream(file);
//        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }

    public String getDownloadFileName() {
        String downloadFileName = "";
        try {
            downloadFileName = URLEncoder.encode("本辰少.jpg","UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return downloadFileName;

        //return "本辰少.jpg";
    }
}
