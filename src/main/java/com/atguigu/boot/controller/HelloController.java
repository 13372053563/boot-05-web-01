package com.atguigu.boot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangshihao
 * @create 2023-01-28 20:24
 */
@RestController
public class HelloController {
    @RequestMapping("/pic")
    public String hello() {
        // request
        return "aaaa";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser() {
        return "GET-张三";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping("/user")
    public String saveUser() {
        return "POST-张三";
    }


    // @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser() {
        return "PUT-张三";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    @DeleteMapping("/user")
    public String deleteUser() {
        return "DELETE-张三";
    }


/*     @Bean
    @ConditionalOnMissingBean(HiddenHttpMethodFilter.class)
    @ConditionalOnProperty(prefix = "spring.mvc.hiddenmethod.filter", name = "enabled", matchIfMissing = false)
    public OrderedHiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new OrderedHiddenHttpMethodFilter();
    }


    //自定义filter
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    } */
}
