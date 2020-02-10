package javabook;

import java.util.Scanner;

public class Ch03_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 3 + 1);
			// System.out.println(arr[i]);
		}

		String str = "win";

		for (int i = 0; i < arr.length; i++) {
			System.out.println("가위(1) 바위(2) 보(3) 입력");
			int num = scan.nextInt();
			
			if(num == 1) {
				switch(arr[i]) {
				case 1:
					str = "draw";
					break;
				case 2: 
					str = "lose";
					break;
				}
			}
			else if(num == 2) {
				switch(arr[i]) {
				case 2:
					str = "draw";
					break;
				case 3: 
					str = "lose";
					break;
				}
			}
			else if(num == 3){
				switch(arr[i]) {
				case 3:
					str = "draw";
					break;
				case 1: 
					str = "lose";
					break;
				}
			}
			System.out.println("사용자 : " + num + " 컴퓨터 : " + arr[i]);
			System.out.println((i+1)+"/"+arr.length+" "+str);
		}

	}

}
