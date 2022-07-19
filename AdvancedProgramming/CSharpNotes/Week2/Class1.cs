using System;
using System.Windows.Forms;

namespace Point
{
	/// <summary>
	/// Summary description for Class1.
	/// </summary>
	public class Point
	{
		private int x;
		private int y;
		public Point() 
		{
		}
		public Point(int xValue,int yValue) 
		{
			x=xValue;
			y=yValue;
		}
		public int X
		{
			get
			{
				return x;
			}
			set
			{
				x=value;
			}
		}
		public void setValues(int xValue, int yValue) 
		{
			x=xValue;
			y=yValue;
		}
		public int Y
		{
			get
			{
				return y;
			}
			set
			{
				y=value;
			}
		}

		
	}
	public class Circle : Point
	{
		private double radius;
		public Circle()
		{// Default constructor
		}
		public Circle(int xValue,int yValue, double radiusIn) 
		{ // Another constructor
			X=xValue;// Use the PROPERTIES of the Point class
			Y=yValue;
			setValues(xValue,yValue);  //OR USE a base class method to set parameters
			radius=radiusIn;  // Radius
		}

		public void setData(int xValue,int yValue, double radiusIn) 
		{
			setValues(xValue,yValue);
			radius=radiusIn;
		}
		public double Radius
		{
			get
			{
				return radius;
			}
			set
			{
				radius=value;
			}
		}

	}
	public class Test 
	{
		public static void Main() 
		{
			Point p = new Point();
			p.X=100;
			p.Y=100;
			String output="Point values are "+p.X+" "+p.Y+"\n"; 
			Circle c = new Circle(200,200,20.0);
			output += "Circle position is "+c.X+" " + c.Y+"\n";
			output += "Circle diameter is "+c.Radius;
			MessageBox.Show(output,"Point and Circle example");
		}
	}
}

