import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, sum;
		
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		x = input.nextInt();
		
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
		
		input.close();
		
	}

}
