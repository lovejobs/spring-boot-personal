package com.lovejobs.springboot;

import com.lovejobs.springboot.drools.enums.PayOrderStatus;
import com.lovejobs.springboot.drools.model.PayOrder;
import com.lovejobs.springboot.drools.service.DroolsService;
import com.lovejobs.springboot.drools.service.OrderDroolsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DroolsApplication.class)
public class TestDroolsApplication {

    @Autowired
    ApplicationContext context;

    @Autowired
    DroolsService droolsService;

    @Autowired
    OrderDroolsService orderDroolsService;



    @Test
    public void test(){
        System.out.println("result is :"+droolsService.fireRule());
    }

    @Test
    public void testOrderRule(){
        PayOrder payOrder = new PayOrder();
        payOrder.setPaymentType("P2P");
        payOrder.setTransactionType("PAY");
        payOrder.setPayChannelCode("YESBANK");
        System.out.println("result is :"+orderDroolsService.fireRule(payOrder));
    }
}
