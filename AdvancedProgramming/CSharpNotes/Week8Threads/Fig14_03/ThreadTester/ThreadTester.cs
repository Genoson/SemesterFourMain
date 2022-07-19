// Fig. 14.3: ThreadTester.cs
// Multiple threads printing at different intervals.

using System;
using System.Threading;

namespace threadTester
{
   // class ThreadTester demonstrates basic threading concepts
   class ThreadTester
   {
      static void Main( string[] args )
      {
         // Create and name each thread. Use MessagePrinter's
         // Print method as argument to ThreadStart delegate.
         MessagePrinter printer1 = new MessagePrinter();
         Thread thread1 = 
            new Thread ( new ThreadStart( printer1.Print ) );
         thread1.Name = "thread1";

         MessagePrinter printer2 = new MessagePrinter();
         Thread thread2 = 
            new Thread ( new ThreadStart( printer2.Print ) );
         thread2.Name = "thread2";

         MessagePrinter printer3 = new MessagePrinter();
         Thread thread3 = 
            new Thread ( new ThreadStart( printer3.Print  ) );
         thread3.Name = "thread3";

         Console.WriteLine( "Starting threads, each with random sleep time" );

         // call each thread's Start method to place each 
         // thread in Started state
         thread1.Start();
         thread2.Start();
         thread3.Start();

         Console.WriteLine( "Threads started\n" );
         Console.ReadKey();

      } // end method Main

   } // end class ThreadTester

   // Print method of this class used to control threads
   class MessagePrinter 
   {
      private int sleepTime;
      private Random random = new Random();
      
      // constructor to initialize a MessagePrinter object
      public MessagePrinter()
      {
         // pick random sleep time between 0 and 5 seconds
         sleepTime = random.Next( 5001 );
      }

      // method Print controls thread that prints messages
      public void Print() 
      {
         // obtain reference to currently executing thread
         Thread current = Thread.CurrentThread; 

         // put thread to sleep for sleepTime amount of time
         Console.WriteLine( 
            current.Name + " going to sleep for " + sleepTime );

         Thread.Sleep ( sleepTime );

         // print thread name, once thread has woken up again
         Console.WriteLine( current.Name + " done sleeping" );

      } // end method Print

   } // end class MessagePrinter
}
