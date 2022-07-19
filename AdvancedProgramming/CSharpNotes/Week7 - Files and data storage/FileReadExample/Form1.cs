using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

using System.IO;
namespace FileReadExample
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            try
            {
                StreamReader s = File.OpenText("c:\\limerick.txt");
                do
                {
                    string line = s.ReadLine();
                    if (line == null) break;
                    textBox1.Text += line;
                    // Note, we could have used
                    // textBox1 += s.ReadToEnd();
                } while (true);
                textBox1.Text += "\n\n\n  End";
            }
            catch (FileNotFoundException)
            {
                MessageBox.Show("Error", "Cannot find limerick.txt");
            }
            catch (IOException ie)
            {
                MessageBox.Show("Error", "IO exception");
            }
        }
    }
}
