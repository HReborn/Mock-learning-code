using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace avanadeIa.net.Models
{
    public class Person
    {
        public int age { get; set; }
        public int name { get; set; }

          public void greet()
        {
            Console.WriteLine($"Hello, my name is {name} and i am {age} years old.");
        }
    }
  
}