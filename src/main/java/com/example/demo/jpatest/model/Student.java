package com.example.demo.jpatest.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


// @Table // 보통 테이블 이름을 정하기위해 쓰는 어노테이션이다

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "StudentEntity")
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "column_student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(name = "columnname")
    private String name;

    @Column(name = "column_gender")
    private String gender;

    @Column(name = "column_age")
    private int age;

    @Column(name = "column_grade")
    private String grade;

    @JoinColumn(name = "student_class")
    // 하나의 클래스가 여러 학생들을 가지기 때문에 ManyToOne 이다
    // 현재 여기있는 코드입장으로 학생 - 반 때문에 Many to One입니다.
    @ManyToOne
    private StudentClass studentClasss;

    // 학생들은 보통 각자 반이 지정되어있다 연관관계





}
