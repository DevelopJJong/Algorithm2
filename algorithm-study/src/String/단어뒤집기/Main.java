package String.단어뒤집기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        String[] str = new String[num];
        for(int i=0; i<num; i++){
            str[i] = sc.next();
        }
        for(int i=0; i < num; i++){
            for(int j=str[i].length()-1; j>=0; j--){
            sb.append(str[i].charAt(j));
            }
            System.out.println(sb);
            sb.delete(0,str[i].length());
        }
    }
}
