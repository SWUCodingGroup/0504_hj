//https://www.acmicpc.net/problem/1157
//�ܾ����

import java.util.Scanner;

public class Q_0511_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String str = stdin.next();
		
		//A-Z ascii: 65~90          a-z: 97~122
		//    array:  0~25 (65����)	   : 32~57 �� (65����)
		//�빮�ڿ� �ҹ��� �� �ƽ�Ű�ڵ� 32���̳�.
		 
		int useCount[] = new int[26]; // 26�� ���ĺ��� ���� �󵵼� üũ 
		
		//�󵵼� 0���� �ʱ�ȭ
		for(int i=0; i<useCount.length; i++)	useCount[i] = 0;

		//�빮��, �ҹ��� �������� �󵵼� üũ
		for(int i=0; i<str.length(); i++){
			int ascii = (int) str.charAt(i);
			if(ascii>90) ascii-=32; //�ҹ��ڸ� �ƽ�Ű�ڵ带 �빮�� �ƽ�Ű�ڵ�� ����.
			useCount[ascii-65]++;
		}
		
		int result = findMax(useCount);
		
		if(result==-1)	System.out.print("?");
		else{ //�������� �迭 �� ��ȣ�� ����ִٸ�
			System.out.print((char)(result+65));
		}
	}
	
	static int findMax(int count[]){
		int max=0; //���� ū �� ��
		int maxArrNum=0; //���� ū ���� ���� �迭 �� ��ȣ
		//int overlap=0; //�ߺ�üũ��
		for(int i=0; i<count.length; i++){
			if(count[i]>max){
				max=count[i]; //��ġ ü����
				maxArrNum=i; //���� ū ���� ������ �ִ� �� ��ȣ
			}
			else if(count[i]==max){
				maxArrNum = -1; //�ߺ����� ǥ��
			}
		}
		return maxArrNum;
	}
}
