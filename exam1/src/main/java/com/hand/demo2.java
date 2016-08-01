package com.hand;

/*
 * 现设定各项社会保险金为0，从命令行中接收用户输入的工资数,
 * 在输 出中打印出需缴纳的税费,形式如下:	
 * 请输入工资:	xxxx
 * 	所需要缴纳的税费为:	xxxx	
 */
import java.util.Scanner;

public class demo2
{
    public static void main( String[] args )
    {
    	System.out.print("请输入工资 ：");
    	Scanner scanner = new Scanner(System.in);
    	double Money = scanner.nextInt();
    	double s = 0;
    	double Temp = Money - 3500;
    	//需要交税
    	if(Temp > 0){
    		if(Temp <= 1500){
    			s = Temp * 0.03;   //小于15001
    		}
    		else if(Temp > 1500 && Temp <= 4500){
    			Temp =Temp - 1500;
    			s = 1500 * 0.03 + Temp * 0.1;
    		}
    		else if(Temp > 4500 && Temp <= 9000){
    			Temp =Temp - 4500;
    			s = 1500*0.03+3000*0.1+Temp*0.2;
    		}
    		else if(Temp>9000 &&Temp <=35000){
    			Temp =Temp - 9000;
    			s = 1500*0.03+3000*0.1+4500*0.2+Temp*0.25;
    		}
    		else if(Temp>35000 &&Temp <=55000){
    			Temp =Temp - 35000;
    			s = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+Temp*0.3;
    		}
    		else if(Temp>55000 &&Temp <=80000){
    			Temp =Temp - 55000;
    			s = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+Temp*0.35;
    		}
    		else{
    			Temp =Temp - 80000;
    			s = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+Temp*0.45;
    		}
    	}
    	System.out.print("所需要缴纳的税费是 ："+s);
    }
}