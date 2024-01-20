package com.example.GoogleMapPractice.domain.TmapRoutes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RouteCalculator {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\n" +
                "    \"type\": \"FeatureCollection\",\n" +
                "    \"features\": [\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.6572035342624,\n" +
                "                    37.45166232099496\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"totalDistance\": 556,\n" +
                "                \"totalTime\": 496,\n" +
                "                \"index\": 0,\n" +
                "                \"pointIndex\": 0,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"52m 이동\",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 200,\n" +
                "                \"pointType\": \"SP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.6572035342624,\n" +
                "                        37.45166232099496\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65715909680104,\n" +
                "                        37.45155677692528\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65710632738315,\n" +
                "                        37.4514290130695\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.6570924406861,\n" +
                "                        37.45139568336585\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.6570202299077,\n" +
                "                        37.45122070243398\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 1,\n" +
                "                \"lineIndex\": 0,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 52m\",\n" +
                "                \"distance\": 52,\n" +
                "                \"time\": 39,\n" +
                "                \"roadType\": 22,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.6570202299077,\n" +
                "                    37.45122070243398\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 2,\n" +
                "                \"pointIndex\": 1,\n" +
                "                \"name\": \"훼미리마트 인하대학교점\",\n" +
                "                \"description\": \"훼미리마트 인하대학교점 에서 우회전 후 인하로 을 따라 46m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"훼미리마트 인하대학교점\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 13,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.6570202299077,\n" +
                "                        37.45122070243398\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65652027180319,\n" +
                "                        37.451354011446554\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 3,\n" +
                "                \"lineIndex\": 1,\n" +
                "                \"name\": \"인하로\",\n" +
                "                \"description\": \"인하로, 46m\",\n" +
                "                \"distance\": 46,\n" +
                "                \"time\": 63,\n" +
                "                \"roadType\": 22,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65652027180319,\n" +
                "                    37.451354011446554\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 4,\n" +
                "                \"pointIndex\": 2,\n" +
                "                \"name\": \"피카소안경\",\n" +
                "                \"description\": \"피카소안경 에서 좌측 횡단보도 후 28m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"피카소안경\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"15\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 212,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65652027180319,\n" +
                "                        37.451354011446554\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65641195490292,\n" +
                "                        37.45111792587021\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 5,\n" +
                "                \"lineIndex\": 2,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 28m\",\n" +
                "                \"distance\": 28,\n" +
                "                \"time\": 19,\n" +
                "                \"roadType\": 21,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"15\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65641195490292,\n" +
                "                    37.45111792587021\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 6,\n" +
                "                \"pointIndex\": 3,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"직진 후 11m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 11,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65641195490292,\n" +
                "                        37.45111792587021\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65637307225902,\n" +
                "                        37.45102071426319\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 7,\n" +
                "                \"lineIndex\": 3,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 11m\",\n" +
                "                \"distance\": 11,\n" +
                "                \"time\": 9,\n" +
                "                \"roadType\": 21,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65637307225902,\n" +
                "                    37.45102071426319\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 8,\n" +
                "                \"pointIndex\": 4,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"우회전 후 137m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 13,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65637307225902,\n" +
                "                        37.45102071426319\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65633140900654,\n" +
                "                        37.451034600802465\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.6553981534625,\n" +
                "                        37.45129844254962\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65490375133292,\n" +
                "                        37.451398422202175\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 9,\n" +
                "                \"lineIndex\": 4,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 137m\",\n" +
                "                \"distance\": 137,\n" +
                "                \"time\": 114,\n" +
                "                \"roadType\": 0,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65490375133292,\n" +
                "                    37.451398422202175\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 10,\n" +
                "                \"pointIndex\": 5,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"좌회전 후 4m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 12,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65490375133292,\n" +
                "                        37.451398422202175\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65488153206242,\n" +
                "                        37.451365092351566\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 11,\n" +
                "                \"lineIndex\": 5,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 4m\",\n" +
                "                \"distance\": 4,\n" +
                "                \"time\": 4,\n" +
                "                \"roadType\": 0,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65488153206242,\n" +
                "                    37.451365092351566\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 12,\n" +
                "                \"pointIndex\": 6,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"경유지 후 4m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 0,\n" +
                "                \"pointType\": \"PP1\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65488153206242,\n" +
                "                        37.451365092351566\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65490375133292,\n" +
                "                        37.451398422202175\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 13,\n" +
                "                \"lineIndex\": 6,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 4m\",\n" +
                "                \"distance\": 4,\n" +
                "                \"time\": 3,\n" +
                "                \"roadType\": 0,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65490375133292,\n" +
                "                    37.451398422202175\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 14,\n" +
                "                \"pointIndex\": 7,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"우회전 후 137m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 13,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65490375133292,\n" +
                "                        37.451398422202175\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.6553981534625,\n" +
                "                        37.45129844254962\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65633140900654,\n" +
                "                        37.451034600802465\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65637307225902,\n" +
                "                        37.45102071426319\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 15,\n" +
                "                \"lineIndex\": 7,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 137m\",\n" +
                "                \"distance\": 137,\n" +
                "                \"time\": 114,\n" +
                "                \"roadType\": 0,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65637307225902,\n" +
                "                    37.45102071426319\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 16,\n" +
                "                \"pointIndex\": 8,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"좌회전 후 11m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 12,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65637307225902,\n" +
                "                        37.45102071426319\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65641195490292,\n" +
                "                        37.45111792587021\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 17,\n" +
                "                \"lineIndex\": 8,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 11m\",\n" +
                "                \"distance\": 11,\n" +
                "                \"time\": 39,\n" +
                "                \"roadType\": 23,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65641195490292,\n" +
                "                    37.45111792587021\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 18,\n" +
                "                \"pointIndex\": 9,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \"횡단보도 후 보행자도로 을 따라 28m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"15\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 211,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65641195490292,\n" +
                "                        37.45111792587021\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65652027180319,\n" +
                "                        37.451354011446554\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 19,\n" +
                "                \"lineIndex\": 9,\n" +
                "                \"name\": \"보행자도로\",\n" +
                "                \"description\": \"보행자도로, 28m\",\n" +
                "                \"distance\": 28,\n" +
                "                \"time\": 19,\n" +
                "                \"roadType\": 23,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"15\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.65652027180319,\n" +
                "                    37.451354011446554\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 20,\n" +
                "                \"pointIndex\": 10,\n" +
                "                \"name\": \"피카소안경\",\n" +
                "                \"description\": \"피카소안경 에서 우회전 후 인하로 을 따라 47m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"피카소안경\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 13,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.65652027180319,\n" +
                "                        37.451354011446554\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.6570202299077,\n" +
                "                        37.45122070243398\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 21,\n" +
                "                \"lineIndex\": 10,\n" +
                "                \"name\": \"인하로\",\n" +
                "                \"description\": \"인하로, 47m\",\n" +
                "                \"distance\": 47,\n" +
                "                \"time\": 33,\n" +
                "                \"roadType\": 21,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.6570202299077,\n" +
                "                    37.45122070243398\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 22,\n" +
                "                \"pointIndex\": 11,\n" +
                "                \"name\": \"훼미리마트 인하대학교점\",\n" +
                "                \"description\": \"훼미리마트 인하대학교점 에서 좌회전 후 51m 이동 \",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"훼미리마트 인하대학교점\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"\",\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 12,\n" +
                "                \"pointType\": \"GP\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"LineString\",\n" +
                "                \"coordinates\": [\n" +
                "                    [\n" +
                "                        126.6570202299077,\n" +
                "                        37.45122070243398\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.6570924406861,\n" +
                "                        37.45139568336585\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65710632738315,\n" +
                "                        37.4514290130695\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.65715909680104,\n" +
                "                        37.45155677692528\n" +
                "                    ],\n" +
                "                    [\n" +
                "                        126.6572035342624,\n" +
                "                        37.45166232099496\n" +
                "                    ]\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 23,\n" +
                "                \"lineIndex\": 11,\n" +
                "                \"name\": \"\",\n" +
                "                \"description\": \", 51m\",\n" +
                "                \"distance\": 51,\n" +
                "                \"time\": 40,\n" +
                "                \"roadType\": 21,\n" +
                "                \"categoryRoadType\": 0,\n" +
                "                \"facilityType\": \"11\",\n" +
                "                \"facilityName\": \"\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    126.6572035342624,\n" +
                "                    37.45166232099496\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"index\": 24,\n" +
                "                \"pointIndex\": 12,\n" +
                "                \"name\": \"끝\",\n" +
                "                \"description\": \"도착\",\n" +
                "                \"direction\": \"\",\n" +
                "                \"nearPoiName\": \"끝\",\n" +
                "                \"nearPoiX\": \"0.0\",\n" +
                "                \"nearPoiY\": \"0.0\",\n" +
                "                \"intersectionName\": \"끝\",\n" +
                "                \"facilityType\": \"\",\n" +
                "                \"facilityName\": \"\",\n" +
                "                \"turnType\": 201,\n" +
                "                \"pointType\": \"EP\"\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}";  // 여기에 GeoJSON 데이터를 넣으세요.

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        JsonNode features = rootNode.path("features");
        double totalDistance = 0;
        int totalTime = 0;

        for (JsonNode feature : features) {
            JsonNode geometry = feature.path("geometry");
            JsonNode coordinates = geometry.path("coordinates");
            JsonNode properties = feature.path("properties");

            if (geometry.path("type").asText().equals("Point")) {
                double latitude = coordinates.get(1).asDouble();
                double longitude = coordinates.get(0).asDouble();
                System.out.println("위도: " + latitude + ", 경도: " + longitude);
            } else if (geometry.path("type").asText().equals("LineString")) {
                for (JsonNode coordinate : coordinates) {
                    double latitude = coordinate.get(1).asDouble();
                    double longitude = coordinate.get(0).asDouble();
                    System.out.println("위도: " + latitude + ", 경도: " + longitude);
                }
                totalDistance += properties.path("distance").asDouble();
                totalTime += properties.path("time").asInt();
            }
        }

        System.out.println("총 소요 시간: " + totalTime + "초");
        System.out.println("총 이동 거리: " + totalDistance + "미터");
    }
}
