using System;

namespace WindowsApplication1
{
	/// <summary>
	/// Summary description for Form1.
	/// </summary>
	public class NaughtsAndCrosses
	{

		public NaughtsAndCrosses()
		{
			TickTackToe t = new TickTackToe();
			bool player=false;
			do 
			{
				player=!player;// Change the player
				for(int i=0;i<3;i++) 
				{
					for(int j=0;j<3;j++) 
					{
						if(t.getSquare(i,j)==1)
							Console.Write("X ");
						else 
							Console.Write("0 ");
					}
					Console.WriteLine(" ");
				}
				if(player) 
				{
					Console.WriteLine("Player 1");
				} 
				else 
				{
					Console.WriteLine("Player 2");
				}
				int ierr;
				do 
				{
					Console.WriteLine("Set which square 1-3 (row)");
					string row=Console.ReadLine();
					Console.WriteLine("Set which square 1-3 (col)");
					string col=Console.ReadLine();
					int irow = Int16.Parse(row);
					irow--;
					int icol = Int16.Parse(col);
					icol--;
					if(player)
						ierr = t.setSquare(irow,icol,1);
					else 
						ierr = t.setSquare(irow,icol,2);
				} while (ierr != 2);
			} while (!t.getFinished());
		}
		
		[STAThread]
		static void Main() 
		{
			NaughtsAndCrosses nac = new NaughtsAndCrosses();
		}

	}
}
public class TickTackToe 
{
	private int [,] occupied = new int[3,3];
	public TickTackToe() 
	{
		for(int i=0;i<3;i++) 
		{
			for(int j=0; j<3; j++) 
			{
				occupied[i,j] = 0;
			}
		}
	}
	public int setSquare(int row, int col, int player) 
	{
		if(player != 1 && player != 2) return 1;
		if((row > 2) || (row < 0) || (col < 0) || (col > 2)) return -1;
		if(occupied[row,col] > 0) return 0;
		occupied[row,col] = player;
		return 2;// code for ok
	}
	public int getSquare(int row, int col) 
	{
		return occupied[row,col];
	}
	public bool getFinished() 
	{
        // Check for a win

		int i=0;
		bool win;
		return false;
	}
}
