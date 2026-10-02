package Strings.Snowball_String;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if(string.isEmpty()){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        char last = string.charAt(string.length() - 1);
        if(last != '.' && last != '?'){
            System.out.println("Incorrect terminating character");
            sc.close();
            return;
        }
        string = string.substring(0,string.length()-1);
        string = string.trim();
        String[] words = string.split("\\s+");

        boolean snowball = true;
        for(int i = 1;i<words.length;i++){
            if(words[i].length() != words[i-1].length()+1){
                snowball = false;
                break;
            }
        }
        if(snowball){
            System.out.println("It is a snowball string");
        }else{
            System.out.println("It is not a snowball string");
        }
        sc.close();
    }
}
