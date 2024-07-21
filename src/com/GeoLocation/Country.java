package com.GeoLocation;

public class Country {
	
	String code;
	double minLat;
	double maxLat;
	double minLon;
	double maxLon;
	
	
	public Country(String code, double minLat, double maxLat, double minLon, double maxLon) {
		this.code = code;
		this.minLat = minLat;
		this.maxLat = maxLat;
		this.minLon = minLon;
		this.maxLon = maxLon;
	}
	
	public boolean contains(double lat, double lon) {
        return lat >= minLat && lat <= maxLat && lon >= minLon && lon <= maxLon;
    }

}
