package com.example.invokecoach.models;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainSkillsModel {
    private Queue<String> userSpheres;
    private Skill taskSkill;

    public MainSkillsModel() {
        this.userSpheres = new ArrayDeque<>();
        setNewTaskSkill();
    }

    public void setNewTaskSkill(){
        taskSkill = SkillRandomizer.getRandomSkill();
    }

    public Skill getTaskSkill(){
        return taskSkill;
    }

    public void addSphere(String sphere) {
        if(userSpheres.size() == 3)
            userSpheres.poll();
        userSpheres.add(sphere);
    }

    public String getCastSkill(){

        /*
        PriorityQueue<String> sortUserSpheres = new PriorityQueue<>(userSpheres);

        StringBuilder builder = new StringBuilder();

        for(String sphere: sortUserSpheres)
            builder.append(sphere);

        return builder.toString();
        */
        StringBuilder builder = new StringBuilder();

        for(String sphere: userSpheres)
            builder.append(sphere);

        char[] array = builder.toString().toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public boolean equalsSkills(){
        return taskSkill.getCastCombo().equals(getCastSkill());
    }
}
