package Arrays.Island_Perimeter;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int GridRow = sc.nextInt();
        int GridCol = sc.nextInt();

        int[][] Grid = new int[GridRow][GridCol];
        for (int i = 0; i < GridRow; i++) {
            for (int j = 0; j < GridCol; j++) {
                Grid[i][j] = sc.nextInt();
            }
        }
        int perimeter = 0;
        for (int i = 0; i < GridRow; i++) {
            for (int j = 0; j < GridCol; j++) {
                if (Grid[i][j] == 1) {
                    if (i == 0 || Grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    if (i == GridRow - 1 || Grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    if (j == 0 || Grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    if (j == GridCol - 1 || Grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }
        System.out.println(perimeter);
        sc.close();
    }
}
