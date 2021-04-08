package com.lovejobs.interview.frame;

import com.alibaba.fastjson.JSONObject;
import lombok.var;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Component
public class InterviewBean implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        this.initConfig();
        if(ObjectUtils.isEmpty(this.context)){
            System.out.println("context is null");
        }else{
            System.out.println("context is not null");
        }
    }

    private void initConfig(){
        String[] beanNames = context.getBeanNamesForType(AbstractConfig.class);
        for (String name:beanNames) {
            AbstractConfig abstractConfig =  context.getBean(name, AbstractConfig.class);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name","fengxin");
            jsonObject.put("age",12);
            Class aClass = this.getSuperClassGenricType(abstractConfig.getClass(), 0);

            System.out.println("+++++++++++++++++++++++");
            System.out.println(aClass);
            abstractConfig.onMessage(jsonObject.toJSONString());
        }
    }

    private  Class getSuperClassGenricType(Class clazz, int index) {
        Type genType = clazz.getGenericSuperclass();
        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        } else {
            Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
            if (index < params.length && index >= 0) {
                if (!(params[index] instanceof Class)) {
                    return Object.class;
                } else {
                    return (Class)params[index];
                }
            } else {
                return Object.class;
            }
        }
    }
}
