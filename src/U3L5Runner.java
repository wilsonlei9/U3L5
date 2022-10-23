import java.util.Scanner;
public class U3L5Runner {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your lottery pick: ");
        int lotteryPick = s.nextInt();
        if (lottery.getLotteryNumber() == lotteryPick)
        {
            System.out.println("The lottery number is " + lottery.getLotteryNumber());
            System.out.print("Exact match: You win $" + lottery.determineWinnings(lotteryPick));
        }
        else if ((lottery.getLotteryNumber() % 10 == lotteryPick / 10) && (lottery.getLotteryNumber() / 10 == lotteryPick % 10))
        {
            System.out.println ("The lottery number is " + lottery.getLotteryNumber());
            System.out.print("Match all digits but not in correct order: You win $" + lottery.determineWinnings(lotteryPick));
        }
        else if (lottery.getLotteryNumber() % 10 == lotteryPick / 10 || lottery.getLotteryNumber() % 10 == lotteryPick % 10)
        {
            System.out.println ("The lottery number is " + lottery.getLotteryNumber());
            System.out.print("Match one digit: You win $" + lottery.determineWinnings(lotteryPick));
        }
        else if (lottery.getLotteryNumber() / 10 == lotteryPick / 10 || lottery.getLotteryNumber() / 10 == lotteryPick % 10)
        {
            System.out.println ("The lottery number is " + lottery.getLotteryNumber());
            System.out.print("Match one digit: You win $" + lottery.determineWinnings(lotteryPick));
        }
        else
        {
            System.out.println("The lottery number is " + lottery.getLotteryNumber());
            System.out.print("No matching numbers: You win $" + lottery.determineWinnings(lotteryPick));
        }

    }
}
