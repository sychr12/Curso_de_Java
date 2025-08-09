package teste;

import java.io.File;
import java.util.Scanner;

public class file2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Caminha do arquivo");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		//Nome do arquivo e dispensa o caminho
		
		System.out.println("GetName " + path.getName());
		
		//ele pega o caminho certinho
		System.out.println("GetName " + path.getParent());
		
		//Ele pega o caminho completo
		System.out.println("GetName " + path.getPath());
		
		
		sc.close();
	}

}
