package String.대소문자변환;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i=0; i< str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
               result += Character.toLowerCase(str.charAt(i));
            }
            else if(Character.isLowerCase(str.charAt(i))){
                result += Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(result);
    }

}
