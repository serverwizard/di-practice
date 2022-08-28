package org.example;

import org.example.annotation.Controller;
import org.example.annotation.Inject;

@Controller
public class UserController {

    private UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}
