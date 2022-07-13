package ex2.developers;

import ex2.skills.BackendSkill;
import ex2.skills.DevOps;
import ex2.skills.FrontSkill;

public class Senior extends Developer{
    @Override
    public void loadSkills() {
        this.skills.add(new FrontSkill());
        this.skills.add(new BackendSkill());
        this.skills.add(new DevOps());
    }

    @Override
    public String toString() {
        return "Senior{} " + super.toString();
    }
}
