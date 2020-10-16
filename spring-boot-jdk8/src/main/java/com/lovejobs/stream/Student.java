package com.lovejobs.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fengxin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String second_name;
    private int age;
    private double score;
}
