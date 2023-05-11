package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class myappController {
    @GetMapping("/getMessage")
    public String getMessage(){
        return "Welcome to Springboot demo";
    }
    @GetMapping("/getMessage/{id}")
    public String getMessage(@PathVariable Long id){
        return "welcome to demo"+id;
    }

    @GetMapping("/getDetails")
    public String getDetails(){
        return "welcome to Details";
    }
}
