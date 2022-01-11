import java.util.Scanner;

public class GugudanPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		//사용자가 입력한 값을 쉼표(,)를 기준으로 분리한다.
		String[] splitedValue = inputValue.split(",");
		//쉼표를 기준으로 분리한 문자열을 숫자로 변환한다.
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int[] result = new int[second];

        for(int i=2;i<first+1;i++) {
            for(int j=0;j<second;j++){
                result[j] = i * (j+1);
                System.out.println(result[j]);
            }
        }
	}

}
