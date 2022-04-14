package com.example.demo.profession;

public interface IProfession {

    // 정해진 직업 이름 가져옴
    String getName();

    // stat능력와 레벨에 따라서  trueDamage가 결정
    void setLelvel(int level);

    // level * str * 고유 스텟 임
    int damage(int str);

    // 방어력은 str+level + 고유 스텟 임
    int defense(int def);


}
