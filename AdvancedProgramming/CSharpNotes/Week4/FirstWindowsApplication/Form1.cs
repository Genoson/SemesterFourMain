using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstWindowsApplication
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
            label1.Text = "button 1 pressed";
            listBox1.Items.Add("Hello1");
            listBox1.Items.Add("Hello2");
            listBox1.Items.Add("Hello3");
            listBox1.Items.Add("Hello4");
            listBox1.Items.Add("Hello5");
            listBox1.Items.Insert(0, "Hello string");
            progressBar1.Maximum = 10;
            progressBar1.Minimum = 0;
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // Stretches the image to fit the pictureBox.
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage ;
            DialogResult r = openFileDialog1.ShowDialog();
            
            if (r == DialogResult.OK)
            {
                Image MyImage = new Bitmap(openFileDialog1.OpenFile());
                //pictureBox1.ClientSize = new Size(xSize, ySize);
                pictureBox1.Image = (Image)MyImage;


            }
            else if (r == DialogResult.Cancel)
            {
                MessageBox.Show("Hello");
            }
            
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int i = listBox1.SelectedIndex;
            label1.Text = i.ToString();
        }

        private void textBox1_Enter(object sender, EventArgs e)
        {
            listBox1.Items.Add(textBox1);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string t = textBox1.Text;
            listBox1.Items.Add(t);
        }

        private void openToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DialogResult d = openFileDialog1.ShowDialog();
            
            
            
            
        }

        private void openToolStripMenuItem_Click_1(object sender, EventArgs e)
        {

        }

        private void exitToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            
            button1.Enabled = !checkBox1.Checked;

        }

        private void progressBar1_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            if(progressBar1.Value < progressBar1.Maximum) progressBar1.Value++;
        }

        private void openFileDialog1_FileOk(object sender, CancelEventArgs e)
        {

        }



    }
}