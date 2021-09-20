import java.util.Scanner;

public class Circlearea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double radius, area;
		
		System.out.println("원의 반지름 입력 : ");
		radius = scanner.nextDouble();
		
		area = Math.PI * radius * radius;
		
		System.out.println(area);
		scanner.close();

	}

}
