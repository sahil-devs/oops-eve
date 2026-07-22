import java.util.Scanner;
public class SystemInfo {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("SYSTEM INFORMATION");

        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVersion);
        String operatingSystem = System.getProperty("os.name");
        System.out.println("Operating System: " + operatingSystem);
        String userName = System.getProperty("user.name");
        System.out.println("User Name: " + userName);
        
        String architecture = System.getProperty("os.arch");
        System.out.println("Architecture: " + architecture);
        String workingDirectory = System.getProperty("user.dir");
        System.out.println("Working Directory: " + workingDirectory);


	}

}

