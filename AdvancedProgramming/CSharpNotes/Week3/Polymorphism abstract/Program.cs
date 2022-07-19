using System;
using System.Collections.Generic;
using System.Text;

namespace PolyMorphism1
{
    class Program
    {
        static void Main(string[] args)
        {
            Circle c = new Circle();
            Circle c1 = new Circle(100, 100, 3.0);
        }
    }
    public class Point
    {
        private int x;
        private int y;
        public Point()
        {
            Console.WriteLine("In default Point constructor");
            x = 0;
            y = 0;
        }
        public Point(int x, int y)
        {
            Console.WriteLine("In Point constructor x, y are " + x + " " + y);
            this.x = x;
            this.y = y;
        }

        public int X {
            get {
                return x;
            }
            set {
                this.x = value;
            }
        }
        public int Y {
            get {
                return y;
            }
            set {
                this.y = value;
            }
        }
        public override string ToString()
        {
            return "Point, x = " + x + "  y = " + y+  "  ";
        }
    }
    public class Circle : Point
    {
        // extends Point
        public Double radius;
        public Circle()
        {
            Console.WriteLine("In Circle Default Constructor");
            Console.WriteLine("Circle, x, y, radius are " + X + " " + Y + "  " + radius);
        }
        public Circle(int x, int y, double rad)
            : base(x, y)
        {
            Radius = rad;
            Console.WriteLine("In Circle Default Constructor");
            Console.WriteLine("Circle, x, y, radius are " + X + " " + Y + "  " + radius);
        }

            
        public double Radius
        {
            get
            {
                return radius;
            }
            set
            {
                this.radius = value;
            }
        }
        public override string ToString()
        {
            return "Centre = " + base.ToString() + ", Radius = " + Radius;
        }
    }



}
