package com.example.invokecoach.presenters;

import com.example.invokecoach.IMainView;
import com.example.invokecoach.models.MainSkillsModel;

public class MainPresenter {

    private MainSkillsModel model;
    private IMainView mainView;

    public MainPresenter(IMainView view) {
        this.mainView = view;
        model = new MainSkillsModel();
    }

    public void invokeSpheresWasClicked() {
        if(model.equalsSkills()) {
            model.setNewTaskSkill();
            mainView.setSkillImage(model.getTaskSkill().getImageId());
            mainView.setTaskCastCombo(model.getTaskSkill().getCastCombo());
        }
    }

    public void quasSphereWasClicked(){
        model.addSphere("Q");
        mainView.setUserCastCombo(model.getCastSkill());
    }

    public void wexSphereWasClicked(){
        model.addSphere("W");
        mainView.setUserCastCombo(model.getCastSkill());
    }

    public void exortSphereWasClicked(){
        model.addSphere("E");
        mainView.setUserCastCombo(model.getCastSkill());
    }

    public void init(){
        model.setNewTaskSkill();
        mainView.setSkillImage(model.getTaskSkill().getImageId());
    }
}
