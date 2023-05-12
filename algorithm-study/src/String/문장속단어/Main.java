package String.문장속단어;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array_str = str.split("\\s+");
        int result = array_str[0].length();
        String result_str = array_str[0];
        for(int i=0; i< array_str.length; i++){
            int len = array_str[i].length();
            if(result < len) {
                result = len;
                result_str = array_str[i];
            }
        }
        System.out.println(result_str);
    }
}
