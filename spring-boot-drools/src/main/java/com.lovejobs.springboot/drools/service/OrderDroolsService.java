package com.lovejobs.springboot.drools.service;

import com.lovejobs.springboot.drools.model.Message;
import com.lovejobs.springboot.drools.model.PayOrder;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class OrderDroolsService {


    public PayOrder fireRule(PayOrder payOrder) {
        // load up the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("order-ksession-rules");

        kSession.insert(payOrder);//插入
        int count = kSession.fireAllRules();//执行规则
        System.out.println("执行了 " +count+ "规则");
        kSession.dispose();
        return payOrder;
    }

}
