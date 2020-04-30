package com.lovejobs;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.dao.AppIdTableDao;
import com.lovejobs.model.AppIdTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class TestJpa {

    @Autowired
    AppIdTableDao appIdTableDao;

    @Test
    public void testQuery(){
        List<AppIdTable> list = appIdTableDao.findAllByAppId("com.lenovo.anyshare.gps");
        System.out.println(JSONObject.toJSONString(list));
    }

}
