package carroll.tbel.projectspringdb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/session")
public class SessionController {

    @GetMapping(path = "/login")
    public String loginAction(){
        return "session/login";
    }

}
