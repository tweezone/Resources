/**
 * Project Name:dt55_hibernate1
 * File Name:StudentDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:下午2:27:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

/**
 * Description: <br/>
 * Date: 下午2:27:31 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class StudentDaoImpl {
    private Session session = null;

    @Before
    public void init() {
        // Session对象---->SessionFactory对象---->Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        session = sessionFactory.openSession();
    }

    /**
     * 
     * Description: 通过hibernate方法查询所有<br/>
     *
     * @author 丁鹏
     */
    @Test
    public void selectAll() {
        // 查询所有数据
        Criteria c = session.createCriteria(Student.class);
        List<Student> stuList = c.list();
        System.out.println(stuList);
    }

    /**
     * 添加数据
     */
    @Test
    public void addStudent() {
        // 开启事务
        Transaction tx = session.beginTransaction();
        Student student = new Student(null, "103", "张三", "mybatis");
        Serializable flag = session.save(student);
        System.out.println("flag=" + flag);
        // 结束事务
        tx.commit();
    }

    /**
     * 修改数据
     */
    @Test
    public void updateStudent() {
        // 开启事务
        Transaction tx = session.beginTransaction();
        Student student = new Student(3L, "103", "张三", "ps");
        // Serializable flag = session.save(student);
        session.update(student);
        // 结束事务
        tx.commit();
    }

    /**
     * 删除指定id的数据:id=1L
     */
    @Test
    public void deleteStudentById() {
        // 开启事务
        Transaction tx = session.beginTransaction();
        Student student = new Student(1L, null, null, null);
        // Serializable flag = session.save(student);
        session.delete(student);
        // 结束事务
        tx.commit();
    }

    // --------------------------------------------------------
    @Test
    public void getStudentById() {
        String hql = "select new Student(id,stuNum,stuName,course) from Student where id=?";
        Query query = session.createQuery(hql);
        query.setParameter(0, 2L);
        Student stu = (Student) query.uniqueResult();
        System.out.println(stu);
    }

    @Test
    public void getStudent() {
        // select * from students;
        // String hql = "select new Student(id,stuNum,stuName,course) from
        // Student";
        String hql = "from Student";
        Query query = session.createQuery(hql);
        List<Student> stuList = query.list();
        System.out.println(stuList);
    }

    //
    @Test
    public void getStudentMap() {
        String hql = "SELECT new Map(id,stuNum,stuName,course) FROM Student WHERE id=2";
        Query query = session.createQuery(hql);
        Map<String, Object> map = (Map<String, Object>) query.uniqueResult();
        System.out.println(map);
    }

    @Test
    public void getStudentList() {
        // select * from students;
        String hql = "SELECT new Map(id,stuNum,stuName,course) FROM Student";
        Query query = session.createQuery(hql);
        List<Map<String, Object>> stuList = query.list();
        System.out.println(stuList);
    }

    @Test
    public void updateStudentById() {
        // select * from students;
        Transaction tx = session.beginTransaction();
        String hql = "UPDATE Student SET stuNum=255 WHERE id=3";
        Query query = session.createQuery(hql);
        int flag = query.executeUpdate();
        tx.commit();
        System.out.println("flag=" + flag);
    }

}
