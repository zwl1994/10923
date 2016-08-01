package com.hand;

import java.util.Scanner;

/*
 * (8分)输入某年某月某日，判断这一天是这一年的第几天？	
 * 从控制台读取日期,日期输入的格式为”2015-07-26”形式.
 * (不允 许使用Calendar,Date,DateTime类中的函数),输入输出的形式 如下:		
       请输入日期:	2015-01-01	你输入的日期为当年的第 1 天
 */

public class demo3 {

	public static void main(String[] args) {
		System.out.print("请按照yyyy-mm-dd格式输入日期：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int days;
		int m1 = (int)str.charAt(5) - 48;
		int m2 = (int)str.charAt(6)- 48;
		int d1 = (int)str.charAt(8)- 48;
		int d2 = (int)str.charAt(9)- 48;
		if(m1 == 0)
			days = (m2-1)*30+d1*10+d2;
		else
			days = (9+m2)*30+d1*10+d2;
		System.out.print("你输入的日期为当年的第 "+days+" 天!");
	}

}