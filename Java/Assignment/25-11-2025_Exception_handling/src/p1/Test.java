package p1;

public class Test {
    public static void main(String[] args) {
     try {
//    	 if(args.length < 2) {
//    		 throw new ArrayIndexOutOfBoundsException();
//    	 }
    	 int num1 = Integer.parseInt(args[0]);
         int num2 = Integer.parseInt(args[1]);
         
         int result = num1 / num2;
         System.out.println("Result = " + result);
         // Check for division by zero
//         if (num2 == 0) {
//             throw new ArithmeticException();
//         } else {
//             int result = num1 / num2;
//             System.out.println("Result = " + result);
//         }
     } 
//     catch(Exception e){
//    	 System.out.println("OOps! Something wents Wrong");
//     }  
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("Please provide at least two arguments");
     }
     catch(ArithmeticException e1) {
    	 System.out.println("2nd Argument should not be 'Zero/0' ");
     }
     catch(NumberFormatException e2) {
    	 System.out.println("Please provide integer as argument");
     }
     
     finally {
    	 System.out.println("Finally block executed!!!");
     }
    }
}