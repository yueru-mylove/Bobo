package com.bobo.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class CoreApplication {
    @Autowired
    private GlobalProperties globalProperties;

//    @RequestMapping("/")
//    public String index() {
//        return globalProperties.getTitle();
//    }
//
//    @RequestMapping("/ping")
//    public String ping() {
//        return "ping";
//    }

    @RequestMapping("/")
    public String index(Model m) {
        m.addAttribute("title", globalProperties.getTitle());
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

}
