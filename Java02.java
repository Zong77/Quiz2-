import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Java02 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\CJCU-User\\rand.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str;
		int i, max, min, arr[] = new int[1000];
		long sum = 0L;

		for (i = 1; i <= 1000; i++) {
			Double num = new Double(Math.random() * 100000);
			str = Integer.toString(num.intValue());
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		fw.close();
	}
}