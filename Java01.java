import java.util.Scanner;

public class Java01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("請輸入密碼:");
		a = sc.nextInt();
		int count = 0;
		for (;;) {
			System.out.print("請再次輸入密碼:");
			b = sc.nextInt();
			if (a == b)
				break;
			else
				count++;
			if (count == 3)
				throw new RuntimeException("輸入三次錯誤！程式停止！");
			else
				System.out.print("密碼正確");
		}
	}
}