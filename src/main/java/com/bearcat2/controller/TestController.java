package com.bearcat2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p> Description: springboot jsp 测试程序 </p>
 * <p> Title: TestController </p>
 * <p> Create Time: 2019/7/3 21:40 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("hello", "welcome to springboot jsp");
        return "test";
    }
}
