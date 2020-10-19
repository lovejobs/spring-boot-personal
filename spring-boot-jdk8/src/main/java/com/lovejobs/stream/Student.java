package com.lovejobs.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @author fengxin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 7814874347385652121L;

    private String name;
    private String second_name;
    private int age;
    private double score;
}
