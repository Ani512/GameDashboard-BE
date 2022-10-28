package anirudhumarji.gamedash.services;

import java.util.HashMap;
import java.util.Map;

public class BaseUrlService {

    public static Map<String, String> endPointList() {
        HashMap<String, String> endPoints = new HashMap<>();

        endPoints.put("/", "baseURL which returns list of all Endpoints.");
        endPoints.put("/version", "returns the version of the API being used.");
        endPoints.put("/calculate", "returns sum of distances from line segment");

        return endPoints;
    }
}
