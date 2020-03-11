package com.lovejobs.annotation2;

import com.lovejobs.annotation.Feng;
import org.springframework.stereotype.Service;

@Service
@Feng2(fengTypes = FengType.B)
public class FengTypeBService implements FengTypeService {
    @Override
    public String sayHello(String name) {
        return "Hello B:"+name;
    }
}
