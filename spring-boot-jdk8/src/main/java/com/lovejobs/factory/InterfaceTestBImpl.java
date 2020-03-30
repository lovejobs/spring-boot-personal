package com.lovejobs.factory;

public class InterfaceTestBImpl implements InterfaceTest {
    @Override
    public String getResult(String name) {
        return "B:"+name;
    }
}
