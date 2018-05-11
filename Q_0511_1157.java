//https://www.acmicpc.net/problem/1157
//단어공부

import java.util.Scanner;

public class Q_0511_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String str = stdin.next();
		
		//A-Z ascii: 65~90          a-z: 97~122
		//    array:  0~25 (65차이)	   : 32~57 번 (65차이)
		//대문자와 소문자 간 아스키코드 32차이남.
		 
		int useCount[] = new int[26]; // 26개 알파벳에 대해 빈도수 체크 
		
		//빈도수 0으로 초기화
		for(int i=0; i<useCount.length; i++)	useCount[i] = 0;

		//대문자, 소문자 구별없이 빈도수 체크
		for(int i=0; i<str.length(); i++){
			int ascii = (int) str.charAt(i);
			if(ascii>90) ascii-=32; //소문자면 아스키코드를 대문자 아스키코드로 변형.
			useCount[ascii-65]++;
		}
		
		int result = findMax(useCount);
		
		if(result==-1)	System.out.print("?");
		else{ //정상적인 배열 방 번호가 담겨있다면
			System.out.print((char)(result+65));
		}
	}
	
	static int findMax(int count[]){
		int max=0; //가장 큰 수 들어감
		int maxArrNum=0; //가장 큰 수가 들어가는 배열 방 번호
		//int overlap=0; //중복체크용
		for(int i=0; i<count.length; i++){
			if(count[i]>max){
				max=count[i]; //위치 체인지
				maxArrNum=i; //가장 큰 값을 가지고 있는 방 번호
			}
			else if(count[i]==max){
				maxArrNum = -1; //중복임을 표시
			}
		}
		return maxArrNum;
	}
}
