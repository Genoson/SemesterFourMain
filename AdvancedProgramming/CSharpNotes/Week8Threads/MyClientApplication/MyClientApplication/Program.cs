using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;
using System.Net.Sockets;
using System.IO;


namespace MyClientApplication
{
    class MyClient
    {

      private NetworkStream output;
      private BinaryWriter writer;
      private BinaryReader reader;

      private string message = "";

      private Thread readThread;

      // default constructor
      public MyClient()
      {

         readThread = new Thread( new ThreadStart( RunClient ) );
         readThread.Start();
      }


      
      
      // connect to server and display server-generated text
      public void RunClient()
      {
         TcpClient client;

         // instantiate TcpClient for sending data to server
         try
         { 
            Console.WriteLine("Attempting connection\r\n");

            // create TcpClient and connect to server
            client = new TcpClient();
            client.Connect( "localhost", 5000 );

            // Step 2: get NetworkStream associated with TcpClient
            output = client.GetStream();

            // create objects for writing and reading across stream
            writer = new BinaryWriter( output );
            reader = new BinaryReader( output );

            Console.WriteLine("\r\nGot I/O streams\r\n");

            // loop until server signals termination
            do
            {

               // Step 3: processing phase
               try
               {
                  // read message from server
                  message = reader.ReadString();
                  Console.WriteLine("\r\n" + message); 
               }

                  // handle exception if error in reading server data
               catch ( Exception )
               {
                  System.Environment.Exit( 
                     System.Environment.ExitCode );
               }
            } while( message != "SERVER>>> TERMINATE" );
      
            Console.WriteLine("\r\nClosing connection.\r\n");

            // Step 4: close connection
            writer.Close();
            reader.Close();
            output.Close();
            client.Close();

         }

            // handle exception if error in establishing connection
         catch ( Exception error )
         {
            Console.WriteLine(error.ToString() );
         }

      } // end method RunClient

        static void Main(string[] args)
        {
            new MyClient();
        }

   } // end class Client
}

