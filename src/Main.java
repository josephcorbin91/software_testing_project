import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.function.Predicate;

import Utilities.JavaFileFilter;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to SmellDetector /n Please enter directory of java project");
		Scanner scanner = new Scanner(System.in);
		String inputDirectory = scanner.nextLine();
		File file = new File(inputDirectory);
		FileFilter isJavaClassFilter = new FileFilter() {
	            @Override
	            public boolean accept(File pathname) {
	               return pathname.getName().contains(".java");
	            }
	         };
	         

		try {
			Files.walk(Paths.get(inputDirectory)).forEach(e -> runTests(e) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void runTests(Path path) {

		if (path.toString().toLowerCase().endsWith(".java")) {
			System.out.println(path);
			
		}
	}
	

}
