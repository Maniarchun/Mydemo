package com.javatutorial;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo {
		public static void main( String[] arg){
			int  a =15;
			boolean flag =true;
			for(int i =2;i<a/2;i++){
			if(a%i==0){
				flag=false;
			}
		
			}
			if(flag==true) {
				System.out.println("Is a Prime");
			}else {
				System.out.println("is not prime ");
			}

		}
		}


