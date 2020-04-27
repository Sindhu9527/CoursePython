//Given a list of non-negative numbers. Arrange them such that they form the largest number
import java.util.*;
class SortProgram 
{
  public static void main(String[] args) 
  	{ 
	 //Tried to take up the User Input rather than hard coding the values

	  long startTime = System.nanoTime();
	  long endTime = System.nanoTime();
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("How many numbers do you want to enter?");
	  int num = sc.nextInt();
	  int arr[] = new int[num];
	  System.out.println("Enter the " + num + " numbers now.");

	  for (int i = 0 ; i < arr.length; i++ ) {
        arr[i] = sc.nextInt();
    }
	  String result = "";
  	//Sort the array in order that first element will be the first element of largest number and last element will be the last.
    	  for (int i = 0; i < arr.length; i++) 
	  {
		  for (int j = i+1; j < arr.length; j++) 
		  	{ 
				  int temp = 0; 
				  String X = Integer.toString(arr[i]);
			        String Y = Integer.toString(arr[j]);
			        //Appending the X and Y strings 
			        String XY = X+Y;
			        String YX = Y+X;
			        if(Integer.parseInt(XY) < Integer.parseInt(YX))
			        {    
			          temp = arr[i];    
			          arr[i] = arr[j];    
			          arr[j] = temp;
			        }   
			  }     
	  }    
    //Create the largest number by concatenating all the elements in array obtained by sorting
        for (int i = 0; i < arr.length; i++)     
      result = result.concat(Integer.toString(arr[i]));
    System.out.println("The largest number formed using given array is "+result); 
	System.out.println("Took "+(endTime - startTime) + " ns"); 
  }
 }