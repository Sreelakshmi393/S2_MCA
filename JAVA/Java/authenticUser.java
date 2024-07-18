import java.util.Scanner;

public class authenticUser {
    public static void main(String[] args) {
        try{  
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the username : ");
            String username = sc.next();
            sc.nextLine();
            if(!username.equals("username")) throw new InvalidUsernameException();
            System.out.println("Enter the password : ");
            String password = sc.nextLine();
            if(!password.equals("password")) throw new InvalidPasswordException();
            System.out.println("Logged in successfully");
        }catch(InvalidUsernameException e){
            e.printStackTrace();
        }catch(InvalidPasswordException e){
            e.printStackTrace();
        }catch(Exception e){
            return;
        }
    }
}
class InvalidUsernameException extends RuntimeException{
    InvalidUsernameException(){
        super("Wrong username");
    }
}
class InvalidPasswordException extends RuntimeException{
    InvalidPasswordException(){
        super("Wrong password");
    }
}
