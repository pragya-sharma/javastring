package Palindromm;
import java.util.Scanner;
public class Stringpalindrom {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
        rev = rev+s.charAt(i);
        }
        if(s==rev){
        System.out.println(s+" is palindrom");
        }
        else{
        System.out.println(s+" is not palindrom");
        }
    }
}


