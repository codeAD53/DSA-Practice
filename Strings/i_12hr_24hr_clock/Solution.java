package Strings.i_12hr_24hr_clock;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next().toUpperCase();
        if(!time.matches("(0[1-9]|1[0-2]):[0-5][0-9]:[0-5][0-9](AM|PM)")){
            System.out.println("Invalid time format, Enter in this format \"HH:MM:SSAM\" or \"HH:MM:SSPM\" ");
            sc.close();
            return;
        }
        String period = time.substring(8,10);
        int hour = Integer.parseInt(time.substring(0,2));
        if(period.equals("AM") && hour == 12){
                hour -= 12;
        }
        else{
            if(hour != 12){
                hour += 12;
            }
        }
        System.out.printf("%02d%s%n",hour,time.substring(2,8));
        sc.close();
    }
}
