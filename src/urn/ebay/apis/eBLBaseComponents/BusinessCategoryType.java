/**
 * Auto generated code
 * BusinessCategoryType 
 */
package urn.ebay.apis.eBLBaseComponents;

public enum BusinessCategoryType {

 		CATEGORYUNSPECIFIED("Category-Unspecified"),
 		ANTIQUES("Antiques"),
 		ARTS("Arts"),
 		AUTOMOTIVE("Automotive"),
 		BEAUTY("Beauty"),
 		BOOKS("Books"),
 		BUSINESS("Business"),
 		CAMERASANDPHOTOGRAPHY("Cameras-and-Photography"),
 		CLOTHING("Clothing"),
 		COLLECTIBLES("Collectibles"),
 		COMPUTERHARDWAREANDSOFTWARE("Computer-Hardware-and-Software"),
 		CULTUREANDRELIGION("Culture-and-Religion"),
 		ELECTRONICSANDTELECOM("Electronics-and-Telecom"),
 		ENTERTAINMENT("Entertainment"),
 		ENTERTAINMENTMEMORABILIA("Entertainment-Memorabilia"),
 		FOODDRINKANDNUTRITION("Food-Drink-and-Nutrition"),
 		GIFTSANDFLOWERS("Gifts-and-Flowers"),
 		HOBBIESTOYSANDGAMES("Hobbies-Toys-and-Games"),
 		HOMEANDGARDEN("Home-and-Garden"),
 		INTERNETANDNETWORKSERVICES("Internet-and-Network-Services"),
 		MEDIAANDENTERTAINMENT("Media-and-Entertainment"),
 		MEDICALANDPHARMACEUTICAL("Medical-and-Pharmaceutical"),
 		MONEYSERVICEBUSINESSES("Money-Service-Businesses"),
 		NONPROFITPOLITICALANDRELIGION("Non-Profit-Political-and-Religion"),
 		NOTELSEWHERECLASSIFIED("Not-Elsewhere-Classified"),
 		PETSANDANIMALS("Pets-and-Animals"),
 		REALESTATE("Real-Estate"),
 		SERVICES("Services"),
 		SPORTSANDRECREATION("Sports-and-Recreation"),
 		TRAVEL("Travel"),
 		OTHERCATEGORIES("Other-Categories"),
		;
		private String value;
		BusinessCategoryType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static BusinessCategoryType fromValue(String v) {
			for (BusinessCategoryType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
