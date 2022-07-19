using System;
using System.Collections.Generic;
using System.Text;
using System.IO;

namespace FilesExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // An example of opening and reading text files


            // Create a text file
            
            StreamWriter fWriter =
                 File.CreateText("C:\\limerick.txt");
            fWriter.WriteLine("That Computing is first about coding,");
            fWriter.WriteLine("Is a thought that I find simply foreboding.");
            fWriter.WriteLine("They should be taught instead");
            fWriter.WriteLine("About using their head");
            fWriter.WriteLine("or in ten years their careers will be folding");
            fWriter.Close();
                          

        }
    }
}
