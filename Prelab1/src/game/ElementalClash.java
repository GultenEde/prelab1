
package game; 
import java.util.Random;

public class ElementalClash {
	private Player player1 ;
	private Player player2 ;
	private int numberRound ;
	private int numRounds;
	private int esitlik = 0 ;
	private static final Random RAND= new Random(2024);
	
	public void ElementalClash(String name1, String name2, int numRounds) {
		this.player1 = new Player(name1);
		this.player2 = new Player(name2);
		this.numRounds = numRounds;
		
		
	}
	
	private String getRandomChoice() {
		int karakter = RAND.nextInt(5);
		if (karakter == 0) {
			return "Fire" ;
		} else if (karakter == 1) {
			return  "Water";
		}else if ( karakter== 2) {
			return "Earth";
		}else if ( karakter== 3) {
			return  "Air";
		}else  {
			return "Lightning";
		}
	}
	
	private String determineWinner(String choice1, String choice2) {
		if (choice == choice2) {
			return "tiee";	
		}
		
		if (choice1 == "Fire"){
				if (choice2 == "Air "){
						player1.wonRound();
						return player1.getName() ;
						
				}else if (choice2 == "Lightning "){
						player1.wonRound();
						return player1.getName() ;
				}else {
					player2.wonRound();
					return player2.getName() ;
				}
				
		}else if (choice1 == "Water"){
				if (choice2 == "Fire "){
					player1.wonRound();
					return player1.getName() ;
				}else if (choice2 == "Lightning "){
					player1.wonRound();
					return player1.getName() ;
				}else {
					player2.wonRound();
					return player2.getName() ;
				}
		}else if (choice1 == "Earth"){
				if (choice2 == "Fire "){
					player1.wonRound();
					return player1.getName() ;
				}else if (choice2 == "Water "){
					player1.wonRound();
					return player1.getName() ;
				}else {
					player2.wonRound();
					return player2.getName() ;
				}
		}else if (choice1 == "Air"){
				if (choice2 == "Water "){
					player1.wonRound();
					return player1.getName() ;
				}else if (choice2 == "Earth "){
					player1.wonRound();
					return player1.getName() ;
				}else {
					player2.wonRound();
					return player2.getName() ;
				}
		}else if (choice1 == "Lightning"){
			if (choice2 == "Air "){
				player1.wonRound();
				return player1.getName() ;
			}else if (choice2 == "Earth"){
				player1.wonRound();
				return player1.getName() ;
			}else {
				player2.wonRound();
				return player2.getName() ;
			}
		}
			
			
	}
	
	public void printWinner() {
		if (player1.getRoundsWon()> player2.getRoundsWon()) {
			System.out.print(player1.getName()  + " is final winner" + player1.getName() + " won:" + player1.getRoundsWon()+" games"+ player2.getName() + " won :" + player2.getRoundsWon());
		}else if (player1.getRoundsWon()< player2.getRoundsWon()) {
			System.out.print(player2.getName() +  "is final winner" + player2.getName() + " won:" + player2.getRoundsWon()+" games"+ player1.getName() + " won :" + player1.getRoundsWon());
		}else {
			System.out.print("There is no winner, the game is tied");
		}
		
		if ((numRounds - player1.getRoundsWon() + player2.getRoundsWon()) ==0 ) {
			System.out.println( "There is no tie.");
		
		} else{
			System.out.print( "There is " + (numRounds - player1.getRoundsWon() - player2.getRoundsWon()) + "tie.");
		}
		
	
		
	}
	public void runGame() {
		for ( int round = 0; round < numRounds; round+=1 ) {
			System.out.println(" Round" + round );
			
			String player2Choise = getRandomChoice();
			System.out.println(player2.getName()+ "choose" + player2Choise);
			
			String player1Choise = getRandomChoice();
			System.out.println(player1.getName()+ "choose" + player1Choise);
			
			String winner = determineWinner(player1Choise, player2Choise);
			if  ( winner!= "tiee") {
				System.out.println("Result: it is a tie ");
			}else {
				System.out.println("Result:" + winner );
			}
			
			
		}
		
	}
}
