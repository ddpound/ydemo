package com.example.demo.jpatest.model;


import javax.persistence.*;

@Entity(name = "StudentEntity")
// @Table // 보통 테이블 이름을 정하기위해 쓰는 어노테이션이다
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "column_student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(name = "columnname")
    private String name;

}
