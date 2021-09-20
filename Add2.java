import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, sum;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		x = input.nextInt();
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
		
		input.close();
		
	}

}
