package com.GeoLocation;

import java.util.*;

public class Geo_Location_ToCountry {
	
    private static final List<Country> COUNTRIES = new ArrayList<>();
    
    static {
        COUNTRIES.add(new Country("US", 24.396308, 49.384358, -125.0, -66.93457));
        COUNTRIES.add(new Country("CA", 41.676555, 83.113883, -141.0, -52.617));
        COUNTRIES.add(new Country("IN", 6.554607, 35.674545, 68.111379, 97.395358));
    }
    
    public static String getCountryCode(double latitude, double longitude) {
        for (Country country : COUNTRIES) {
            if (country.contains(latitude, longitude)) {
                return country.code;
            }
        }
        return "Unknown";
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter latitude: ");
        double latitude = scanner.nextDouble();
        System.out.print("Enter longitude: ");
        double longitude = scanner.nextDouble();

        String countryCode = getCountryCode(latitude, longitude);
        System.out.println("Country Code: " + countryCode);
    }

}
