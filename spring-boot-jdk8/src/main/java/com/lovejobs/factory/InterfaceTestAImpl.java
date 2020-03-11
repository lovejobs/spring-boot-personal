package com.lovejobs.factory;

public class InterfaceTestAImpl implements InterfaceTest {
    @Override
    public String getResult(String name) {
        return "A:"+name;
    }
}
