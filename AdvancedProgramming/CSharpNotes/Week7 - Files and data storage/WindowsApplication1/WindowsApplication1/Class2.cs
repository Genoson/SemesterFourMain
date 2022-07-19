using System;
using System.Collections.Generic;
using System.Text;

namespace WindowsApplication1
{
    class Class2
    {
        private int[] i;
        // Example of passing an array to a method (a constructor in this case)
        public Class2(int[] i)
        {
            this.i = i;
        }
        public void setValues()
        {
            // set some arbritrary values in i
            for (int j = 0; j < i.Length; j++)
            {
                i[j] = j;
            }
        }
        // Example of passing back an array
        public  void getValues(ref int[] i)
        {
            i=this.i;
        }
    }
}
