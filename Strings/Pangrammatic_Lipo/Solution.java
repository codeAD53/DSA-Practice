package Strings.Pangrammatic_Lipo;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        boolean[] present = new boolean[26];
        for(int i = 0;i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(Character.isLetter(ch)){
                present[ch-'a'] = true;
            }
        }
        int missingCount = 1;
        char missingLetter = ' ';
        for(int i = 0; i< 26; i++){
            if(!present[i]){
                missingCount++;
                missingLetter = (char)('a' + i);
            }
        }
        if(missingCount == 1){
            System.out.println("Pangrammatic");
            System.out.println(missingLetter);
        }else{
            System.out.println("Not a Programmatic");
        }

    }
}
