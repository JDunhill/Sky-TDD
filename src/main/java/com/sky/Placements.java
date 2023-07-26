package com.sky;

public class Placements {


        public static String getPlacementString(int placement) {

            if (placement % 10 == 1 && placement % 100 != 11) {
                return placement + "st";
            } else if (placement % 10 == 2 && placement % 100 != 12) {
                return placement + "nd";
            } else if (placement % 10 == 3 && placement % 100 != 13) {
                return placement + "rd";
            } else {
                return placement + "th";
            }

    }
}
