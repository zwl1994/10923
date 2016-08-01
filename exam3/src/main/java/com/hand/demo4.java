package com.hand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class demo4 {
	public static void main(String[] args) {
		Random r = new Random();
		int a = 0;
		int arr[] = new int[50];
		List l = new LinkedList<Integer>();
		for(int i=0; i<50; i++){
			a = r.nextInt(100);
			System.out.print(a+" ");
			arr[i] = a;
			l.add(a);
		}
		System.out.println();
		Map m = new HashMap<Integer, String>();
		Map m1 = new HashMap<Integer, String>();
		Iterator it = l.iterator();
		int b = 0;
		int c = 0;
		int j = 0;
		int g = 0;
		while(it.hasNext()){
			b = (Integer) it.next();
			c = b/10;
			for(int n=0; n<arr.length;n++){
				if(arr[n]/10 == c){
					g++;
				}
			}
			int ar[] = new int[g];
					g = 0;
			for(int i=0; i<arr.length;i++){
				if(arr[i]/10 == c){
					ar[g] = arr[i];
					g++;
				}
			}
			g = 0;
			
			m1.put(c, Arrays.toString(ar));
			m.put(c, Arrays.toString(test(ar)));
		}
		System.out.println(m1.entrySet());
		System.out.println("-------------排序后------------");
		System.out.println(m.entrySet());
		
	}
	
	private static int[] test(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		return arr;
	}
}
