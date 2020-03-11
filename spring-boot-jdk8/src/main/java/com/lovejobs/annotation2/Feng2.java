package com.lovejobs.annotation2;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Feng2 {

    FengType fengTypes();
}
