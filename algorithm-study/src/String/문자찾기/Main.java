package String.문자찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine();
        char alphabet = sc.next().charAt(0);
        str = str.toLowerCase();
        alphabet = Character.toLowerCase(alphabet);

        for(int i=0; i<str.length(); i++){
            if(alphabet == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}