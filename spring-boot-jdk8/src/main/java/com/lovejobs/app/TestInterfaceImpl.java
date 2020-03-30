package com.lovejobs.app;

import org.springframework.stereotype.Service;

@Service
public class TestInterfaceImpl implements TestInterface {
    @Override
    public void runTest() {
        System.out.println("xinxin");
    }
}
