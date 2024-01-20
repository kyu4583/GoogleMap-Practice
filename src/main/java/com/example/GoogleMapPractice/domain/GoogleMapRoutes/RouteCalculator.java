package com.example.GoogleMapPractice.domain.GoogleMapRoutes;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class RouteCalculator {
    public static void main(String[] args) throws IOException {
        String json = "{\n" +
                "    \"routes\": [\n" +
                "        {\n" +
                "            \"legs\": [\n" +
                "                {\n" +
                "                    \"distanceMeters\": 770,\n" +
                "                    \"duration\": \"720s\",\n" +
                "                    \"staticDuration\": \"720s\",\n" +
                "                    \"polyline\": {\n" +
                "                        \"encodedPolyline\": \"urt{EtgspOMFkB{FPKkDmK{AsEy@sBo@kB?SKIiAqD|BsAMA\"\n" +
                "                    },\n" +
                "                    \"startLocation\": {\n" +
                "                        \"latLng\": {\n" +
                "                            \"latitude\": 36.1554733,\n" +
                "                            \"longitude\": -86.7751488\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"endLocation\": {\n" +
                "                        \"latLng\": {\n" +
                "                            \"latitude\": 36.157714999999996,\n" +
                "                            \"longitude\": -86.768228\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"steps\": [\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 9,\n" +
                "                            \"staticDuration\": \"7s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"urt{EtgspOMF\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1554733,\n" +
                "                                    \"longitude\": -86.7751488\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1555445,\n" +
                "                                    \"longitude\": -86.775193000000016\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"DEPART\",\n" +
                "                                \"instructions\": \"Head northwest on Rep. John Lewis Way S toward Peabody St\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"30 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 124,\n" +
                "                            \"staticDuration\": \"112s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"cst{E|gspOkB{F\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1555445,\n" +
                "                                    \"longitude\": -86.775193000000016\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1560822,\n" +
                "                                    \"longitude\": -86.7739275\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_RIGHT\",\n" +
                "                                \"instructions\": \"Turn right onto Peabody St\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"407 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"2 mins\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 12,\n" +
                "                            \"staticDuration\": \"21s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"ovt{E``spOPK\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1560822,\n" +
                "                                    \"longitude\": -86.7739275\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1559868,\n" +
                "                                    \"longitude\": -86.7738722\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_RIGHT\",\n" +
                "                                \"instructions\": \"Turn right onto 4th Ave S\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"39 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 536,\n" +
                "                            \"staticDuration\": \"505s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"}ut{Et_spOkDmK{AsEy@sBo@kB?SKIiAqD\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1559868,\n" +
                "                                    \"longitude\": -86.7738722\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1582724,\n" +
                "                                    \"longitude\": -86.7686626\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_LEFT\",\n" +
                "                                \"instructions\": \"Turn left onto Peabody St\\nPass by Subway (on the right in 0.2 mi)\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"0.3 mi\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"8 mins\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 80,\n" +
                "                            \"staticDuration\": \"68s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"edu{Eb_rpO|BsA\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1582724,\n" +
                "                                    \"longitude\": -86.7686626\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1576355,\n" +
                "                                    \"longitude\": -86.768238599999989\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_RIGHT\",\n" +
                "                                \"instructions\": \"Turn right\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"262 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 9,\n" +
                "                            \"staticDuration\": \"7s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"g`u{En|qpOMA\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1576355,\n" +
                "                                    \"longitude\": -86.768238599999989\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.157714999999996,\n" +
                "                                    \"longitude\": -86.768228\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_SHARP_LEFT\",\n" +
                "                                \"instructions\": \"Sharp left\\nDestination will be on the right\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"30 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"localizedValues\": {\n" +
                "                        \"distance\": {\n" +
                "                            \"text\": \"0.5 mi\"\n" +
                "                        },\n" +
                "                        \"duration\": {\n" +
                "                            \"text\": \"12 mins\"\n" +
                "                        },\n" +
                "                        \"staticDuration\": {\n" +
                "                            \"text\": \"12 mins\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"distanceMeters\": 770,\n" +
                "                    \"duration\": \"649s\",\n" +
                "                    \"staticDuration\": \"649s\",\n" +
                "                    \"polyline\": {\n" +
                "                        \"encodedPolyline\": \"u`u{El|qpOL@}BrAhApD?RJHnApDXl@vFvPTx@QJdBjFLG\"\n" +
                "                    },\n" +
                "                    \"startLocation\": {\n" +
                "                        \"latLng\": {\n" +
                "                            \"latitude\": 36.157714999999996,\n" +
                "                            \"longitude\": -86.768228\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"endLocation\": {\n" +
                "                        \"latLng\": {\n" +
                "                            \"latitude\": 36.1554733,\n" +
                "                            \"longitude\": -86.7751488\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"steps\": [\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 9,\n" +
                "                            \"staticDuration\": \"7s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"u`u{El|qpOL@\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.157714999999996,\n" +
                "                                    \"longitude\": -86.768228\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1576355,\n" +
                "                                    \"longitude\": -86.768238599999989\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"DEPART\",\n" +
                "                                \"instructions\": \"Head south\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"30 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 80,\n" +
                "                            \"staticDuration\": \"63s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"g`u{En|qpO}BrA\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1576355,\n" +
                "                                    \"longitude\": -86.768238599999989\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1582724,\n" +
                "                                    \"longitude\": -86.7686626\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_SHARP_RIGHT\",\n" +
                "                                \"instructions\": \"Sharp right toward Peabody St\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"262 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 536,\n" +
                "                            \"staticDuration\": \"457s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"edu{Eb_rpOhApD?RJHnApDXl@vFvPTx@\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1582724,\n" +
                "                                    \"longitude\": -86.7686626\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1559557,\n" +
                "                                    \"longitude\": -86.7739526\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_LEFT\",\n" +
                "                                \"instructions\": \"Turn left onto Peabody St\\nPass by Subway (on the left in 0.1 mi)\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"0.3 mi\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"8 mins\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 12,\n" +
                "                            \"staticDuration\": \"18s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"wut{Ed`spOQJ\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1559557,\n" +
                "                                    \"longitude\": -86.7739526\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1560501,\n" +
                "                                    \"longitude\": -86.7740073\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_RIGHT\",\n" +
                "                                \"instructions\": \"Turn right onto 4th Ave S\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"39 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 124,\n" +
                "                            \"staticDuration\": \"96s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"ivt{Ep`spOdBjF\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1560501,\n" +
                "                                    \"longitude\": -86.7740073\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1555445,\n" +
                "                                    \"longitude\": -86.775193000000016\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_LEFT\",\n" +
                "                                \"instructions\": \"Turn left onto Peabody St\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"407 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"2 mins\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"distanceMeters\": 9,\n" +
                "                            \"staticDuration\": \"8s\",\n" +
                "                            \"polyline\": {\n" +
                "                                \"encodedPolyline\": \"cst{E|gspOLG\"\n" +
                "                            },\n" +
                "                            \"startLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1555445,\n" +
                "                                    \"longitude\": -86.775193000000016\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"endLocation\": {\n" +
                "                                \"latLng\": {\n" +
                "                                    \"latitude\": 36.1554733,\n" +
                "                                    \"longitude\": -86.7751488\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"navigationInstruction\": {\n" +
                "                                \"maneuver\": \"TURN_LEFT\",\n" +
                "                                \"instructions\": \"Turn left onto Rep. John Lewis Way S\"\n" +
                "                            },\n" +
                "                            \"localizedValues\": {\n" +
                "                                \"distance\": {\n" +
                "                                    \"text\": \"30 ft\"\n" +
                "                                },\n" +
                "                                \"staticDuration\": {\n" +
                "                                    \"text\": \"1 min\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"travelMode\": \"WALK\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"localizedValues\": {\n" +
                "                        \"distance\": {\n" +
                "                            \"text\": \"0.5 mi\"\n" +
                "                        },\n" +
                "                        \"duration\": {\n" +
                "                            \"text\": \"11 mins\"\n" +
                "                        },\n" +
                "                        \"staticDuration\": {\n" +
                "                            \"text\": \"11 mins\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"distanceMeters\": 1540,\n" +
                "            \"duration\": \"1370s\"\n" +
                "        }\n" +
                "    ]\n" +
                "}"; // 여기에 JSON 데이터를 넣으세요.

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        JsonNode routes = rootNode.path("routes");
        double totalDistance = 0;
        int totalTime = 0;

        // 결과를 저장할 JSON 객체 생성
        ObjectNode result = mapper.createObjectNode();
        ArrayNode coordinates = mapper.createArrayNode();

        for (JsonNode route : routes) {
            JsonNode legs = route.path("legs");
            for (JsonNode leg : legs) {
                JsonNode steps = leg.path("steps");
                for (JsonNode step : steps) {
                    // 각 단계의 시작점과 끝점의 좌표 추출 및 저장
                    JsonNode startLocation = step.path("startLocation").path("latLng");
                    double startLatitude = startLocation.path("latitude").asDouble();
                    double startLongitude = startLocation.path("longitude").asDouble();
                    coordinates.add(mapper.createObjectNode().put("latitude", startLatitude).put("longitude", startLongitude));

                    JsonNode endLocation = step.path("endLocation").path("latLng");
                    double endLatitude = endLocation.path("latitude").asDouble();
                    double endLongitude = endLocation.path("longitude").asDouble();
                    coordinates.add(mapper.createObjectNode().put("latitude", endLatitude).put("longitude", endLongitude));

                    // 거리 추출
                    totalDistance += step.path("distanceMeters").asDouble();

                    // 시간 추출 및 변환 ('s' 제거)
                    String durationStr = step.path("staticDuration").asText().replace("s", "");
                    totalTime += Integer.parseInt(durationStr);
                }
            }
        }

        // 결과 JSON에 데이터 추가
        result.set("coordinates", coordinates);
        result.put("totalTimeSeconds", totalTime);
        result.put("totalDistanceMeters", totalDistance);

        // 결과 JSON을 문자열로 출력
        String resultJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
        System.out.println(resultJson);
    }
}