package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("rest/hello")
@RestController
public class Controller {

    @GetMapping("all")
    public String  hello(){

        return "hello youtube";
    }

    @GetMapping("secured/all")
    public String securedHello(){
        return "secured hello";
    }

}
