package carroll.tbel.projectspringdb.controllers;


import carroll.tbel.projectspringdb.dataAccess.entity.User;
import carroll.tbel.projectspringdb.metier.service.userServ.UserService;
import carroll.tbel.projectspringdb.models.form.UserCreateForm;
import carroll.tbel.projectspringdb.metier.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = {"", "/list"}, name = "user_list")
    public String listAction(Model view) {
        view.addAttribute("users", userService.findAll());
        return "user/list";
    }

    @GetMapping(path = {"/register", "/create"}, name = "user_create")
    public String createAction() {
        return "user/create";
    }

    @PostMapping(path = {"/register", "/create"}, name = "user_create_post")
    public String createAction(Model view, @Valid() UserCreateForm form, BindingResult result) {
        if (result.hasErrors()) {
            view.addAttribute("errors", result.getFieldErrors());
            return "user/create";
        }
        User user = form.mapToUser();
        userService.insert(user);

        return "redirect:/user/list";
    }

    @PostMapping(path = {"/edit/{user:[0-9]+}"})
    public String editAction(Model view, @PathVariable("user") User user) {
        view.addAttribute("user", user);

        return "user/edit";
    }

    @PostMapping(path = {"/edit/{id:[0-9]+}"})
    public String editAction(Model view, @PathVariable("id") long id, @Valid UserCreateForm form) {
        User updated = form.mapToUser();
        userService.updateOne(id, updated);
        return "redirect:/user/list";
    }

    @GetMapping(path = {"/delete/{id:[0-9]+}"})
    public String deleteAction(@PathVariable("id") long id) {
        userService.deleteOne(id);

        return "redirect:/user/list";
    }
}