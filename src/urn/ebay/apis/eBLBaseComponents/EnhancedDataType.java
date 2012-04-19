
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.eBLBaseComponents.AirlineItineraryType;


/**
 * Enhanced Data Information. Example: AID for Airlines
 */
public class EnhancedDataType {

	/**
	 */
	private AirlineItineraryType AirlineItinerary;
	public AirlineItineraryType getAirlineItinerary() {
		return AirlineItinerary;
	}
	public void setAirlineItinerary(AirlineItineraryType value) {
		this.AirlineItinerary = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( AirlineItinerary != null ) {
			sb.append("<ebl:AirlineItinerary>");
			sb.append(AirlineItinerary.toXMLString());
			sb.append("</ebl:AirlineItinerary>");
		}
		return sb.toString();
	}

}
