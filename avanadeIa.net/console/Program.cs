
using console.avanadeIa.net.Models; // this works

// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, " + 
    "World!"); // this works

Person person = new Person();
person.Age = 18;
person.Name = "Lorena";
person.Greet();

//you can import statically
console.avanadeIa.net.Models.Person copyPerson = new console.avanadeIa.net.Models.Person();
copyPerson.Age = 26;
copyPerson.Name = "Breno";
copyPerson.Greet();