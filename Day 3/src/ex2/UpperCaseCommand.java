package families.behavioral.demo7_command;

public class UpperCaseCommand implements Command {

    public void print(String text) {
        System.out.println(text.toUpperCase());
    }

}
