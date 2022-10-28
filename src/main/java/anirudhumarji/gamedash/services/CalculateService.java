package anirudhumarji.gamedash.services;

import java.util.HashMap;
import java.util.Map;

public class CalculateService {
    public static Double distanceRegionA(Integer x, Integer y) {
        int baseX = 0;
        int baseY = 0;
        return Math.sqrt(Math.pow(x - (double) baseX, 2) + Math.pow(y - (double) baseY, 2));
    }

    public static Double distanceRegionB(Double theta, Integer x, Integer y) {
        int baseX = 0;
        int baseY = 0;
        return Math.sqrt(Math.pow(x - (double) baseX - Math.cos(theta), 2) + Math.pow(y - (double) baseY - Math.sin(theta), 2));
    }

    public static Double distanceRegionABPlus(Double theta, Integer x, Integer y) {
        int baseX = 0;
        int baseY = 0;
        return ( (y - (double) baseY)*Math.cos(theta) - (x - (double) baseX)*Math.sin(theta) );
    }

    public static Double distanceRegionABMinus(Double theta, Integer x, Integer y) {
        int baseX = 0;
        int baseY = 0;
        return ( (x - (double) baseX)*Math.sin(theta) - (y - (double) baseY)*Math.cos(theta) );
    }

    public static Double calculateSum() {
        Double minSum = Double.MAX_VALUE;

        // contains a list of points passed by the user
        HashMap<Integer, Integer> points = new HashMap<>();
        points.put(2,3);
        points.put(5,6);
        points.put(4,7);
        points.put(-2,9);
        points.put(-3,-5);

        // Let θ be the counterclockwise angle of line segment with respect to the positive x-axis
        Double theta = 10.0;

        Double deltaTheta = 45.0;


        while (theta <= 360) {
            Double sum = 0.0;
            for (Map.Entry<Integer, Integer> point : points.entrySet()) {

                // Region AB + B --> They Mirror each other
                if ((theta >= 0 && theta <= 90) || (theta > 270)) {
                    sum += distanceRegionABMinus(theta, point.getKey(), point.getValue());
                    sum += distanceRegionABPlus(theta, point.getKey(), point.getValue());
                    sum += distanceRegionB(theta, point.getKey(), point.getValue());
                }

                // Region A
                else if (theta > 90) {
                    sum += distanceRegionA(point.getKey(), point.getValue());
                }
            }

            System.out.println(sum);

            minSum = Math.min(minSum, sum);
            theta += deltaTheta;
        }

        return minSum;
    }
}
