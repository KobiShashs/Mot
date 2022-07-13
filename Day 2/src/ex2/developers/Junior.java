package ex2.developers;

import ex2.skills.FrontSkill;

public class Junior extends Developer{


    @Override
    public void loadSkills() {
        this.skills.add(new FrontSkill());
    }

    @Override
    public String toString() {
        return "Junior{" +
                "skills=" + skills +
                "} " + super.toString();
    }
}
