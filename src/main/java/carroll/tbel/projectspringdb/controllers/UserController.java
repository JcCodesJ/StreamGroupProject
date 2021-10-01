package carroll.tbel.projectspringdb.controllers;


import carroll.tbel.projectspringdb.metier.service.userServ.UserService;
import carroll.tbel.projectspringdb.models.form.UserCreateForm;
import carroll.tbel.projectspringdb.metier.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(path = {"/user"})
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = {"", "/list"})
    public String listAction(Model view) {
        return "user/list";
    }

    @GetMapping(path = {"/register", "/create"})
    public String createAction() {
        return "user/create";
    }

    @PostMapping(path = {"/register", "/create"})
    public String createAction(Model view, @Valid() UserCreateForm form, BindingResult result) {
        if (result.hasErrors()) {
            view.addAttribute("Error", result.getFieldErrors());
        }
        System.out.println(form);

        return "user/create";
    }



}