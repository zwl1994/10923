package com.hand;

/**
 *1， (8分)判断101-200之间有多少个素数，并输出所有素数。	
 *输出结果格式如下:	101-200 间总共有 xx 个素数,分别是:xxx,xxx,xxx	
 */
public class demo1 
{
    public static void main( String[] args ){
    	int n[] = new int[100];
    	for(int i=0;i<=99;i++)
    		n[i] = i+101;
    	test(n);
    }

	private static void test(int[] b) {
	    String s = "";
		int count = 0;
		int sum = 0;
		for(int i=0;i<b.length;i++){
			for(int j=1;j<=b[i];j++){
				if(b[i]%j==0){
					count++;
				}
			}
			if(count==2){
				if(b[i]==199)
					s+=b[i];
				else
					s +=b[i]+",";
				sum++;
			}
				count = 0;
		}
		System.out.println("101-200 间总共有 "+sum+" 个素数，分别是：");
		System.out.println(s);
		
	}
}
