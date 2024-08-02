public class CommandLineArgs
{
    public static void main(String[] args)
    {
        // convert into integer type
        int num1 = Integer.parseInt(args[0]);
        System.out.println("First Number: " +num1);
		
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Second Number: " +num2);
		
        int result1 = num1 + num2;
		int result2 = num1 - num2;
		
        System.out.println("Addition of two numbers is: " +result1);
		System.out.println("Subtraction of two numbers is: "+result2);
		System.out.println("\n*****Mathematical Functions*****\n");
		System.out.println("1. Maximum Number: "+Math.max(num1,num2));
		System.out.println("2. Minimum Number: "+Math.min(num1,num2));
		
		System.out.println("\n");
		System.out.println("3. Square Root of "+num1+": "+Math.sqrt(num1));
		System.out.println("4. Cube Root of "+num1+": "+Math.cbrt(num1));
		System.out.println("5. Logarithmic Value of "+num1+": "+Math.log(num1));
		System.out.println("6. Sine Value of "+num1+": "+Math.sin(num1));
        System.out.println("7. Cosine Value of "+num1+": "+Math.cos(num1));
		System.out.println("8. Tangent Value of "+num1+": "+Math.tan(num1));
		
		System.out.println("\n");
		System.out.println("9. Square Root of "+num2+": "+Math.sqrt(num2));
		System.out.println("10. Cube Root of "+num2+": "+Math.cbrt(num2));
		System.out.println("11. Logarithmic Value of "+num2+": "+Math.log(num2));
		System.out.println("12. Sine Value of "+num2+": "+Math.sin(num2));
        System.out.println("13. Cosine Value of "+num2+": "+Math.cos(num2));
		System.out.println("14. Tangent Value of "+num2+": "+Math.tan(num2));
	}
}