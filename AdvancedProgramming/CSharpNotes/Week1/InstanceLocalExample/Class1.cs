
// LocalInstanceExample.cs
using System;
	class Class1
	{
		private string s="instance string";
		private int i = 10;
		// a simple method, with no return type, and no parameters

		public void Go() 
		{
			//Declare a couple of local variables
			// These will 'hide' the instance variables
			string s="local string";
			int i=5;
			Console.WriteLine("local string s is "+s);
			Console.WriteLine("local int i is "+i);
			// We can still reference the instance variables however, using the 'this' 
			// object reference
			Console.WriteLine("instance string s is "+this.s);
			Console.WriteLine("instance int i is "+this.i);
		}
	
		[STAThread]
		static void Main(string[] args)
		{
			//
			// TODO: Add code to start application here
			//
			Class1 c = new Class1();
			c.Go();
			Console.Read();

		}
	}
