package Validation;
import java.util.*;
import java.util.regex.*;

public class UserRegistration
{

	public static void validateName(String name)
	{
		String regex = "^[A-Z]{1}[a-zA-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);

		if(matcher.find()) {
			System.out.println(name + " is valid");
		}
		else {
			System.out.println(name + " is not valid");
		}
	}
	public static void validateEmail(String Email) {
		String expression = "^abc?[.][A-Za-z]*@bl[.]co[.][A-Za-z]{2,}$"; // Pattern for Email
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			System.out.println("Email is Valid");
		}
		else {
			System.out.println("Email is invalid");
		}
	}
	public static void validateMobile(String mobileNumber)
	{
		String regex="[0-9]{2}[ ][1-9][0-9]{9}";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(mobileNumber);

		if(matcher.find())
			System.out.println(mobileNumber + " is valid");
		else
			System.out.println(mobileNumber + " is not valid");
	}
	public static void validatePassword(String password)
    {
        String regex="(?=.*[A-Z])[a-zA-Z0-9@_-#$%^&*]{8,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);

        if(matcher.find()) {
            System.out.println(password + " is valid");
        }
        else {
            System.out.println(password + " is not valid");
        }
    }

	public static void main(String[] args) {
		String firstName = "";
		String lastName = "";
		String email = "";
		String mobileNumber = "";
		String password = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		firstName = input.nextLine();
		validateName(firstName);//validation of first name	
		System.out.println("Enter the last name");
		lastName = input.nextLine();
		validateName(lastName);//validation of last name
		System.out.println("Enter the Email");
		email = input.nextLine();
		validateEmail(email);//validation of Email
		System.out.println("Enter the Mobile Number");
		mobileNumber = input.nextLine();
		validateMobile(mobileNumber);//validation of MobileNumber
		System.out.println("Enter the password");
		password = input.nextLine();
		validatePassword(password);//validation of password
	}

}
