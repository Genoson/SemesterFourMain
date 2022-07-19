using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;

namespace WindowsApplication1
{
    class Class1
    {
        private Button button1;
        private Form form1;
        public Class1(Button button1, Form form1)
        {
            this.button1 = button1;
            this.form1 = form1;
        }
        public void setButtonPosition(int x, int y)
        {
            this.button1.Location = new System.Drawing.Point(x, y);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(151, 40);
            this.button1.TabIndex = 0;
            this.button1.Text = "button1";
            this.button1.UseVisualStyleBackColor = true;
            // 
            form1.Controls.Add(this.button1);
            this.button1.Click += new System.EventHandler(this.button1_Click);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Button b = (Button)sender;
            MessageBox.Show("Button clicked somewhere" + b.Name);
            
            
        }

    }
}
