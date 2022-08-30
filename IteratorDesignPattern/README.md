# Iterator Design Pattern
Hiding implementation detail and/or avoiding duplicate code by not caring about the data structure you're using.

*Obs: The predefined data simulates an existent database and that's why the app doesn't allow adding. The focus is to use the iterator to extract info from differents collections/data structures in an uniform way.*

## Flow explanation

- There are four data providers and each one with a different data structure. They provide a [DataClass](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataClass.java) type of data that contains user info.
- To extract the data from the providers a [DataHandler](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataHandler.java) class is used where it'll get the iterator from each provider and search all data delivered.
- Every data provider MUST allow an iterator to be given by implementing the [iterator interface](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataIterator.java).
- Then the [main App](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/Main.java) file will use the DataHandler class to search by name to find some data.

## Advantages

If this design pattern wasn't used, the providers would all need to work with the same data structure or the data handler would need to add a case/if or even create new files to work with each data structure.

By making the providers implement this interface and return an iterator, it's possible to avoid checking those multiple scenarios. That way, we hide the implementation detail because it's all the same as long as an iterator is provided, thus allowing future changes and we also can avoid writing that much code for every situation.

## [Files](https://github.com/HReborn/Random-Bits-of-Code/tree/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication)

- [DataIterator](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataIterator.java)
- [DataClass](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataClass.java)
- [Main](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/Main.java)
- [DataHandler](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataHandler.java)
- [DataProvider1](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataProvider1.java)
- [DataProvider2](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataProvider2.java)
- [DataProvider3](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataProvider3.java)
- [DataProvider4](https://github.com/HReborn/Random-Bits-of-Code/blob/main/IteratorDesignPattern/src/main/java/com/bitsofcode/iteratordesignpattern/avoidduplication/DataProvider4.java)
