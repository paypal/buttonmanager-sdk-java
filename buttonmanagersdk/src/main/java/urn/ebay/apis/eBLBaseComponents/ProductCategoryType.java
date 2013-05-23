package urn.ebay.apis.eBLBaseComponents;

/**
 * 
 */
public enum  ProductCategoryType {

	OTHER("Other"),

	AIRLINES("Airlines"),

	ANTIQUES("Antiques"),

	ART("Art"),

	CAMERASPHOTOS("Cameras_Photos"),

	CARSBOATSVEHICLESPARTS("Cars_Boats_Vehicles_Parts"),

	CELLPHONESTELECOM("CellPhones_Telecom"),

	COINSPAPERMONEY("Coins_PaperMoney"),

	COLLECTIBLES("Collectibles"),

	COMPUTERSNETWORKING("Computers_Networking"),

	CONSUMERELECTRONICS("ConsumerElectronics"),

	JEWELRYWATCHES("Jewelry_Watches"),

	MUSICALINSTRUMENTS("MusicalInstruments"),

	REALESTATE("RealEstate"),

	SPORTSMEMORABILIACARDSFANSHOP("SportsMemorabilia_Cards_FanShop"),

	STAMPS("Stamps"),

	TICKETS("Tickets"),

	TRAVELS("Travels"),

	GAMBLING("Gambling"),

	ALCOHOL("Alcohol"),

	TOBACCO("Tobacco"),

	MONEYTRANSFER("MoneyTransfer"),

	SOFTWARE("Software");

	private String value;

	private ProductCategoryType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ProductCategoryType fromValue(String v) {
		for (ProductCategoryType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}