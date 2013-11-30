package nulls;

public class CommandProcessor {

	public interface Command {
		void execute();
	}
	
	 private boolean validCommand(String command) {
		// TODO Auto-generated method stub
		return false;
	}

	public Command findCommand(String command) {
		 if (validCommand(command)) {
			 // ...
		 } else {
			 return new NullCommand();
		 }
	 }

	public class NullCommand implements Command {
		public void execute() {
			// do nothing
		}
	}
}
