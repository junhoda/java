import java.util.Scanner;

public class ArthOperator {

	public static void main(String[] args) {
		int i, j;
		//��� ������ * / % + - ���� ���� �����ؼ� ���� �����ִ� ������
		Scanner scn = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է� : ");
		i = scn.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		j = scn.nextInt();
		System.out.println(i + " X " + j + " = " + (i*j));
		System.out.println(i + " / " + j + " = " + ((double)i/j));
		System.out.println(i + " + " + j + " = " + (i%j));
		System.out.println(i + " - " + j + " = " + (i-j));
		
		

	}

}
