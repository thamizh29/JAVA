import java.util.Scanner;

public class Auth_flow{

static class Auth{
    String useremail, userpassword, email, password, method;
    Scanner value = new Scanner (System.in);
    
    Auth(){
        System.out.println("Enter the signin/sinup");
        method = value.nextLine();
        if (method.equalsIgnoreCase("signin")) {
            signin();
        }else{
            signup();
        }
    }

    void signup(){
        System.out.println("Signup page");
        System.out.println("Enter the email");
        useremail = value.nextLine();
        System.out.println("Enter the password");
        userpassword = value.nextLine();
        System.out.println("Successfully account was created");
        System.out.println("Press Enter to signin....");
        method = value.nextLine();
        signin();
    }

    void signin(){
        System.out.println("Signin page");
        System.out.println("Enter the email");
        email = value.nextLine();
        System.out.println("Enter the password");
        password = value.nextLine();
        if (email.equals(useremail) && password.equals(userpassword)) {
            System.out.println("Signin success...");
        }else{
            System.out.println("Invalid credential");
        }
    }
}
    public static void main(String[] args){
        System.out.println("Welcome to auth_flow");
        new Auth();
    }
}