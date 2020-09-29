package Validation;
import java.util.*;
import java.util.regex.*;

public class UserRegistration
{
	
        public static void validateFirstName(String firstName)
	{
		String regex = "^[A-Z]{1}[a-zA-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);

		if(matcher.find()) {
			System.out.println(firstName + " is valid");
		}
                else {
			System.out.println(firstName + " is not valid");
                }
	}
	public static void main(String[] args) {
		String firstName = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		firstName = input.nextLine();
		validateFirstName(firstName);	
	}

}
