package families.behavioral.demo7_command;

public class LowerCaseCommand implements Command {

	public void print(String text) {
		System.out.println(text.toLowerCase());
	}

}
