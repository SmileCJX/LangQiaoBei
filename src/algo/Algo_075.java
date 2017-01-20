package algo;

import java.util.Scanner;

public class Algo_075 {  
    public static void main(String[] args) {  
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
        boolean[] persons = doCall(n);  
        for (int i = 0; i < persons.length; i++) {  
            if (persons[i]) {  
                System.out.println(i+1);  
            }  
        }  
    }  
    public static boolean[] doCall(int person) {  
        boolean[] persons = new boolean[person];  
        int number = person, key = 0;  
        for (int i = 0; i < person; i++)  
            persons[i] = true;  
        
        while (number != 1) {  
            for (int i = 0; i < person; i++) {  
                if (!persons[i]) {  
                    continue;  
                } else {  
                    key++;  
                    if (key % 3 == 0) {  
                        persons[i] = false;  
                        key = 0;  
                    }  
                }  
            }  
            number = 0;  
            for (int i = 0; i < person; i++) {  
                if (persons[i]) {  
                    number++;  
                }  
            }  
        }  
        return persons;  
    }  
} 
