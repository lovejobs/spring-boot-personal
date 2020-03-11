package com.lovejobs;

import com.lovejobs.annotation.Feng;
import com.lovejobs.annotation.FengAService;
import com.lovejobs.annotation.FengService;
import com.lovejobs.annotation2.Feng2;
import com.lovejobs.annotation2.FengTypeService;
import com.lovejobs.app.TestApplication;
import com.lovejobs.app.TestInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JDK8Application.class)
public class TestApp {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test(){
        TestApplication testApplication = (TestApplication) applicationContext.getBean("testApplication");
        testApplication.testRUN();

        Map<String,TestInterface> map = applicationContext.getBeansOfType(TestInterface.class);
        map.forEach((s, testInterface) -> {
            testInterface.runTest();
        });
    }

    @Test
    public void testAnnotaion(){
        Map<String, Object> s = applicationContext.getBeansWithAnnotation(Feng.class);
        s.forEach((s1, o) -> {
            if(o instanceof FengService){
                System.out.println(((FengService) o).sayHello("fengxin"));
            }
        });
    }

    @Test
    public void testAnnotaion2(){
        Map<String, Object> s = applicationContext.getBeansWithAnnotation(Feng2.class);
    }


}
