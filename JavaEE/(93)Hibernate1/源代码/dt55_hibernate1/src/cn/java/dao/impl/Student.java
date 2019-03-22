/**
 * Project Name:dt55_hibernate1
 * File Name:Student.java
 * Package Name:cn.java.dao.impl
 * Date:下午2:25:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

/**
 * Description: <br/>
 * Date: 下午2:25:52 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class Student {
    private Long id;

    private String stuNum;

    private String stuName;

    private String course;

    public Student() {

        super();
        // Auto-generated constructor stub

    }

    public Student(Long id, String stuNum, String stuName, String course) {
        super();
        this.id = id;
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", stuNum=" + stuNum + ", stuName=" + stuName + ", course=" + course + "]";
    }

}
