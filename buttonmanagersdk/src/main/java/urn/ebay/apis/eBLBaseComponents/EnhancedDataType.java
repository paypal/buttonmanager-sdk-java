package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.AirlineItineraryType;
import com.paypal.core.SDKUtil;

/**
 * Enhanced Data Information. Example: AID for Airlines 
 */
public class EnhancedDataType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private AirlineItineraryType airlineItinerary;

	

	/**
	 * Default Constructor
	 */
	public EnhancedDataType (){
	}	

	/**
	 * Getter for airlineItinerary
	 */
	 public AirlineItineraryType getAirlineItinerary() {
	 	return airlineItinerary;
	 }
	 
	/**
	 * Setter for airlineItinerary
	 */
	 public void setAirlineItinerary(AirlineItineraryType airlineItinerary) {
	 	this.airlineItinerary = airlineItinerary;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(airlineItinerary != null) {
			sb.append(airlineItinerary.toXMLString(preferredPrefix,"AirlineItinerary"));
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}