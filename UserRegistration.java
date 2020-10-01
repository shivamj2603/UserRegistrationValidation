package Validation;
import java.util.*;
import java.util.regex.*;

public class UserRegistration
{

	public static String validateName(String name)
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
		return null;
	}
	public static String validateEmail(String Email) {
		String expression = "^abc?[.][A-Za-z]*@bl[.]co[.][A-Za-z]{2,}$"; // Pattern for Email
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("invalid");
		}
		return null;
	}
	public static String validateMobile(String mobileNumber)
	{
		String regex = "[0-9]{2}[ ][1-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);

		if(matcher.find())
			System.out.println(mobileNumber + " is valid");
		else
			System.out.println(mobileNumber + " is not valid");
		return null;
	}
	public static String validatePassword(String password)
	{
		String regex = "(?=.*[A-Z])(?=.*[0-9])(?=.[@#$%^&*])[A-Z-a-z0-9]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);

		if(matcher.find()) {
			System.out.println(password + " is valid");
		}
		else {
			System.out.println(password + " is not valid");
		}
		return null;
	}
	private void verifyEmail() {
		//Valid email
		validateEmail("abc-100@yahoo.com");
		validateEmail("abc.100@yahoo.com");
		validateEmail("abc111@abc.com");
		validateEmail("abc-100@abc.net");
		validateEmail("abc.100@abc.com.au");
		validateEmail("abc@1.com");
		validateEmail("abc@gmail.com.com");
		validateEmail("abc+100@gmail.com");
		//Invallid email
		validateEmail("abc");
		validateEmail("abc@.com.my");
		validateEmail("abc123@gmail.a");
		validateEmail("abc123@.com");
		validateEmail("abc123@.com.com");
		validateEmail(".abc@abc.com");
		validateEmail("abc()*@gmail.com");
		validateEmail("abc@%*.com");
		validateEmail("abc..2002@gmail.com");
		validateEmail("abc.@gmail.com");
		validateEmail("abc@abc@gmail.com");
		validateEmail("abc@gmail.com.1a");
		validateEmail("abc@gmail.com.aa.au");
	}
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		String firstName = "";
		String lastName = "";
		String email = "";
		String mobileNumber = "";
		String password = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		firstName = input.nextLine();
		user.validateName(firstName);//validation of first name	
		System.out.println("Enter the last name");
		lastName = input.nextLine();
		user.validateName(lastName);//validation of last name
		System.out.println("Enter the Email");
		email = input.nextLine();
		user.validateEmail(email);//validation of Email
		System.out.println("Enter the Mobile Number");
		mobileNumber = input.nextLine();
		user.validateMobile(mobileNumber);//validation of MobileNumber
		System.out.println("Enter the password");
		password = input.nextLine();
		user.validatePassword(password);//validation of password
		user.verifyEmail();
	}

}
