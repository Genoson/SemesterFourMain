using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
    
namespace WindowsApplication1
{
    public partial class Form1 : Form
    {
        private System.Windows.Forms.Button button2;
        private Class1 battleshipClass;
        private int[] i = new int[100];
        private Class2 arrayTest;
        public Form1()
        {
            this.button2 = new System.Windows.Forms.Button();
            arrayTest = new Class2(i);
            arrayTest.setValues();
            arrayTest.getValues(ref i);
            string s="Hello";
            for(int kkk=0;kkk<i.Length;kkk++) {
                 s += Convert.ToString(i[kkk]);

                 
            }
            MessageBox.Show(s);
           
            InitializeComponent();
            // Pass across a reference to the button and the form
            battleshipClass = new Class1(button2,this);
            battleshipClass.setButtonPosition(100, 100);

        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Button clicked somewhere"+sender);
        }
    }
}