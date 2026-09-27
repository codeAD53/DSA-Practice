package Strings.Lipogram;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char excluded = sc.next().toLowerCase().charAt(0);

        boolean found = false;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == excluded){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Lipogram");
        }else{
            System.out.println("There is no Lipogram");
        }
    }
}
