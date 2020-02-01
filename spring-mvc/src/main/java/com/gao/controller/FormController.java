package com.gao.controller;

import com.gao.bean.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-07 13:49
 * ​
 **/
@Controller
public class FormController {
    @RequestMapping("/teacher")
    public ModelAndView teacher(){
        return new ModelAndView("teacher", "commont", new Teacher());
    }

    @RequestMapping("/addTeacher")
    public String addTeacher(@ModelAttribute("SpringWeb")Teacher teacher, ModelMap modelMap){
        modelMap.addAttribute("name", teacher.getName());
        modelMap.addAttribute("age", teacher.getAge());
        modelMap.addAttribute("address", teacher.getAddress());
        return "teacher-show";
    }
}
