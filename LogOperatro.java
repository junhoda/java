import java.util.Scanner;

public class LogOperatro {

	public static void main(String[] args) {
		boolean i, j;
		//�� ������ : ������ ���� ����, ����� ����(true, false)
		// == != > >= < <=
		Scanner scn = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է� : ");
		i = scn.hasNextBoolean();
		System.out.println("�� ��° ���� �Է� : ");
		j = scn.hasNextBoolean();
		
		System.out.println(" !" + i + " => " + (!i));
		System.out.println(i + "&&" + j + " => " + (i&&j));
		System.out.println(i + "||" + j +  "=> " + (i||j));
		

	}

}
