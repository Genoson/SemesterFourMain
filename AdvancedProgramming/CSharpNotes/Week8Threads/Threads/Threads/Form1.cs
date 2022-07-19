using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Threading;

namespace Threads
{
    public partial class Form1 : Form
    {
        // The constructor for the Thread class requires a ThreadStart 
        // delegate that represents the method to be executed on the 
        // thread.  C# simplifies the creation of this delegate.
        private Thread t;
        
        public Form1()
        {

            t = new Thread(new ThreadStart(ThreadMethod));
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            // Start ThreadProc.  On a uniprocessor, the thread does not get 
            // any processor time until the main thread yields.  Uncomment 
            // the Thread.Sleep that follows t.Start() to see the difference.
            t.Start();
            //Thread.Sleep(0);
            for (int i = 0; i < 4; i++)
            {
                label1.Text = "Main thread: Do some work.";
                Thread.Sleep(0);
            }

            //Console.WriteLine("Main thread: Call Join(), to wait until ThreadProc ends.");
            t.Join();
            //Console.WriteLine("Main thread: ThreadProc.Join has returned.  Press Enter to end program.");
            //Console.ReadLine();

        }

        public void ThreadMethod ()
        {
            for (int i = 0; i < 10; i++)
            {
                label1.Text = "ThreadProc: " + i;
                // Yield the rest of the time slice.
                Thread.Sleep(0);
            }
        }

        private void button1_Click_1(object sender, EventArgs e)
        {

        }

        
    }
}