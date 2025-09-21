import java.util.Scanner;

public class NumberSystemsConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Choose an option: \n");
         System.out.println("1. Convert Binary to Other Bases");
         System.out.println("2. Convert Octal to Other Bases");
         System.out.println("3. Convert Decimal to Other Bases");
         System.out.println("4. Convert Hexadecimal to Other Bases");
         
         int choice = scan.nextInt();
         scan.nextLine();
         
         System.out.println("Enter the number");
         String input = scan.nextLine();
         
         switch(choice) {
         case 1: convertBinary(input); break;
         case 2: convertOctal(input); break;
         case 3: convertDecimal(input); break;
         case 4: convertHexadecimal(input); break;
         default: System.out.println("Please enter a valid option");
         }
         scan.close();
	}
	
	public static void convertBinary(String input) {
		
		int decimalVal = Integer.parseInt(input, 2); // To decimal
		
		String octalVal = Integer.toOctalString(decimalVal); // To octal
		
		String hexVal = Integer.toHexString(decimalVal); // To hexadecimal
		hexVal = hexVal.toUpperCase();
		
		System.out.println(input + " in octal is: " + octalVal);
		System.out.println(input + " in decimal is: " + decimalVal );
		System.out.println(input + " in hexadecimal is: " + hexVal);
    }
    
    public static void convertOctal(String input) {
    	
    	int decimalVal = Integer.parseInt(input, 8); // Convert octal to decimal
    	
        String binaryVal = Integer.toBinaryString(decimalVal);
        
        String hexVal = Integer.toHexString(decimalVal);
        hexVal = hexVal.toUpperCase();
		
		System.out.println(input + " in binary is: " + binaryVal);
		System.out.println(input + " in decimal is: " + decimalVal);
		System.out.println(input + " in hexadecimal is: " + hexVal);
    }
    
    public static void convertDecimal(String input) {
    	
    	int decimalVal = Integer.parseInt(input);
    	
    	String binaryVal = Integer.toBinaryString(decimalVal);
    	
    	String octalVal = Integer.toOctalString(decimalVal);
    	
    	String hexVal = Integer.toHexString(decimalVal);
        hexVal = hexVal.toUpperCase();
    	
    	System.out.println(input + " in binary is: " + binaryVal);
    	System.out.println(input + " in octal is: " + octalVal);
    	System.out.println(input + " in hexadecimal is: " + hexVal);
    }
    
    public static void convertHexadecimal(String input) {
    	
    	int decimalVal = Integer.parseInt(input, 16);
        
        String binaryVal = Integer.toBinaryString(decimalVal);
        
        String octalVal = Integer.toOctalString(decimalVal);
		
		System.out.println(input + " in binary is: " + binaryVal);
		System.out.println(input + " in octal is: " + octalVal);
		System.out.println(input + " in decimal is: " + decimalVal);
    }
}
