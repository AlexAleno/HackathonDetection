package com.trash.HackathonDetection.LogicDomain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DetectionController {


    @GetMapping("")
    public String homePage() {

        return "index.html";
    }
    @PostMapping("")
    public String formPost() {
        return "post";
    }

}
