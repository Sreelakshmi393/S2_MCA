import java.util.Scanner;

class strFun {
    Scanner sc = new Scanner(System.in);
    String str;

    strFun(){
        System.out.println("Enter a string");
        str = sc.nextLine();
    }

    void strFunctions(){
        System.out.println("toLowerCase() : " + str.toLowerCase());
        System.out.println("toUpperCase() : " + str.toUpperCase());
        System.out.println("charAt() : " + str.charAt(3));
        System.out.println("length() : " + str.length());
        System.out.println("substring(4) : " + str.substring(4));
        System.out.println("substring(4,8) : "+ str.substring(4,8));
        System.out.println("indexOf('w') : " + str.indexOf('w'));
        System.out.println("indexOf('o', 5) : " + str.indexOf('o', 5));
        System.out.println("concat() : " + str.concat(" there "));
        System.out.println("trim() : " + str.trim());
    }
}

class strManipulations{
    public static void main(String[] args){
        strFun s = new strFun();
        s.strFunctions();
    }
}