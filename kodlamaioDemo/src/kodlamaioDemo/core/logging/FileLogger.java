package kodlamaioDemo.core.logging;

public class FileLogger implements Logger{

	@Override
	public void Log(String data) {
		System.out.println("Dosya'ya Loglandı. " + data);
		
	}

}
