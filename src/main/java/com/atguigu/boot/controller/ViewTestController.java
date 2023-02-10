package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangshihao
 * @create 2023-02-10 20:51
 */
@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model) {
        // model中的数据会被放在请求域中 request.addAttribute("a", aa)
        model.addAttribute("msg", "你好，atguigu");
        model.addAttribute("link", "https://wwww.baidu.com");
        return "success";
    }
}
