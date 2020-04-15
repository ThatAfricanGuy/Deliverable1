/*
 * SD Deliverable 3 - Main Class
 * By: Matheus DaSilva, Henry Elder, Matthew Schepers
 */
package sd.deliverable.pkg3;

import java.util.*;

/**
 *
 * @author Ritsu
 */
public class BlackJack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game("BlackJack");
        boolean cont = true;
        boolean playAgain = false;
        System.out.println("WELCOME TO BLACKJACK");
        game.setBotPlayer(new Player("Computer"));
        //Prompting the user for their ID and bet amount
        System.out.println("Please enter your player name/id:");
        game.getPlayer().setPlayerID(sc.next());
        do{
            System.out.print("What is the amount you would like to start with? \n");
            //Validating the input bet amount
            double bet;
            do {
                System.out.print("Please enter a positive amount $");
                while (!sc.hasNextInt()) {
                    String input = sc.next();
                    System.out.printf("\"%s\" is not a valid number.\n", input);
                }
                bet = sc.nextDouble();
            } while (bet < 0);
            game.getPlayer().setTotalBet(bet);
            //Initializing the deck
            game.getDeck().setCards();

            //Giving the player his cards
            game.getPlayer().getCardHand().add(game.getDeck().getRandomCard());
            game.getPlayer().getCardHand().add(game.getDeck().getRandomCard());
            //Giving the computer its cards
            game.getBotPlayer().getCardHand().add(game.getDeck().getRandomCard());
            game.getBotPlayer().getCardHand().add(game.getDeck().getRandomCard());
            //Gicing the player and comp their cards
            System.out.println("Your current cards are: "
                    + game.getPlayer().getCardHand().get(0).getCard() + " & "
                    + game.getPlayer().getCardHand().get(1).getCard());
            System.out.println("The computer got its 2 cards"
                    + game.getBotPlayer().getCardHand().get(0).getCard() + " & "
                    + game.getBotPlayer().getCardHand().get(1).getCard());

            loop: do {
                //Prompting and  validating user's choice
                String choice = "0";
                System.out.println("Choose one: \n( 1 ) Hit\n( 2 ) Stand\n"
                        + "( 3 ) Bet\n( 4 ) Quit");
                choice = sc.next(); 
                while(choice.charAt(0) != '1' && choice.charAt(0) != '2' &&
                        choice.charAt(0) != '3' && choice.charAt(0) != '4'){
                    System.out.println("Enter a valid option.");
                    choice = sc.next();
                }
                switch (Integer.parseInt(choice.charAt(0)+"")) {
                    //Playing hit
                    case 1:
                        if (game.playHit() == 0) {
                            cont = false;
                            break loop;
                        }
                        break;
                    //Playing stand
                    case 2:
                        game.playStand();
                        break loop;
                    //Betting more
                    case 3:
                        System.out.print("Enter how much more you want to bet $");
                        do {
                            System.out.print("Please enter a positive amount $");
                            while (!sc.hasNextInt()) {
                                String input = sc.next();
                                System.out.printf("\"%s\" is not a valid number.\n", input);
                            }
                            bet = sc.nextDouble();
                        } while (bet < 0);
                        game.playBet(bet);
                        break;
                    //Leaving the game
                    case 4:
                        System.out.println("Are you sure you want to quit? (y/n)");
                        System.out.println("You will lose: $" + game.getPlayer().getTotalBet());
                        if(sc.next().toLowerCase().charAt(0) == 'y')
                            break loop;
                        break;
                    default:
                        System.out.println("Enter a valid option.");
                        break;
                }
                
            } while (game.getPlayer().getTotalBet() > 0 || cont == true);
            //Asking the user if they want to play again
            System.out.println("Do you want to play again? (y/n)");
            if (sc.next().toLowerCase().charAt(0) == 'y')
                playAgain = true;
            else
                playAgain = false;
        }while(playAgain == true);

    }

}
