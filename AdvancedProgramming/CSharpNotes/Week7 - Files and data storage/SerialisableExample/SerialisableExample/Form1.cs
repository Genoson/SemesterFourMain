using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Runtime.Serialization.Formatters.Binary;
using System.Runtime.Serialization;
using System.IO;

namespace SerialisableExample
{
    public partial class Form1 : Form
    {
        int i = 0;
        Person[] pList = new Person[100];
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string s = textBox1.Text;
            
            Person p = new Person(s);
            pList[i++] = p;


        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                BinaryFormatter formatter
                    = new BinaryFormatter();
                FileStream output = new FileStream("c:\\Person.dat", FileMode.OpenOrCreate,
                    FileAccess.Write);
                for (int j = 0; j < i; j++)
                    formatter.Serialize(output, pList[j]);
                output.Close();
            }

            catch (SerializationException)
            {
            }
            catch (FormatException)
            {
            }


        }
    }
}