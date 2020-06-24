package model;

public class Student {
    public String stuNames;
    public String stuAge;
    public char gender;
    public int idNo;

    public Student(String stuNames, String stuAge, char gender, int idNo) {
        this.stuNames = stuNames;
        this.stuAge = stuAge;
        this.gender = gender;
        this.idNo = idNo;
    }

    public String getStuNames() {
        return stuNames;
    }

    public void setStuNames(String stuNames) {
        this.stuNames = stuNames;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }
}
