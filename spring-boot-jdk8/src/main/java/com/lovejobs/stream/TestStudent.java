package com.lovejobs.stream;

import com.alibaba.fastjson.JSONObject;
import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * The type Test student.
 *
 * @author fengxin
 */
public class TestStudent {

    @SneakyThrows
    public static void readStudent(){
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("students.dat"));
        int size = dataInputStream.readInt();
        for (int i =0;i<size;i++){
            Student s = new Student();
            s.setName(dataInputStream.readUTF());
            s.setSecond_name(dataInputStream.readUTF());
            s.setAge(dataInputStream.readInt());
            s.setScore(dataInputStream.readDouble());
            System.out.println(JSONObject.toJSONString(s));
        }
    }

    @SneakyThrows
    public static void writeStudent(List<Student> students){
        @Cleanup
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("students.dat"));
        dataOutputStream.writeInt(students.size());
        for (Student s:students){
            dataOutputStream.writeUTF(s.getName());
            dataOutputStream.writeUTF(s.getSecond_name());
            dataOutputStream.writeInt(s.getAge());
            dataOutputStream.writeDouble(s.getScore());
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student[]{new Student("feng","xin",18,90.4d),new Student("fengxin","xin",19,91.4d)});
        //writeStudent(students);
        readStudent();
    }
}
