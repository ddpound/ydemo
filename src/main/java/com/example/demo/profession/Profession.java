package com.example.demo.profession;

/// 이게 직업임
public class Profession {


    // 의존성 주입, 아래 행동들이 다 의존성 주입임
    private IProfession iProfession;

    public Profession(IProfession iProfession){
        this.iProfession = iProfession;
    }

    public int damage(int str){
        return  this.iProfession.damage(str);
    }

    public int defense(int def){
        return this.iProfession.defense(def);
    }



}
