package prev;

import java.util.Scanner;

public class Prev_02{

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int x=5+4*n;
		char[][] ch=new char[x][x];
		int k=x/2;
		ch[k][k]='$';
		/**
		 * ��ӡ������һ��
		 */
		for (int i = k-2; i <=k+2; i++) {
			for (int j = k-2; j <=k+2 ; j++) {
				if(i==k || j==k) {
					ch[i][j]='$';
				}else{
					ch[i][j]='.';
				}
			}
		}
		for (int p = 1; p < n+1; p++) {
			/**
			 * 4���ս�
			 */
			ch[k-2*p][k-2*p]='$';
			ch[k-2*p][k+2*p]='$';
			ch[k+2*p][k-2*p]='$';
			ch[k+2*p][k+2*p]='$';
			for (int i = k-2-2*p; i <=k+2+2*p; i++) {
				for (int j =k-2-2*p; j <=k+2+2*p; j++) {
					/**
					 * ��߽ǲ���
					 */
					if((i<k-2*p||i>k+2*p)&&(j<k-2*p||j>k+2*p)){
						ch[i][j]='.';
					}
					/**
					 * �󶥲���β�������ţ�
					 */
					if((i==k-2-2*p ||i== k+2+2*p) &&(j>=k-2*p && j<=k+2*p)){
						ch[i][j]='$';
					}
					/**
					 * ���󲿺��Ҳ������ţ�
					 */
					if((j==k-2-2*p ||j== k+2+2*p) &&(i>=k-2*p && i<=k+2*p)){
						ch[i][j]='$';
					}
					/**
					 * �󶥲���β�������ţ�
					 */
					if((i==k-1-2*p ||i== k+1+2*p) &&(j>k-2*p && j<k+2*p)){
						ch[i][j]='.';
					}
					/**
					 * ���󲿺��Ҳ������ţ�
					 */
					if((j==k-1-2*p ||j== k+1+2*p) &&(i>k-2*p && i<k+2*p)) {
						ch[i][j]='.';
					}
					if(ch[i][j]=='.' || ch[i][j]=='$'){
						continue;
					}else {
						ch[i][j]='$';
					}
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
	}

}
