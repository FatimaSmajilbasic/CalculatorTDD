package calculator;

public class Calculator {
	
	     int firstNumber ;
	     int secondNumber;
	     
	     public Calculator() {
	}
	    Calculator(int firstNumber, int secondNumber){
	    	this.firstNumber = firstNumber;
	    	this.secondNumber =secondNumber;
	    	
	    }
	    public int addition( int firstNumber , int secondNumber) {
	    	return firstNumber + secondNumber;
	    }
	    
	   public int subtraction( int firstNumber , int secondNumber) {
		    	return firstNumber - secondNumber;
	   }
	   public int multiplication( int firstNumber, int secondNumber) {
		   return firstNumber * secondNumber ;
		   
	   }
	   public double division( int firstNumber, double secondNumber) {
		   return firstNumber / secondNumber;
		   
	   }
	  
}
