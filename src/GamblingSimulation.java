import java.io.PrintStream;
import java.util.Random;

public class GamblingSimulation
{
   public static int Stake=100;
   public static int Bet=1;
   public static int stake;
   public static int Win=0;
   public static int Loose=0;
   public static int totalAmountEarned;
	  public static void WinLoss() 
	 { 
		  double winOrLoss = Math.floor(Math.random() * 10) % 2;
          if (Bet == winOrLoss) {
              System.out.println("Gambler has Won");
              Stake = Stake +1;
              System.out.println("The current stake is " + Stake);
          }
          else
          {
              System.out.println("The Gambler has lost");
              Stake = Stake -1;
              System.out.println("The remaining stake is: " + Stake);
          }
	 }
	  
	  public static int resignStake(){
	        while(Stake > 50 && Stake< 150) {
	        	WinLoss();
	        }
	        if(Stake == 50) {
	            System.out.println("The Gambler LOST 50% of stake, So he have to resign for the day. ");
	            
	        }
	        else {
	            System.out.println("The Gambler WON 50% of stake, So he have to resign for the day. ");
	        }
	        System.out.println(" ");
	        return 0;
	    }
	 
	  public static void totalAmountWinorLoss() {
	        int day = 20;
	        int totalMoney = 0;
	        for (int i = 0; i <= day; i++) {
	            int temp = resignStake();
	            if (temp - Stake >= 50) {
	                totalMoney = totalMoney + (temp - Stake);
	                System.out.println(" Winning day " + i + ": Money Won is" + totalMoney);
	            } else 
	                totalMoney = totalMoney + (Stake - temp);
	                System.out.println("Loosing day " + i + ": Money Lost  is " + totalMoney);
	            
	        }
	        System.out.println(" ");
	    }      
	  public static void eachMonth(){
	        int stake = Stake;
	        int month = 1;

	        while (month<=1) {
	            int day = 1;
	            System.out.println("Month " + month);

	            while (day <= 30) {
	                stake = Stake;

	                int rand = (int) Math.floor(Math.random() * 10) % 2;
	                if (rand == Bet) {
	                    stake = Stake + 1;
	                } else {
	                    stake = Stake - 1;
	                }

	                if (stake < Stake) {
	                    System.out.println("Day " + day + " lost by " + (Stake - stake) + " $ ");
	                } else {
	                    System.out.println("Day " + day + " won by " + (stake - Stake) + " $ ");
	                }
	                day++;
	            }
	            month++;
	            System.out.println();
	        }

	    }
	  public static PrintStream luckyUnluckyDay(){
	        int stake = Stake;
	        int month = 1;
	        int day = 1;
	        int UnluckyDay = 1;
	        int LuckyDay = 1;
	        int UnluckyMonth= 1;
	        int LuckyMonth = 1;
	        int LuckyDayMoney = Stake;
	        int UnluckyDayMoney = Stake;

	        while (month<=12) {
	            day = 1;
	            while(day<=30) {
	                stake = Stake;
	                Random rand = new Random();
	                int dailyGamePlayed = rand.nextInt(10);

	                for (int i = 0; i < dailyGamePlayed; i++) {

	                    int randcheck = (int)Math.floor(Math.random()*10) % 2;
	                    if (randcheck==Bet)
	                        stake = stake + 1;
	                    else
	                        stake = stake - 1;
	                }

	                if(LuckyDayMoney<stake){
	                    LuckyDay = day;
	                    LuckyMonth = month;
	                    LuckyDayMoney = stake;
	                }

	                if(UnluckyDayMoney>stake) {
	                    UnluckyDay = day;
	                    UnluckyMonth = month;
	                    UnluckyDayMoney = stake;
	                }
	                day++;
	            }
	            month++;
	        }
	        System.out.println("Lucky Day "+LuckyDay+" in the month "+LuckyMonth+" Maximum money won is "+(LuckyDayMoney - Stake)+" $ ");
	        return System.out.printf("Unlucky Day "+UnluckyDay+" in the month "+UnluckyMonth+" Maximum  money lost is " +(Stake - UnluckyDayMoney)+" $ ");
	    }

	public static void main(String args [])
	{
		WinLoss();
		resignStake();
		totalAmountWinorLoss();
		eachMonth();
		luckyUnluckyDay();
	}
}
