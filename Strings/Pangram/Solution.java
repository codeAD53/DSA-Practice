package Strings.Pangram;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        boolean[] present = new boolean[26];
        for(int i =0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(Character.isLetter(ch)){
                present[ch - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for(int i = 0; i<26;i++){
            if(!present[i]){
            isPangram= false;
            break;
        }
        }
        if(isPangram){
            System.out.println("It is a Pangram");
        }else{
            System.out.println("It is not a Pangram");
        }
    }
}
