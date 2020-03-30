package com.lovejobs.factory;

public class InterfaceTestCImpl implements InterfaceTest {
    @Override
    public String getResult(String name) {
        return "C:"+name;
    }
}
