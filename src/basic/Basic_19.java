package basic;

import java.util.Scanner;

public class Basic_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		char [] chs = s.toCharArray();
		
		int [] count = new int[26];
		char ch = '0';
		int oddchar = 0;
		
		for (int i=0; i<chs.length; i++){
			int index = chs[i]-'a';
			count[index]++;
		}
		
		for (int i=0; i<26; i++){
			if(count[i]%2!=0){
				oddchar++;
				ch = (char)(i+'a');
			}
		}
		
		if(oddchar>1){
			System.out.println("Impossible");
		}else{
			int result = exchanges(chs,n,ch);
			System.out.println(result);
		}
	}

	private static int exchanges(char[] chs, int n, char ch) {
		int count = 0,i,j,k;
		for(i=0; i<n/2; i++){
			if (chs[i]==ch){
				for(j=i; j<n-1-i; j++){
					if(chs[j]==chs[n-1-i]){
						break;
					}
				}
				count +=j-i;
				
				for (k=j; k>i; k--){
					chs[k] = chs[k-1];
				}
				chs[i] = chs[n-i-1];  
			}else{
				for (j=n-i-1; j>=i; j--){
					if(chs[j]==chs[i]){
						break;
					}
				}
				count +=n-i-1-j;
				
				for(k=j; k<n-i-1; k++){
					chs[k] = chs[k+1];
				}
				chs[n-i-1] = chs[i];
			}
		}
		return count;
	}
}
