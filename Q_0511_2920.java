//https://www.acmicpc.net/problem/2920
//����

import java.util.Scanner;

public class Q_0511_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
        int array[] = new int[8];
        int flag = 0;
        
        for(int i=0;i<8;i++) array[i] = stdin.nextInt();
        
		for(int i=1;i<8;i++){
			if(array[i-1]<array[i])		flag+=1; //�������� �� ũ�� ascending ǥ�÷� flag++
			else if(array[i-1]>array[i])	flag-=1; //�������� �� ������ descending ǥ�÷� flag--
		}
		
		if(flag==7)		System.out.print("ascending");
		else if(flag==-7)  	  System.out.print("descending");
		else	 System.out.print("mixed");
		


	}

}
