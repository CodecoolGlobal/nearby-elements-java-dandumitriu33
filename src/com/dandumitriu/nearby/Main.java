package com.dandumitriu.nearby;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        for (int elem : nearby(1, 3, 5)) {
            System.out.println(elem);
        }
    }

    public static int[] nearby(int x, int y, int range) {
        /**
         * Returns an int array with the nearby elements of the target at x,y.
         * x is the array, y is the position of the element in the array
         * range is the number of elements the method returns from each direction of y
         */
        int [][] multi = new int[][]{
                { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
                { 1, 3, 5, 7 },
                { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
        };
        ArrayList<Integer> nearbyList= new ArrayList<Integer>();
        int valid = 0;

        for (int i=0; i<range; i++) {
            try {
                nearbyList.add(multi[x][y + i + 1]);
                valid++;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            try {
                nearbyList.add(0, multi[x][y - i - 1]);
                valid++;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        int[] result = new int[valid];
        for (int i=0; i<valid; i++) {
            result[i]=nearbyList.get(i);
        }
        return result;
    };


}
