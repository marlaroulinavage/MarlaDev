public class PlayerInterface {

    public static void main(String[] args) {
    	String playerFirstName = "";
        System.out.println("Hello and Welcome.");
        Player newPlayer = new Player("Marla", "Roulinavage");

        playerFirstName = newPlayer.getFirstName();
        System.out.println("Welcome " + playerFirstName);
    }

}