import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) {
		try {
		FileOutputStream f1 = new FileOutputStream("abhi.txt");
		String s1 = "Akshay";
		byte b1[] = s1.getBytes();
		f1.write(b1);
		System.out.println("Success.....");
	}
	catch(IOException i)
	{
		System.out.println(i.getMessage());
	}

}
}
