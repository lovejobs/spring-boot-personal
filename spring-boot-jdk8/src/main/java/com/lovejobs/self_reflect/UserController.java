package com.lovejobs.self_reflect;

public class UserController {

    @SelfReflect
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
