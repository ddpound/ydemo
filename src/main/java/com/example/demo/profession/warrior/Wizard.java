package com.example.demo.profession.warrior;

import com.example.demo.profession.IProfession;

public class Wizard implements IProfession {

    private String name;
    private int level;
    //각 직업별 고유 stat
    private int stat;
    private int mana;

    // 의존성 주입
    private ManaInject manaInject;

    // 의존성 주입
    public Wizard(int level , ManaInject manaInject){
        this.level = level;
        this.name = "wizard";
        this.stat = 5;
        this.manaInject = manaInject;
    }

    // Wizard는 mana가 필요한 특수 직업
    // Damage가 mana량에또한 비례
    public void mana(){
        this.mana = manaInject.getMana();
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
        return str *this.stat * this.level * this.mana;
    }

    @Override
    public int defense(int def) {
        return def + this.level + this.stat;
    }
}
