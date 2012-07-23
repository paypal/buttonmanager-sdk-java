package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.AirlineItineraryType;

/**
 * Enhanced Data Information. Example: AID for Airlines 
 */
public class EnhancedDataType{


	/**
	 * No Document Comments	 
	 */ 
	private AirlineItineraryType AirlineItinerary;

	

	/**
	 * Default Constructor
	 */
	public EnhancedDataType (){
	}	

	/**
	 * Getter for AirlineItinerary
	 */
	 public AirlineItineraryType getAirlineItinerary() {
	 	return AirlineItinerary;
	 }
	 
	/**
	 * Setter for AirlineItinerary
	 */
	 public void setAirlineItinerary(AirlineItineraryType AirlineItinerary) {
	 	this.AirlineItinerary = AirlineItinerary;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(AirlineItinerary != null) {
			sb.append("<ebl:AirlineItinerary>");
			sb.append(AirlineItinerary.toXMLString());
			sb.append("</ebl:AirlineItinerary>");
		}
		return sb.toString();
	}

}