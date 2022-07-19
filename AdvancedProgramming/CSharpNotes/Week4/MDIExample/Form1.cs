using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace MDIExample
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void fileToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form2 frm = new Form2();
            frm.Name = string.Concat("Mdi child form" + this.MdiChildren.Length.ToString());
            frm.Text = frm.Name;
            frm.MdiParent = this;// Key line - tells child form who is the parent
            frm.Show();
        }
    }
}