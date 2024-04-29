import java.util.Scanner;

public class Authentication{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the username");
String username = sc.next();

System.out.println("Enter the password");
String password = sc.next();

while(true){
try{
authenticate(username, password);
return;
} catch(InvalidPasswordException e){
e.printStackTrace();
System.out.println("Enter the password");
password = sc.next();
} catch(InvalidUsernameException e){
e.printStackTrace();
System.out.println("Enter the username");
username = sc.next();
}catch (Exception e){
return;
}
}
}

static void authenticate(String username, String password){
if(username.equals("username") && password.equals("password")){
System.out.println("Logged in successfully");
}else if(username.equals("username")){
throw new InvalidPasswordException();
}else{
throw new InvalidUsernameException();
}
}
}

class InvalidUsernameException extends RuntimeException{
InvalidUsernameException(){
super("Invalid username");
}
}

class InvalidPasswordException extends RuntimeException{
InvalidPasswordException(){
super("Invalid password");
}
}