package com.trash.HackathonDetection.LogicDomain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@CrossOrigin(origins = "http://localhost:65535/predict")
@Controller
public class DetectionController {

    @GetMapping("")
    public String homePage() {

        return "index_v2.html";
    }
    @PostMapping("")
    public String formPost() {
        return "post";
    }

}
