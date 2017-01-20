package algo;

import java.util.*;  

public class Algo_010 {  
  
    public static void main(String args[]) {  
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
        int[] a = new int [n];
        for (int i=0; i<a.length; i++){
        	a[i] = input.nextInt();
        }
    	int m = input.nextInt();
        int[] b = new int [m];
        for (int i=0; i<b.length; i++){
        	b[i] = input.nextInt();
        }
        intersection(a, b);  
    }  
  
    static void intersection(int a[], int b[]) {  
        Set<Integer> set1 = new HashSet<Integer>();  
        Set<Integer> set2 = new HashSet<Integer>();  

        for (int i = 0; i < a.length; i++) {  
            set1.add(a[i]);  
        }  
        for (int j = 0; j < b.length; j++) {  
            set2.add(b[j]);  
        }  

        Set<Integer> su = new HashSet<Integer>(set1);  
        su.retainAll(set2);  
        sortSet(su);
       
        Set<Integer> sn = new HashSet<Integer>(set1);  
        sn.addAll(set2);  
        sortSet(sn);
        
        Set<Integer> sr = new HashSet<Integer>(set1);  
        sr.removeAll(su);
        sortSet(sr);
    }  
  
    static void sortSet(Set<Integer> set) {
        Integer setArray[] = new Integer[set.size()];  
        Iterator<Integer> iSet = set.iterator();  
        for (int i = 0; iSet.hasNext(); i++) {  
            setArray[i] = iSet.next();
        }  
        Arrays.sort(setArray);
        for (int i=0; i<setArray.length; i++){
        	System.out.print(setArray[i]+" ");
        }
        System.out.println();
    }  
  
}  

