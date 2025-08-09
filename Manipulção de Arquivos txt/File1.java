package teste;

import java.io.File;
import java.util.Scanner;

public class File1 {
	public static void main(String[] args) {

		java.util.Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um caminho");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subir").mkdir();
		System.out.println("Criado com successs\n" + success);
		sc.close();

	}

}
