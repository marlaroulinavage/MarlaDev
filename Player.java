public class Player{

	public String firstName = "";
	public String lastName = "";
	private Boolean isValidPlayer = false;

	public Player( String inputFirstName, String inputLastName ) {
		// Validate the player input
		isValidPlayer = validatePlayer( inputFirstName, inputLastName );

		if( isValidPlayer){
			System.out.println( "Thanks for entering the correct data." );
			this.firstName = inputFirstName;
			this.lastName = inputLastName;
		} else {
			System.out.println( "I am very disappointed in you.");
		}
	}

	public String getFirstName(){
		return firstName;
	}

	public Boolean validatePlayer( String validateFirstName, String validateLastName){
		Boolean validationFlag = true;

		if (validateFirstName == "" || validateFirstName == null)
		 	validationFlag = false;

		if (validateLastName == "" || validateLastName == null)
		 	validationFlag = false;

		return validationFlag;
	}

}