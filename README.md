Purpose :-
The purpose of this Java_Assigment is to provides functionality to determine the country code based on geographic coordinates (latitude and longitude). It maintains a list of Country objects and checks if the given coordinates fall within the bounding box of any country in the list.This implementation does not rely on External API Calls; insted, it  uses a Local in-memory dataset of bounding boxes to map Coordinates of Countries.

Country Class :-The Country class represents a geographical region defined by a country code and its bounding box coordinates (latitude and longitude).

Fiels used in Country Class is 
	-> String code: The country code (e.g., "US" for the United States).
	-> double minLat: The minimum latitude of the country's bounding box.
	-> double maxLat: The maximum latitude of the country's bounding box.
	-> double minLon: The minimum longitude of the country's bounding box.
	-> double maxLon: The maximum longitude of the country's bounding box.

Constructor:-
	There is Parameterized Constructor Which is used To Store The Value of Country code, Max and Min Latitude and Max and Min longitude.
	-> public Country(String code, double minLat, double maxLat, double minLon, double maxLon)

Methods:- public boolean contains(double lat, double lon)
  Description: Checks if a given latitude and longitude are within the country's bounding box.
  Parameters:
	-> lat: The latitude to check.
	-> lon: The longitude to check.
  Returns: true if the latitude and longitude are within the bounding box, otherwise false.

Geo_Location_ToCountry Class:- The Geo_Location_ToCountry class contains a list of Country objects and provides a method to determine the country code based on given latitude and longitude coordinates.

Fields :-
	->private static final List<Country> COUNTRIES:- A list of predefined Country objects representing different 		countries and their bounding boxes.
	->Static Block:- Initializes the COUNTRIES list with specific Country objects, defining the bounding boxes for the 		United States, Canada, and India.
		eg. COUNTRIES.add(new Country("IN", 6.554607, 35.674545, 68.111379, 97.395358));
  
Methods :-
	public static String getCountryCode(double latitude, double longitude)
	-> Description: Determines the country code based on the provided latitude and longitude by checking which 		country's bounding box contains the coordinates.
 
Parameters:
	->latitude: The latitude to check.
	->longitude: The longitude to check.
Returns: The country code if the coordinates are within a country's bounding box, otherwise returns "Unknown".

	public static void main(String[] args)
Description: The main method for running the application. It prompts the user to enter latitude and longitude, and then prints the corresponding country code.

