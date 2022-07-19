using System;
using System.Collections.Generic;
using System.Text;
using System.Net.Sockets;
using System.Threading;
using System.IO;


namespace MyServerApplication
{
    class Server
    {
        private Socket connection;
        private Thread readThread;
        private NetworkStream socketStream;
        private BinaryWriter writer;
        private BinaryReader reader;
        public Server()
        {
            try
            {
                // run the delegate RunServer method within the thread
                readThread = new Thread(new ThreadStart(RunServer));
                // Start the thread
                readThread.Start();
            }
            catch (Exception)
            {
            }
            
        }
        public void RunServer()
        {
            TcpListener listener;
            int counter = 1;

            // wait for a client connection and display the text
            // that the client sends
            try
            {
                // Step 1: create TcpListener
                listener = new TcpListener(5000);

                // Step 2: TcpListener waits for connection request
                listener.Start();

                // Step 3: establish connection upon client request
                while (true)
                {
                    Console.WriteLine("Waiting for connection\r\n");

                    // accept an incoming connection
                    connection = listener.AcceptSocket();

                    // create NetworkStream object associated with socket
                    socketStream = new NetworkStream(connection);

                    // create objects for transferring data across stream
                    writer = new BinaryWriter(socketStream);
                    reader = new BinaryReader(socketStream);

                    Console.WriteLine( "Connection " + counter +
                       " received.\r\n");

                    // inform client that connection was successfull
                    writer.Write("SERVER>>> Connection successful");

                    
                    string theReply = "";

                    // Step 4: read String data sent from client
                    do
                    {
                        try
                        {
                            // read the string sent to the server
                            theReply = reader.ReadString();

                            // display the message
                            Console.WriteLine("\r\n" + theReply);
                        }

                           // handle exception if error reading data
                        catch (Exception)
                        {
                            break;
                        }

                    } while (theReply != "CLIENT>>> TERMINATE" &&
                       connection.Connected);

                    Console.WriteLine("\r\nUser terminated connection");

                    // Step 5: close connection
                    
                    writer.Close();
                    reader.Close();
                    socketStream.Close();
                    connection.Close();

                    ++counter;
                }
            } // end try

            catch (Exception error)
            {
                Console.WriteLine(error.ToString());
            }

        } // end method RunServer
        static void Main(string[] args)
        {
            new Server();
        }
    }
}

