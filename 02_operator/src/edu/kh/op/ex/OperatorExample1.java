package edu.kh.op.ex;

import java.util.Scanner;

public class OperatorExample1 {

		
	public static void main(String[] args) {
		
		// 산술 연산자 : + - * / %(modular 나머지)
		
		System.out.println("두 정수를 입력받아 산술 연산 결과 출력하기");
		
		Scanner sc = new Scanner(System.in); // 암기하기
		
		System.out.print("정수 입력 1: ");
		int input1 = sc.nextInt();
		System.out.print("정수 입력 2: ");
		int input2 = sc.nextInt();
		
		System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));
		
		
		//5-3=2
		System.out.printf("%d - %d = %d \n", input1 , input2 , input1 - input2 );
		
		//5*3=15
		System.out.printf("%d * %d = %d \n", input1 , input2 , input1 * input2 );
		
		//5/3=1(몫)
		System.out.printf("%d / %d = %d \n", input1 , input2 , input1 / input2 );
		
		//5%3=2(나머지)
		System.out.printf("%d %% %d = %d \n", input1 , input2 , input1 % input2 );
		//printf에서 %문자를 출력하기 위해서는 %% 입력해야 한다.

		
		
		
	}
		
		
	
	
	
	
}
