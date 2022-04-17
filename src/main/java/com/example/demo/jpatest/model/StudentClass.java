package com.example.demo.jpatest.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 암시적 명명법 사용

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classid;

    // 컬럼은 보통 암시적일때는 생략해도 상관 없다
    // colunm생략

    // 사과반, 병아리반 이라고 이름을 지어보자
    private String name;




}
