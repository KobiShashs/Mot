package ex2.developers;

import ex2.skills.BackendSkill;
import ex2.skills.DevOps;

public class Intermediate extends Developer{

    @Override
    public void loadSkills() {
        this.skills.add(new BackendSkill());
        this.skills.add(new DevOps());
    }

    @Override
    public String toString() {
        return "Intermediate{} " + super.toString();
    }
}
