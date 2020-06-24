package model;
import model.Student;
public class Main {

    public static void main(String[] args) {
        Student Ellie = new Student("Ellie","22",'女',26);
        System.out.println("学生姓名为："+Ellie.getStuNames());
        System.out.println("年龄："+Ellie.getStuAge());
        System.out.println("性别："+Ellie.getGender());
        System.out.println("学号："+Ellie.getIdNo());
    }
}
