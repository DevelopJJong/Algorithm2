package String.회문문자열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        String yesOrNo = "YES";

        for(int i=0; i<(str.length()-1)/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) yesOrNo = "NO";
        }

        System.out.println(yesOrNo);
    }
}
