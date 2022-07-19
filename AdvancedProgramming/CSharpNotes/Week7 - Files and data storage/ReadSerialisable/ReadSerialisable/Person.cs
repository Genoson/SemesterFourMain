using System;
using System.Collections.Generic;
using System.Text;

namespace ReadSerialisable
{
    [Serializable]
    class Person
    {
        string name;
        public Person(string name)
        {
            this.name = name;
        }
        public string Name
        {
            set
            {
                name = value;
            }
            get
            {
                return name;
            }
        }

    }
}

