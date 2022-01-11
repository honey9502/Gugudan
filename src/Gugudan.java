import java.util.Scanner;

public class Gugudan {
	
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {
			// 계산 결과를 배열에 저장
			result[i] = times * (i+1);
		} 
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			// 계산 결과를 화면에 출력
			System.out.println(result[i]);
		}
	}

//	public static void main(String[] args) {
//		
//		for(int i=2;i<10;i++) {
//			int[] result = calculate(i);
//			print(result);
//		}
		
//		for(int j=2; j<10; j++) {
//			for(int i=0; i<result.length; i++) {
//				result[i] = j * (i+1);
//				System.out.println(result[i]);
//			}
//		}
		
//		for(int i=0; i < result.length; i++) {
//			// 계산 결과를 배열에 저장
//			result[i] = 2 * (i+1);
//		} 
//		
//		for(int i=0; i < result.length; i++) {
//			// 계산 결과를 화면에 출력
//			System.out.println(result[i]);
//		}
//		
//		int [] times3 = new int[9];
//		for(int i=0; i < times3.length; i++) {
//			// 계산 결과를 배열에 저장
//			times3[i] = 3 * (i+1);
//		}
//		
//		for(int i=0; i < times3.length; i++) {
//			// 계산 결과를 화면에 출력
//			System.out.println(times3[i]);
//		}
//		
//		int [] times4 = new int[9];
//		for(int i=0; i < times4.length; i++) {
//			// 계산 결과를 배열에 저장
//			times4[i] = 4 * (i+1);
//		}
//		
//		for(int i=0; i < times4.length; i++) {
//			// 계산 결과를 화면에 출력
//			System.out.println(times4[i]);
//		}
		
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("number : " + number);
//		
//		if(number < 2) {
//			System.out.println("숫자는 2보다 커야합니다");
//		}else if(number > 9) {
//			System.out.println("숫자는 9보다 작아야합니다.");
//		}else {
//			int i;
//			for(i=1;i<10;i++) {
//				System.out.println(number + " x " + i + " = " + i * number);
//			}
//		}
		
		//2단
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		
		//3단
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2); 
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
		
//		int result = 4 * 1;
//		System.out.println(result);
//
//		result = 4 * 2;
//		System.out.println(result);
        
		// 구구단 출력하는 예제 구현 
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("number : " + number);
// 
//		int result = number * 1;
//        
//		int i;
//		for(i=1;i<10;i++) {
//			System.out.println(number + " x " + i + " = " + number * i);
//		}
		
//		int i = 1;
//		
//		//6단
//		while(i<10) {
//			System.out.println(6 * i);
//			i = i + 1;
//		}
//		
//		//7단
//		for(i=1;i<10;i++) {
//			System.out.println(i * 7);
//		}
		
//	}

}
