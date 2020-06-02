import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args) {
		File file = new File("myfile.txt");
		file.createNewFile();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			String mycontent = "This String would be written" +
				" to the specified File";
			bw.write(mycontent);
			System.out.println("File written Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
