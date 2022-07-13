package ex2.skills;

public class DevOps extends Skill{
    @Override
    public void name() {
        System.out.println("AWS...");
    }

    @Override
    public String toString() {
        return "DevOps{} " + super.toString();
    }
}
