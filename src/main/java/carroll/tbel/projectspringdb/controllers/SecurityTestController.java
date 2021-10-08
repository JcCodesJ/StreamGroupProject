package carroll.tbel.projectspringdb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class SecurityTestController {

    @GetMapping("/noauth")
    public String noAuthAction(){
        return "security/noauth";
    }

    @GetMapping("/auth")
    public String AuthAction(){
        return "security/auth";
    }

    @GetMapping("/user")
    public String userAction(){
        return "security/user";
    }

    @GetMapping("/admin")
    public String adminAction(){
        return "security/admin";
    }

}
