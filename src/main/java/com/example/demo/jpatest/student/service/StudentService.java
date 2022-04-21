package com.example.demo.jpatest.student.service;

import com.example.demo.jpatest.model.Student;
import com.example.demo.jpatest.model.StudentClass;
import com.example.demo.jpatest.repository.SDClassRespository;
import com.example.demo.jpatest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SDClassRespository sdClassRespository;


    @Transactional
    public int insertStudent(Student student){


        try {
            studentRepository.save(student);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @Transactional
    public int insertStudentClass(StudentClass studentClass){


        try {
            sdClassRespository.save(studentClass);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }

    }

    @Transactional
    public int updateStudent(Student student){
        // 1차 캐시의 영속화
        // 영속성 컨텍스트가 관리 시작
        Student findStudent =
                studentRepository.findById(student.getStudentId()).orElseThrow(()->{
                    return new IllegalArgumentException("학생을 찾을수 없음");
                });

        //순수 인트는 null값을 체크할수 없다 그러니 Integer 클래스를 통해 null값체크를 한다
        Integer checkAge = student.getAge();

        // 그냥 다 받으면 널값으로 수정할수 있으니 체크
        if(student.getGrade() != null && checkAge != null){
            findStudent.setStudentClasss(student.getStudentClasss());
            findStudent.setGrade(student.getGrade());
            findStudent.setAge(student.getAge());
        }
        // 트랜잭션이 끝나면 순차적으로 flush 해준다
        // 위의 set을  변경감지, 더티체킹한다
        // save없이도 수정이 가능한 것이다

        return 1;
    }


}
