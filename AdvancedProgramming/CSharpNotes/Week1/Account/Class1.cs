using System;

namespace Account
{
	/// <summary>
	/// Summary description for Class1.
	/// </summary>
	public class Account
	{
		// Instance variable
		private double balance = 100;
  
		// One of the methods 
		public void Transaction(double amount) 
		{
			balance = balance + amount;
		}  // End of the method
        // Another method, to print out the balance
		public void Print() 
		{
			Console.WriteLine("The balance is "+balance);
		}
  
	
		/// The main entry point for the application.
		[STAThread]
		static void Main(string[] args)
		{
			//
			// TODO: Add code to start application here
			//
			Account jack = new Account();
			jack.Print();
			jack.Transaction(
			Account jill = new Account();
			jill.Print();
			Console.Read();
		}
	}
}
