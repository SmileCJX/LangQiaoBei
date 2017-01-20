package basic;

import java.util.Scanner;  

public class Main2015_03_05__basic27 {  
  
    static int n;// �ж�����ʺ�(һ��һ��Ϊһ��)  
    static int[] w_place;// w_place[i]: ��ʾ��i���׻ʺ��ڵ�i�е�w_place[i]��  
    static int[] b_place;// b_place[i]: ��ʾ��i���ڻʺ��ڵ�i�е�b_place[i]��  
    static int[][] arr;  
  
    static int result = 0;  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (scanner.hasNext()) {  
            n = scanner.nextInt();  
  
            w_place = new int[n];  
            b_place = new int[n];  
            arr = new int[n][n];  
  
            for (int i = 0; i < n; i++) {  
                for (int j = 0; j < n; j++) {  
                    arr[i][j] = scanner.nextInt();  
                }  
            }  
  
            backdate(0);// �ݹ����  
  
            System.out.println(result);  
  
            result = 0;  
        }  
    }  
  
    private static void backdate(int i) {  
        if (i > n - 1) {  
            result++;  
            return;  
        }  
  
        int w;// �����i���׻ʺ�  
        for (w = 0; w < n; w++) {  
            if (checkWhite(i, w)) {  
                w_place[i] = w;  
                arr[i][w] = 0;  
  
                int b;// �����i���ڻʺ�(��i���׻ʺ���λ�÷�ʱ���ſ��ǵ�i���ڻʺ�)  
                for (b = 0; b < n; b++) {  
                    if (checkBlack(i, b)) {  
                        b_place[i] = b;  
                        arr[i][b] = 0;  
  
                        backdate(i + 1);// �ݹ�  
  
                        arr[i][b] = 1;// ���ݵĹؼ�  
                    }  
                }  
  
                arr[i][w] = 1;// ���ݵĹؼ�  
            }  
        }  
    }  
  
    private static boolean checkWhite(int i, int j) {  
        if (arr[i][j] == 0) {  
            return false;  
        }  
  
        for (int k = 0; k < i; k++) {  
            if (j == w_place[k] || Math.abs(i - k) == Math.abs(j - w_place[k])) {  
                return false;  
            }  
        }  
        return true;  
    }  
  
    private static boolean checkBlack(int i, int j) {  
        if (arr[i][j] == 0) {  
            return false;  
        }  
  
        for (int k = 0; k < i; k++) {  
            if (j == b_place[k] || Math.abs(i - k) == Math.abs(j - b_place[k])) {  
                return false;  
            }  
        }  
        return true;  
    }  
}  
