package String.유효한팰린드롬;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String answer = "YES";
        for(int i=0; i<(str.length()-1)/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) answer="NO";
        }
        System.out.println(answer);
    }
}
