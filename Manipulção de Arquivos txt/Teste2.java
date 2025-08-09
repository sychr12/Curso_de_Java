package teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste2 {
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Mornig", "Good After", "Good Nigth"};
		
		String path = "C:\\Users\\sayyc\\Downloads\\teste2";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		
	}

}
