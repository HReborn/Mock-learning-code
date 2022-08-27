# A Generic List

Works almost the same as an ArrayList, probably less optimized. Made for fun and to test the iterable and iterator interfaces.

## Content Table
- [Features](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#features)
- [Creating the object](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#creating-the-object)
- [Adding](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#adding)
- [Removing](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#removing)
- [Convert to an object array](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#convert-to-an-object-array)
- [Size, Get item, Get index](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#size-get-item-get-index)
- [It's printable](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#its-printable)
- [TODO: Future ideas](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#todo-future-ideas)
- [Iterating and iterator](https://github.com/HReborn/Random-Bits-of-Code/tree/main/GenericList#iterating-and-iterator)

## Features
- Add/Instance with varargs, arrays and collections
- When it adds a single element, adds to the back of the list
- Remove element by index or providing the element
- Convert list into an Object array
- Get first index ocurrence of an item
- Get how many elements the list has
- Directly printable from System.out.println()
- It's iterable and also provides an Iterator object

*Obs: Demonstration will be done using strings, but any type can be used.*

### Creating the object
*Print the contents of the list to check if the action was executed correctly.*

- Empty list
```sh
GenericList<String> gList = new GenericList<>();
``` 
*Obs: If empty, `gList.getSize()` returns zero.*
- Varargs
```sh
GenericList<String> gList = new GenericList<>("First", "Second", "Third", "Fourth");
```
- Collections
```sh
Set<String> set = new HashSet<>(Arrays.asList("First", "Second", "Third", "Fourth"));
GenericList<String> gList = new GenericList<>(set);
```
*Obs: Can't instantiate with maps.*
- Arrays
```sh
String[] arr = {"First", "Second", "Third", "Fourth"};
GenericList<String> gList = new GenericList<>(arr);
```
### Adding

Any new elements are added to the back of the list.
- Single
```sh
GenericList<String> gList = new GenericList<>();
gList.add("First");
```
- Varargs
```sh
GenericList<String> gList = new GenericList<>();
gList.add("First", "Second");
```
- Arrays
```sh
GenericList<String> gList = new GenericList<>();
String[] arr = {"First", "Second", "Third"};
gList.add(arr);
```
- Collections
```sh
GenericList<String> gList = new GenericList<>();
Collection<String> list = new ArrayList<>(Arrays.asList("First", "Second", "Third"));
gList.add(list);
```
*Obs: Can't add with maps.*

### Removing
- By item
```sh
GenericList<String> gList = new GenericList<>("First", "Second", "Third", "Fourth");
gList.remove("Third");
```
- By index
```sh
GenericList<String> gList = new GenericList<>("First", "Second", "Third", "Fourth");
gList.remove(2); 
```
*Obs: Won't remove the second element, but the element with index 2.*
### Convert to an Object Array
```sh
GenericList<String> gList = new GenericList<>("First", "Second", "Third", "Fourth");
Object[] objArr = gList.getListAsArray();
```
### Size, Get item, Get index
```sh
GenericList<String> gList = new GenericList<>("First", "Second", "Third", "Fourth");
gList.getSize(); // 4
gList.get(2); // "Third"
gList.getIndex("Third"); // 2
```
### It's printable
```sh
GenericList<String> gList = new GenericList<>("First", "Second", "Third", "Fourth");
System.out.println(gList)
```
Output:
```sh
First
Second
Third
Fourth
```
### Iterating and iterator
- Supports for each
```sh
GenericList<String> gList = new GenericList<>("First", "Second");
for (String elmt : gList) {
    System.out.println(elmt);
}
```
Output:
```sh
First
Second
```
- Can manually use the iterator
```sh
GenericList<T> gList = new GenericList<>("First", "Second");
Iterator<String> iter = gList.iterator();
while (iter.hasNext()) {
    System.out.println(iter.next());
}
```
Output:
```sh
First
Second
```

# TODO: Future ideas
- TODO: Count how many ocurrences an item has
- TODO: Add an element into the provided index
- TODO: Sorting method
- TODO: Error Handling, impose limits
- TODO: Bulk remove from varargs, arrays and collections
- TODO: Clear method
