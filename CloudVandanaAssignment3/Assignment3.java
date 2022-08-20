package CloudVandanaAssignment3;
import java.io.*; 
import java.util.*;  
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		


		Scanner sc1 = new Scanner(System.in); 
		Scanner sc2 = new Scanner(System.in);    
		System.out.print("Sentence :");               
		String sentence = sc1.nextLine();                              
		System.out.print("Letter: ");              
		char letter = sc1.next().charAt(0);                
		int len = sentence.length();                              
		String subString="";               
		boolean result = false;                              
		for(int i=0;i<len;i++)       {                
			char c = sentence.charAt(i);          
			if(Character.compare(letter,c) == 0)   {                        
				subString = sentence.substring(i+1, len);                         
				result = true;                          
				break;                 
				}               
			}                           
		if(result == true) System.out.println("Result: "+subString);                  
		else System.out.println("The letter does not exist in the sentence.");        
		}


}
