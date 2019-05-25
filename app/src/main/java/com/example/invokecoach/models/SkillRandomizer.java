package com.example.invokecoach.models;

import com.example.invokecoach.database.SkillsBase;

import java.util.Random;

public class SkillRandomizer {

    public static Skill getRandomSkill(){
        return SkillsBase.values()[new Random().nextInt(SkillsBase.values().length)].getSkill();
    }
}
