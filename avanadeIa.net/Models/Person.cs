using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace avanadeIa.net.Models
{
    public class Person
    {
        public int Age { get; set; }
        public string Name { get; set; }

          public void Greet()
        {
            Console.WriteLine("Hello, my name is " +
            $"{Name} and i am {Age} years old."); //this works
        }
    }
  
}