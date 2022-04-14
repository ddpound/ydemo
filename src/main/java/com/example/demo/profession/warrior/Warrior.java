package com.example.demo.profession.warrior;

import com.example.demo.profession.IProfession;

public class Warrior implements IProfession {

    private String name;
    private int level;
    //각 직업별 고유 stat
    private int stat;

    public Warrior(int setLevel){
        this.level = setLevel;
        this.name = "warrior";
        this.stat = 10;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setLelvel(int level) {
        this.level = level;
    }

    @Override
    public int damage(int str) {
        return this.level * this.stat * str;
    }

    @Override
    public int defense(int def) {
        return this.level + this.stat + def;
    }
}
