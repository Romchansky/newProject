package module5;

import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {6, -37};
        int[][] targets = {
                {35, -37},
                {45, -37},
                {51, -37},
                {11, -37},
                {21, -37}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int index = -1;
        int distanceMax = Integer.MAX_VALUE;
        final int squareNum = 2;
        for (int i = 0; i < targets.length; i++) {
            for (int j = 1; j < targets.length; j++) {
                int distanceFind = (int) Math.sqrt(Math.pow(targets[i][0] - aiCoords[0], squareNum) +
                        Math.pow(targets[i][1] - aiCoords[1], squareNum));
                if (distanceFind < distanceMax) {
                    distanceMax = distanceFind;
                    index = i;
                }
            }
        }
        return targets[index];
    }
}
