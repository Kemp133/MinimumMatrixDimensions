package com.kt.MinimumMatrixDimensions;

import com.sun.istack.internal.NotNull;

public class MinimumMatrixDimensions {

    private static int width;
    private static int height;
    private static int maxInputs;
    private static int desiredInputs;

    public static void main(@NotNull String[] args){
        final int CONSOLE_INPUTS = 2;

        if(args.length != CONSOLE_INPUTS)
            System.exit(-1);

        maxInputs = Integer.parseInt(args[0]);
        desiredInputs = Integer.parseInt(args[1]);

        int[] result = calculateMinMatrix(maxInputs, desiredInputs);
    }

    private static int[] calculateMinMatrix(int maxInputs, int desiredInputs) {
        int[] currentBestWidthHeight = new int[2];

        if((maxInputs % 2) == 0) {
            for (int i = 1; i <= maxInputs; i++) {
                int[] newInputs = new int[]{i, maxInputs - 1};
            }
        }
//        else {
//
//        }

        //Shuts the compiler up while working on the program
        return new int[] {Integer.MAX_VALUE};
    }

    int totalPinsUsed() { return width + height; }
}
