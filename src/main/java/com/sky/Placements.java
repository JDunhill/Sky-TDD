package com.sky;

public class Placements {


        public static String getPlacementString(int placement) {

            if (placement % 10 == 1) {
                return placement + "st";
            } else if (placement % 10 == 2) {
                return placement + "nd";
            } else if (placement % 10 == 3) {
                return placement + "rd";
            } else {
                return placement + "th";
            }

    }
}
