package p1;

public class Test {
    public static void main(String[] args) {
        // Handle missing command-line arguments
        if (args.length < 2) {
            System.out.println("Error: Please provide two command-line arguments.");
            return; 
        }

        // Validate that inputs are integers using regex
        if (!args[0].matches("-?\\d+") || !args[1].matches("-?\\d+")) {
            System.out.println("Error: Both arguments must be valid integers.");
            return;
        }

        // Parse command-line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Check for division by zero
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        }

        // Unboxing
        Integer numInteger = 10;
        int numInt = numInteger; // unboxing wrapper to primitive
        System.out.println("Unboxed value = " + numInt);

        // Autoboxing
        int numPrimitive = 20;
        Integer numBoxed = numPrimitive; // autoboxing primitive to wrapper
        System.out.println("Autoboxed value = " + numBoxed);
    }
}
