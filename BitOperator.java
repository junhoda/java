import java.util.Scanner;

public class BitOperator {

	public static void main(String[] args) {
		//��Ʈ ���� : �޸�(�ּ�,������)�� ������ ������ ��Ʈ���� ���� 
		//shift(<<,>>), & ^ 
		int i , j;
		Scanner scn = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է� : ");
		i = scn.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		j = scn.nextInt();
				
		System.out.println(" ~ " + i  + "  => " + (~i));		
		System.out.println(i + " << " +  j + " => " + (i << j));
		System.out.println(i + " >> " +  j + " => " + (i >> j));
		System.out.println(i + " >>> " +  j + " => " + (i >>> j));
		
		System.out.println(i + " & "  +  j + " => " + (i & j));
		System.out.println(i + " ^ "  +  j + " => " + (i ^ j));
		System.out.println(i + " | " + j + "  => "  +  (i | j));
	
 
	}

}
