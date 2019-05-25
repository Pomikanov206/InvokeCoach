package com.example.invokecoach.database;


import com.example.invokecoach.R;
import com.example.invokecoach.models.Skill;

public enum SkillsBase {

    SUN_STRIKE(new Skill("EEE",R.drawable.skill_eee)),
    FORGE_SPIRIT(new Skill("EEQ",R.drawable.skill_eeq)),
    ICE_WALL(new Skill("EQQ",R.drawable.skill_eqq)),
    COLD_SNAP(new Skill("QQQ",R.drawable.skill_qqq)),
    GHOST_WALK(new Skill("QQW",R.drawable.skill_qqw)),
    TORNADO(new Skill("QWW",R.drawable.skill_qww)),
    EMP(new Skill("WWW",R.drawable.skill_www)),
    CHAOS_METEOR(new Skill("EEW",R.drawable.skill_eew)),
    ALACRITY(new Skill("EWW",R.drawable.skill_eww)),
    DEAFENING_BLAST(new Skill("EQW",R.drawable.skill_eqw));

    private Skill skill;

    SkillsBase(Skill skill){
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }
}
