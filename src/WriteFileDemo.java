import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"))) {
			String mycontent = "This String would be written" +
				" to the specified File";
			bw.write(mycontent);
			System.out.println("File written Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
