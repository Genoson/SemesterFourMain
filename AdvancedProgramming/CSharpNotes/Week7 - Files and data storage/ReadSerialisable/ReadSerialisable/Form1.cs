using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;
using System.Runtime.Serialization;

namespace ReadSerialisable
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
                BinaryFormatter reader = new BinaryFormatter();
                FileStream input = new FileStream("C:\\Person.dat", FileMode.Open, FileAccess.Read);
                Person p;
                do
                {
                    p = (Person)reader.Deserialize(input);
                    textBox1.Text += p.Name;
                } while (p != null);
            }
            catch (SerializationException)
            {
            }
            catch (FileNotFoundException)
            {
                MessageBox.Show("Cannot find file");
            }

        }
    }
}