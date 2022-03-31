
public class GamblingSimulation
{
	int Start_Every_Day=100;
	int Bet_Every_Game=1;
	public static void WinLoss() 
	{   int cash =1;
		int win=0;
		int loos=0;
		if(Math.random()<0.5) {
			win++;
			System.out.println("win the game " +win);
		}
		else {
			loos--;
			System.out.println("loss the game"+loos);
		}
	}
	public static void main(String args [])
	{
		WinLoss();
	}
}
