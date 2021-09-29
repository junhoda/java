import java.util.Scanner;

public class BitOperator {

	public static void main(String[] args) {
		//비트 연산 : 메모리(주소,콘텐츠)의 콘텐츠 영역의 비트끼리 연산 
		//shift(<<,>>), & ^ 
		int i , j;
		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		i = scn.nextInt();
		System.out.println("두 번째 정수 입렵 : ");
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
