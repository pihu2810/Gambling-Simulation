
public class GamblingSimulation
{
   public static int Stake=100;
   public static int Bet=1;
   public static int stake;
   public static int Win=0;
   public static int Loose=0;
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
	  
	 
	 
	public static void main(String args [])
	{
		WinLoss();
		
	}
}
