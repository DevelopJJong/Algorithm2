package String.중복문자제거;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
