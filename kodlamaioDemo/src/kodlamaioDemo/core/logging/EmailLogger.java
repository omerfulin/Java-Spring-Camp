package kodlamaioDemo.core.logging;

public class EmailLogger implements Logger {

	@Override
	public void Log(String data) {
		System.out.println("Email'e Loglandı. " + data);
		
	}

}
