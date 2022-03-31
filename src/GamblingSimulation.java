
public class GamblingSimulation
{
	int Start_Every_Day=100;
	int Bet_Every_Game=1;
	public static void WinLoss() 
	{   int cash =1;
		int win=0;
		int loos=0;
		if(cash==1) {
			win++;
			System.out.println("win the game"+win);
		}
		else {
			
			System.out.println("loss the game");
		}
	}
	public static void main(String args [])
	{
		WinLoss();
	}
}
