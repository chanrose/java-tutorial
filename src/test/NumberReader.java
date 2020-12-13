package test;

import java.util.Scanner;

public class NumberReader {
	static Scanner s;
	static int number;
	static int secondN;
	static int firstN;

	public static void main(String[] args) {
		inputNumber();
		readNumber();
		displayNumber();
		displayNumber2();
		// displayNumber1();
		

	}

	static void inputNumber(){
		s= new Scanner(System.in);
		System.out.println("input a number from 1-99");
		number = s.nextInt();
	}

	static void readNumber(){
		secondN = number % 10;
		firstN =number/10;
	}
	

	static void displayNumber(){
		switch(firstN){
		case 2: System.out.print("twenty ");   break;
		case 3: System.out.print("thirty ");   break;
		case 4: System.out.print("fourty ");   break;
		case 5: System.out.print("fifty ");   break;
		case 6: System.out.print("sixty ");   break;
		case 7: System.out.print("seventy ");   break;
		case 8: System.out.print("eightty ");   break;
		case 9: System.out.print("ninety ");   break;
		}
	}
	
	static void displayNumber1(){
		switch(secondN){
		case 1: System.out.print("one");   break;
		case 2: System.out.print("two");   break;
		case 3: System.out.print("three");   break;
		case 4: System.out.print("four");   break;
		case 5: System.out.print("five");   break;
		case 6: System.out.print("six");   break;
		case 7: System.out.print("seven");   break;
		case 8: System.out.print("eight");   break;
		case 9: System.out.print("nine");   break;
	
		}
	}
	
	static void displayNumber2(){
		switch(number){
		case 10: System.out.print("ten");   break;
		case 11: System.out.print("eleven");   break;
		case 12: System.out.print("twelve");   break;
		case 13: System.out.print("thirteen");   break;
		case 14: System.out.print("fourteen");   break;
		case 15: System.out.print("fifteen");   break;
		case 16: System.out.print("sixteen");   break;
		case 17: System.out.print("seventeen");   break;
		case 18: System.out.print("eighteen");   break;
		case 19: System.out.print("nineteen");   break;
		
		}
	}
	
}
	
	
	
	
	

	
	

	
	
	




