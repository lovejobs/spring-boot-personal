package com.lovejobs.springboot;

import org.assertj.core.error.ShouldBeAfterYear;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.misc.Launcher;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassLoader {

    @Test
    public void testClassloader(){

        ClassLoader classLoader = TestClassLoader.class.getClassLoader();
        while (classLoader != null){
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }
        System.out.println(classLoader);
    }

    @Test
    public void testClassLoaderUrls(){
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url: urls) {
            System.out.println(url.toExternalForm());
        }

    }
}
