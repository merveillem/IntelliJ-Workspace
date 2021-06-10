import java.util.Scanner;
import java.util.Arrays;

public class LotteryGame {
    static final int NUM_DIGITS = 5;
    public static void main(String[] args)
    {
        int userInput []= new int[NUM_DIGITS]; //To store the count of chars
        int numberOfLottery[] = new int [NUM_DIGITS]; //To store the count of chars
        int matchCount = 0;

        Scanner in = new Scanner(System.in);

        greetUsers();//To show the greetings
        numberOfLottery = getLotteryNumbers(); //Getting the lottery values
        userInput = getUserPicks();//Getting the user input;
        matchCount = findMatches(numberOfLottery, userInput);

        System.out.println("\nLottery Numbers : ");
        for( int i = 0; i <  NUM_DIGITS; i++)
        {
            System.out.print(numberOfLottery[i] + " ");
        }

        //printing of the results
        System.out.println("\nNumber of matching digits: " + matchCount);
        if(matchCount == NUM_DIGITS)
        {
            System.out.println("GRAND PRIZE WINNER!");
        }
        else {
            System.out.println("Sorry, you didn't win");
        }
    }

    public static void greetUsers()//To greet the users
    {
        System.out.println("    Welcome to the Lottery Game");
        System.out.println("You will pick 5 numbers (0-9) and we will");
        System.out.println("see if you are the GRAND PRIZE WINNER!");
    }

    public static int [] getLotteryNumbers()//Getting the random lottery numbers
    {
        Scanner in = new Scanner(System.in);
        int[] myLotteryNumbers = new int[NUM_DIGITS];//int to hold the lottery numbers

        //filling the array with random numbers
        for( int i = 0; i < NUM_DIGITS; i++)//loop to get the random numbers
        {
            myLotteryNumbers[i]= 0 + (int)(Math.random() * (( 9 - 0 ) + 1));
        }
        Arrays.sort(myLotteryNumbers); //to sort the array
        return myLotteryNumbers; //To return the random numbers array
    }

    public static int[] getUserPicks()//To get the user input
    {
        Scanner in = new Scanner(System.in);
        int[] picks = new int[NUM_DIGITS];//To hold users number pick

        for(int i = 0; i < NUM_DIGITS; i++)
        {
            System.out.print("Enter pick " + (i + 1 ) + ": ");
            picks[i] = in.nextInt();//To read the input

            while (picks[i] < 0 || picks[i] > 9)//To validate the value is between 0-9
            {
                System.out.print("ERROR. Please enter a number (0-9): ");//error message
                picks[i] = in.nextInt();//to read the input
            }
        }
        Arrays.sort(picks);//to sort the array
        return picks;//to return the random array
    }
    static int findMatches(int[] myLotteryNumbers, int [] picks)
    {
        int count = 0;

        for(int i = 0; i < NUM_DIGITS; i++)//loop
        {
            for(int j = 0; j < NUM_DIGITS; j++)//loop
            {
                if(picks[j] == myLotteryNumbers[i])//if statement comparing the numbers
                {
                    count++;//increase the count if match
                    break;
                }
            }
        }
        return count;//returns the matching count
    }

}
