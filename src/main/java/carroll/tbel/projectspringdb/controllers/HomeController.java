package carroll.tbel.projectspringdb.controllers;

import carroll.tbel.projectspringdb.dataAccess.entity.User;
import carroll.tbel.projectspringdb.dataAccess.entity.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/home"})
public class HomeController {
    private final UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = {"", "/", "/index"})
    public String indexAction(Model view) {
        view.addAttribute("name", "Admin");
        return "home/index";
    }

    @GetMapping(path = {"/list", "/all", "/any"})
    public String listAction() {
        return "home/list";
    }

    @GetMapping(path = {"/edit/{user:[0-9]+}"})
    public String editAction(Model view, @PathVariable("user")User user) {

        view.addAttribute("name", "Admin");

        return "home/index";
    }
}