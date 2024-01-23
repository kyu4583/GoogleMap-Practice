package com.example.GoogleMapPractice.domain;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PolylineEncoder {
    public static void main(String[] args) throws IOException {
        // 여기에 좌표 데이터를 추가하세요.
        List<LatLng> path = parseJsonToLatLngList("{\n" +
                "  \"coordinates\" : [ {\n" +
                "    \"latitude\" : 37.45166232099496,\n" +
                "    \"longitude\" : 126.6572035342624\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45166232099496,\n" +
                "    \"longitude\" : 126.6572035342624\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45155677692528,\n" +
                "    \"longitude\" : 126.65715909680104\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.4514290130695,\n" +
                "    \"longitude\" : 126.65710632738315\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45139568336585,\n" +
                "    \"longitude\" : 126.6570924406861\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45122070243398,\n" +
                "    \"longitude\" : 126.6570202299077\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45122070243398,\n" +
                "    \"longitude\" : 126.6570202299077\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45122070243398,\n" +
                "    \"longitude\" : 126.6570202299077\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451354011446554,\n" +
                "    \"longitude\" : 126.65652027180319\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451354011446554,\n" +
                "    \"longitude\" : 126.65652027180319\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451354011446554,\n" +
                "    \"longitude\" : 126.65652027180319\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45111792587021,\n" +
                "    \"longitude\" : 126.65641195490292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45111792587021,\n" +
                "    \"longitude\" : 126.65641195490292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45111792587021,\n" +
                "    \"longitude\" : 126.65641195490292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45102071426319,\n" +
                "    \"longitude\" : 126.65637307225902\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45102071426319,\n" +
                "    \"longitude\" : 126.65637307225902\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45102071426319,\n" +
                "    \"longitude\" : 126.65637307225902\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451034600802465,\n" +
                "    \"longitude\" : 126.65633140900654\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45129844254962,\n" +
                "    \"longitude\" : 126.6553981534625\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451398422202175,\n" +
                "    \"longitude\" : 126.65490375133292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451398422202175,\n" +
                "    \"longitude\" : 126.65490375133292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451398422202175,\n" +
                "    \"longitude\" : 126.65490375133292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451365092351566,\n" +
                "    \"longitude\" : 126.65488153206242\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451365092351566,\n" +
                "    \"longitude\" : 126.65488153206242\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451365092351566,\n" +
                "    \"longitude\" : 126.65488153206242\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451398422202175,\n" +
                "    \"longitude\" : 126.65490375133292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451398422202175,\n" +
                "    \"longitude\" : 126.65490375133292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451398422202175,\n" +
                "    \"longitude\" : 126.65490375133292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45129844254962,\n" +
                "    \"longitude\" : 126.6553981534625\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451034600802465,\n" +
                "    \"longitude\" : 126.65633140900654\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45102071426319,\n" +
                "    \"longitude\" : 126.65637307225902\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45102071426319,\n" +
                "    \"longitude\" : 126.65637307225902\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45102071426319,\n" +
                "    \"longitude\" : 126.65637307225902\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45111792587021,\n" +
                "    \"longitude\" : 126.65641195490292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45111792587021,\n" +
                "    \"longitude\" : 126.65641195490292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45111792587021,\n" +
                "    \"longitude\" : 126.65641195490292\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451354011446554,\n" +
                "    \"longitude\" : 126.65652027180319\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451354011446554,\n" +
                "    \"longitude\" : 126.65652027180319\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.451354011446554,\n" +
                "    \"longitude\" : 126.65652027180319\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45122070243398,\n" +
                "    \"longitude\" : 126.6570202299077\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45122070243398,\n" +
                "    \"longitude\" : 126.6570202299077\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45122070243398,\n" +
                "    \"longitude\" : 126.6570202299077\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45139568336585,\n" +
                "    \"longitude\" : 126.6570924406861\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.4514290130695,\n" +
                "    \"longitude\" : 126.65710632738315\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45155677692528,\n" +
                "    \"longitude\" : 126.65715909680104\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45166232099496,\n" +
                "    \"longitude\" : 126.6572035342624\n" +
                "  }, {\n" +
                "    \"latitude\" : 37.45166232099496,\n" +
                "    \"longitude\" : 126.6572035342624\n" +
                "  } ]\n" +
                "}");

//        List<LatLng> path = parseJsonToLatLngList("{\n" +
//                "  \"coordinates\" : [ {\n" +
//                "    \"latitude\" : 38.5,\n" +
//                "    \"longitude\" : -120.2\n" +
//                "  }, {\n" +
//                "    \"latitude\" : 40.7,\n" +
//                "    \"longitude\" : -120.95\n" +
//                "  }, {\n" +
//                "    \"latitude\" : 43.252,\n" +
//                "    \"longitude\" : -126.453\n" +
//                "  } ]\n" +
//                "}");

        String encodedPath = encode(path);
        System.out.println("Encoded Polyline: " + encodedPath);
    }
    public static String encode(List<LatLng> path) {
        long lastLat = 0;
        long lastLng = 0;

        StringBuilder result = new StringBuilder();

        for (LatLng point : path) {
            long lat = Math.round(point.latitude * 1e5);
            long lng = Math.round(point.longitude * 1e5);

            long dLat = lat - lastLat;
            long dLng = lng - lastLng;

            encode(dLat, result);
            encode(dLng, result);

            lastLat = lat;
            lastLng = lng;
        }

        return result.toString();
    }

    private static void encode(long v, StringBuilder result) {
        v = v < 0 ? ~(v << 1) : v << 1;
        while (v >= 0x20) {
            result.append(Character.toChars((int) ((0x20 | (v & 0x1f)) + 63)));
            v >>= 5;
        }
        result.append(Character.toChars((int) (v + 63)));
    }

    public static List<LatLng> parseJsonToLatLngList(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);
        JsonNode coordinatesNode = rootNode.path("coordinates");
        List<LatLng> latLngList = new ArrayList<>();

        for (JsonNode coordinateNode : coordinatesNode) {
            double latitude = coordinateNode.path("latitude").asDouble();
            double longitude = coordinateNode.path("longitude").asDouble();
            latLngList.add(new LatLng(latitude, longitude));
        }

        return latLngList;
    }

}
