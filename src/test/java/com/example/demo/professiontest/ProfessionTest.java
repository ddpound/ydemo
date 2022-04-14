package com.example.demo.professiontest;


import com.example.demo.profession.Profession;
import com.example.demo.profession.warrior.ManaInject;
import com.example.demo.profession.warrior.Warrior;
import com.example.demo.profession.warrior.Wizard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// 목킨 처리

// 직접 만든 테스트
@ExtendWith({MockitoExtension.class})
public class ProfessionTest {

    @Mock
    public ManaInject mockManaInject;

    // 이게 무슨 소리냐면 mock 처리를 통해서
    // 해당 getMana() 메소드의 고정값 30을 내가 원하는 값으로 바꿔줄수 있다.
    @BeforeEach
    public void mana(){
        Mockito.lenient().when(mockManaInject.getMana()).thenReturn(10);
    }

    @Test
    public void printTest(){
        System.out.println("helloWorld");
    }

    // 단위테스트는 반드시 실행해야한다.
    // 내가 어떤 단위의 서비스를 만들었을때 이렇게 만들어 놓는다.
    @Test
    public void professionTest(){
        // Profession 게임 직업으로 할 예정

        Profession warrior = new Profession(new Warrior(20));

        Assertions.assertEquals(1000 , warrior.damage(10));

        // wizard를 위한 클래스
        ManaInject manaInject = new ManaInject();

        Wizard wizard = new Wizard(10, manaInject);
        wizard.mana();

        // 예상치
        Assertions.assertEquals(15000 , wizard.damage(10));
        Assertions.assertEquals(2000, warrior.damage(10));
        //Assertions.assertEquals(2001, warrior.damage(10));
    }

    // mock 테스트
    @Test
    public void mockManaTest(){

        // wizard를 위한 클래스
        ManaInject mockManaInject = this.mockManaInject;

        Wizard mockWizard = new Wizard(10, mockManaInject);
        mockWizard.mana();

        Assertions.assertEquals(5000 , mockWizard.damage(10));

        // wizard를 위한 클래스
        ManaInject manaInject = new ManaInject();
        Wizard wizard = new Wizard(10, manaInject);
        wizard.mana();

        Assertions.assertEquals(15000, wizard.damage(10));

    }



}
