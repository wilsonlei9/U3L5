public class Lottery {
    private int lotteryNumber = 45;
    public Lottery()
    {
        //lotteryNumber = (int) (Math.random() * 100);
        if (lotteryNumber <= 9 || lotteryNumber >= 0)
        {
            lotteryNumber = Integer.parseInt("0") + lotteryNumber;

        }
    }
    public int getLotteryNumber()
    {
        return lotteryNumber;
    }
    public int determineWinnings(int userNumber)
    {
        if (userNumber == lotteryNumber)
        {
            return 100;
        }
        else if ((userNumber % 10 == lotteryNumber / 10) && (userNumber / 10 == lotteryNumber % 10))
        {
            return 10;
        }
        else if (userNumber % 10 == lotteryNumber / 10 || userNumber % 10 == lotteryNumber % 10)
        {
            return 3;
        }
        else if (userNumber / 10 == lotteryNumber / 10 || userNumber / 10 ==  lotteryNumber % 10)
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }

}
