package test;

//��n��Ԫ�ص�ȫ����
// abc acb bac bca cab cba
public class Test2B {
	//k:��ǰ�Ľ���λ�ã���ע�㣩��������Ԫ�ؽ���
	public static void f(char[] data,int k){
		if (k==data.length){
			for (int i=0; i<data.length; i++) System.out.print(data[i]+" ");
			System.out.println();
		}
		for (int i=k; i<data.length; i++){
			{ char t = data[k];data[k] = data[i];data[i] = t; }		//��̽
			f(data,k+1);
			{ char t = data[k];data[k] = data[i];data[i] = t; }		//����
		}
	}
	
	public static void main(String [] args){
		char [] data = "ABCDE".toCharArray();
		f(data,0);
	}
}
