//https://www.acmicpc.net/problem/10039
//�������
import java.util.Scanner;

public class Q_0511_10039 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int scoreBefore[] = new int[5];
		for(int i=0;i<5;i++){
			scoreBefore[i] = stdin.nextInt();
			if(!(scoreBefore[i]>=0 && scoreBefore[i]<=100 && scoreBefore[i]%5==0)){
				System.out.println("��ȿ���� �ʴ� �����Դϴ�.");
				break;
			}
		}
		
		int scoreAfter[] = new int[5];
		int totalSum=0;
		for(int i=0; i<5; i++){
			scoreAfter[i] = scoreBefore[i]; //�ʱ�ȭ
			if(scoreAfter[i]<40) scoreAfter[i]=40;
			totalSum +=scoreAfter[i];
		}

		System.out.print(totalSum/5);
	}
}
