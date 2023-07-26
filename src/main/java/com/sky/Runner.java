package com.sky;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        int winningPlacement = 1;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Enter the placement (1-100): ");
            winningPlacement = scanner.nextInt();
        }
        while (winningPlacement == 0 || winningPlacement > 100);

        System.out.println("These are the remaining dogs excluding " + winningPlacement + ": ");
        for (int i = 1; i <= 100; i++) {
            if (i == winningPlacement) {
                continue;
            }
            System.out.printf(Placements.getPlacementString(i) + " ");
        }
        scanner.close();
    }

}
