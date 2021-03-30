package module5;

import java.util.Arrays;
import java.util.Objects;

class DistanceTest {


    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());

        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());

        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));

        System.out.println(new CircleIntersector(-7, -8, 7, 5, -8, 5));


        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());

    }
}

class Distance {
    private int startX;
    private int endX;
    private int startY;
    private int endY;


    Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        final int squareNum = 2;
        double result = Math.sqrt((Math.pow(endX - startX, squareNum) + (Math.pow(endY - startY, squareNum))));
        return (int) Math.round(result);
    }
}


class RectangleArea {
    private int[] coords;

    public RectangleArea(int[] coords) {
        this.coords = coords;
    }

    public int getArea() {
        return Math.abs((coords[2] - coords[0]) * (coords[3] - coords[1]));
    }

}

class CircleIntersector {
    private int x1;
    private int y1;
    private int r1;
    private int x2;
    private int y2;
    private int r2;


    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;

    }

    @Override
    public String toString() {
        final int squareNum = 2;
        double distance = Math.abs(Math.sqrt((Math.pow(x2 - x1, squareNum) + (Math.pow(y2 - y1, squareNum)))));
        int sumRadius = r1 + r2;
        return (distance <= sumRadius) ? "intersects" : "not intersects";
    }
}

class QuarkeTrack {
    private int sum;
    private int[] lines;

    public QuarkeTrack(int[] lines) {
        Arrays.sort(lines);
        this.lines = lines;
        for (int result : lines) {
            sum += result;
        }
        this.sum = sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return sum == that.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum);
    }
}
