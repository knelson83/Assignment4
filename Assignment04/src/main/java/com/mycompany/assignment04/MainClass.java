
package com.mycompany.assignment04;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;



public class MainClass{
	
	public static void main(String[] args) throws FileNotFoundException{
		
		File myFile = new File("C:\\Users\\kiwin\\Assignment4\\Assignment04\\src\\main\\java\\com\\mycompany\\assignment04\\name.txt");
		Scanner inputFile = new Scanner(myFile);
		ArrayList <String> nameList = new ArrayList();
		
		while (inputFile.hasNext()){
			nameList.add(inputFile.next());
			
		}
			
		inputFile.close();
		Collections.sort(nameList, Collator.getInstance());
		System.out.println(nameList);
		System.out.println("=======================");
		
	}

}





