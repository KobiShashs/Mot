package ex2.skills;

public class BackendSkill extends Skill {
    @Override
    public void name() {
        System.out.println("Spring Like A Boss");
    }

    @Override
    public String toString() {
        return "BackendSkill{} " + super.toString();
    }
}
