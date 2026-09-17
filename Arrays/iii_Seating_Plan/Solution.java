package Arrays.iii_Seating_Plan;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int rem = N % 12;
        switch (rem) {
            case 1:
                System.out.println("WS"+" "+(N+11));
                break;
            case 2:
                System.out.println("MS"+" "+(N+9));
                break;
            case 3:
                System.out.println("AS"+" "+(N+7));
                break;
            case 4:
                System.out.println("AS"+" "+(N+5));
                break;
            case 5:
                System.out.println("MS"+" "+(N+3));
                break;
            case 6:
                System.out.println("WS"+" "+(N+1));
                break;
            case 7:
                System.out.println("WS"+" "+(N-1));
                break;
            case 8:
                System.out.println("MS"+" "+(N-3));
                break;
            case 9:
                System.out.println("AS"+" "+(N-5));
                break;
            case 10:
                System.out.println("AS"+" "+(N-7));
                break;
            case 11:
                System.out.println("MS"+" "+(N-9));
                break;
            case 0:
                System.out.println("WS"+" "+(N-11));
                break;
            default:
                break;
        }

    }
}
