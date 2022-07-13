package ex3;

public class File extends Entity{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void whoAmI() {
        System.out.println("This is a file ---->"+ name);
    }
}
