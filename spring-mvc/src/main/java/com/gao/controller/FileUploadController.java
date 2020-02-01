package com.gao.controller;

import com.gao.bean.Users;
import org.springframework.stereotype.Controller;
import java.io.File;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-06 20:41
 * ​
 **/
@Controller
public class FileUploadController {



        @RequestMapping(value = "/upload", method = RequestMethod.POST)
        private String fildUpload(Users users, @RequestParam(value = "file", required = false) MultipartFile file,
                                  HttpServletRequest request) throws Exception {
            //基本表单
            System.out.println(users.toString());

            //获得物理路径webapp所在路径
            String pathRoot = request.getSession().getServletContext().getRealPath("");
            String path = "";
            if (!file.isEmpty()) {
                //生成uuid作为文件名称
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                //获得文件类型（可以判断如果不是图片，禁止上传）
                String contentType = file.getContentType();
                //获得文件后缀名称
                String imageName = contentType.substring(contentType.indexOf("/") + 1);
                path = "/static/images/" + uuid + "." + imageName;
                file.transferTo(new File(pathRoot + path));
            }
            System.out.println(path);
            request.setAttribute("imagesPath", path);
            return "success";
        }

        //因为我的JSP在WEB-INF目录下面，浏览器无法直接访问
        @RequestMapping(value = "/forward")
        private String forward() {
            return "login";
        }
    }

