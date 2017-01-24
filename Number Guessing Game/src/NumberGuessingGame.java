import java.util.Scanner;

public class NumberGuessingGame
{
static int randomNumber;
static String name;
static int counter = 0;
		public static void main(String[] args)
			{	
			greetplayer();
			createRangeAndNumber();
			evaluateGuess();
			giveFeedback();
			}
		public static void greetplayer()		
			{	
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				name = userInput.nextLine();
			}	
		public static void createRangeAndNumber()
			{
				Scanner userInput2 = new Scanner(System.in);
				System.out.println("What range do you want?");
				int range = userInput2.nextInt();
				System.out.println("Guess a number between 1-" + range + ".");
				randomNumber = (int)(Math.random()* + range)+1;
				System.out.println("The random number is " + randomNumber);
			}
		public static void evaluateGuess()
			{
				Scanner userInput3 = new Scanner(System.in);
				int guessNumber = 1;
				boolean stillGuessing = true; 
				while (stillGuessing) 
					{
						
					int guess = userInput3.nextInt();
				System.out.println(guess);
					if (guess > randomNumber)
						{
						System.out.println("Too high. Guess again.");
						}
					else if (guess < randomNumber)
						{
						System.out.println("Too low. Guess again."); 
						}
					else
						{
						System.out.println("Correct, congrats " + name + ".");
						stillGuessing = false;
						}
					counter ++;
					}
				}
		public static void giveFeedback()
			{
				if (counter > 1)
					{
					System.out.println("It took you " + counter + " guesses.");
					}
				else
					{
					System.out.println("It took you " + counter + " guess");
					}
			}
		}

	
