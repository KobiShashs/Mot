package ex2.developers;

import ex2.skills.Skill;

import java.util.ArrayList;
import java.util.List;

public abstract class Developer {

    protected List<Skill> skills = new ArrayList<>();

    public Developer() {
        loadSkills();
    }

    public abstract void loadSkills();

    public void printSkills(){
        System.out.println("*************"+this.getClass().getSimpleName()+"*************");
        skills.forEach(Skill::name);
        System.out.println("------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "skills=" + skills +
                '}';
    }
}
