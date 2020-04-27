//Considering the requirements provided the array starts from 1
//Initially checked the hard coded format later took up the input from user to ensure the output is open for entire PASCAL TRIANGLE
//This algorithm is part of Binomial Theorem which runs in the complexity of finding the factorial of the number which is O(N) and runs on a single Loop.
//The basic rule of PAscal Triangle is the first element will be 1 
//Formula considered for the binomial theorem is nCr = [ n! / (n-r)! r! ]
//The program is created by the formula of Binomial Theorem. 

import java.util.*;

class PascalTriangle{
	
   public static ArrayList<Integer> nthRow(int N)
   {		     
       ArrayList<Integer> arraylist = new ArrayList<Integer>();
       arraylist.add(1);
       for (int i = 1; i <= N; i++) 
       {
    	   arraylist.add(i, (arraylist.get(i - 1) * (N - i + 1)) / (i));
       }
       return arraylist;
   }

   public static void main(String[] args) throws java.lang.Exception
   {
	   //Hard coded values were used to check we are on right path using Iteration
	   //int i = 5;
       //int j = 35;
	   
	   //Runtime Calculation
	   long startTime = System.nanoTime();
	   long endTime = System.nanoTime();
	   
	   //UserInput
	 
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Please enter the row which you need to extract:");
	   int i = sc.nextInt();   
	   System.out.println("Please enter the column number of the element required:");
	   int j = sc.nextInt();
	   
	   //Considering the Array starts from 1 as per requirement provided
	   i=i-1;
	   j = j-1;
	   
       ArrayList<Integer> result = new ArrayList<Integer>();
       result = nthRow(i);
       System.out.println("ith row elements of the Pascal Triangle: "+result);
       System.out.println("(i,j)th element in Pascal Triangle: "+result.get(j));
       System.out.println("Took "+(endTime - startTime) + " ns"); 

   }
}