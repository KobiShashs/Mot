package families.behavioral.demo7_command;

public class Receiver {
	public void action(String text,Command cmd){
		cmd.print(text);
	}
}
