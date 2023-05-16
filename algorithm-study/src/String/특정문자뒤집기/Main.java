package String.특정문자뒤집기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] str_ch = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(str_ch[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(str_ch[rt])){
                rt--;
            }
            else{
                char tmp = str_ch[lt];
                str_ch[lt] = str_ch[rt];
                str_ch[rt] = tmp;
                lt++;
                rt--;
            }

        }
        System.out.println(String.valueOf(str_ch));
    }
}
