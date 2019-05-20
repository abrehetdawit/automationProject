package com.cybertekk;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class Batch10 {
public static void main(String[] args) {
	//open chrome
System.setProperty("webdriver.chrome.driver","//C:\\Users\\Tek\\Documents\\selenium dependencies/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("www.google.com");
	//driver=new chromeDriver
	
	Faker faker= new Faker();
	String creditCard=faker.finance().creditCard();
	String firstName=faker.name().firstName();
	String lastName=faker.name().lastName();
	String ad=faker.address().cityName();
	System.out.println(firstName+","+","+lastName+","+ad);
	System.out.println(creditCard);
	
	int array[][]= {{1,5,401,13,18,6},{4,12,17,31,2,9},{801,22,6,1,40,4},{50,23,11,20,35,81},{800,60,635,14,5173},{2,42,30,75,15,6}};
	
	
	//System.out.println(array);
	//System.out.println( Arrays.deepToString(array) ) ;
///////////////////////
	
//    for(int i=0;i<rows;i++){
//      for(int j=0;j<cols;j++){
//        if(j%2==0){
//          arr[i][j]="0";
//        }else{
//          arr[i][j]="1";
//        }
//      }
//    }
//    
//    //your code here
//    
//  
//    System.out.println( Arrays.deepToString(arr) ) ;
//  }//end main
//}
//	////////////////////
	
//	
}
//static int findlargestEvenNumber(int[][]matt) {
//	int matrix[][]= {{1,5,401,13,18,6},{4,12,17,31,2,9},{801,22,6,1,40,4},{50,23,11,20,35,81},{800,60,635,14,5173},{2,42,30,75,15,6}};
//	
//	int max= Integer.MIN_VALUE;
//	for(int i=0; i<matrix.length;i++) {
//		for(int j=0;j<matrix.length;j++) {
//		if(i>j && i %2==0 && i!=j) {
//			max=matrix[i][j];
//			
//			//int array[][]= {{1,5,401,13,18,6},{4,12,17,31,2,9},{801,22,6,1,40,4},{50,23,11,20,35,81},{800,60,635,14,5173},{2,42,30,75,15,6}};
//			//System.out.println(array);
//			//System.out.println( Arrays.deepToString(max) ) ;
//			System.out.println(max);
//			
//				System.out.println(max);
//			}
//			return max;
//			
//		}
//		
//		}
//	}}
}
