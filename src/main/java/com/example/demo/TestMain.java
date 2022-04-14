package com.example.demo;

import com.example.demo.profession.Profession;
import com.example.demo.profession.warrior.ManaInject;
import com.example.demo.profession.warrior.Warrior;
import com.example.demo.profession.warrior.Wizard;

public class TestMain {
    public static void main(String[] args) {

        Profession warrior = new Profession(new Warrior(10));


        System.out.println(warrior.damage(10));


    }

}
