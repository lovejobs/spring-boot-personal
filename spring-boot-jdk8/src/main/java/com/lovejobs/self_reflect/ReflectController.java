package com.lovejobs.self_reflect;

public class ReflectController {

    public ReflectService getReflectService() {
        return reflectService;
    }

    @SelfReflect
    ReflectService reflectService;
}
