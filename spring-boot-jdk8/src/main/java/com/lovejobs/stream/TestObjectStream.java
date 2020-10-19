package com.lovejobs.stream;

import com.alibaba.fastjson.JSONObject;
import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Test object stream.
 *
 * @author fengxin
 */
public class TestObjectStream {

    @SneakyThrows
    public static void writeStudents(List<Student> students){
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("SutdentOutputStream.dat")));
        objectOutputStream.writeInt(students.size());
        for (Student s:students) {
            objectOutputStream.writeObject(s);
        }
        objectOutputStream.close();
    }

    @SneakyThrows
    public static void readStudents(){
        ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SutdentOutputStream.dat")));
        int site = objectInputStream.readInt();
        List<Student> list = new ArrayList<>(site);
        for (int i =0;i<site;i++){
            list.add((Student) objectInputStream.readObject());
        }
        System.out.println(JSONObject.toJSONString(list));
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student[]{new Student("feng","xin",18,90.4d),new Student("fengxin","xin",19,91.4d)});
        //writeStudents(students);
        readStudents();
    }
}
