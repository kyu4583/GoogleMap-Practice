package com.example.GoogleMapPractice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class RouteRequestDto {
    int targetTime;
    LatLng origin;
    List<LatLng> intermediates;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();

        // 'origin'과 'destination' 추가
        json.put("origin", createLocationJson(this.origin));
        json.put("destination", createLocationJson(this.origin));

        // 'intermediates' 추가
        JSONArray intermediatesJson = new JSONArray();
        for (LatLng latLng : this.intermediates) {
            intermediatesJson.put(createLocationJson(latLng));
        }
        json.put("intermediates", intermediatesJson);

        return json;
    }

    private JSONObject createLocationJson(LatLng latLng) {
        JSONObject locationJson = new JSONObject();
        JSONObject latLngJson = new JSONObject();
        latLngJson.put("latitude", latLng.latitude);
        latLngJson.put("longitude", latLng.longitude);
        locationJson.put("latLng", latLngJson);
        return new JSONObject().put("location", locationJson);
    }
}
