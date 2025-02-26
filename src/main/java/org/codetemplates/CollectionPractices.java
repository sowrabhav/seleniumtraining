package org.codetemplates;

import java.util.*;

public class CollectionPractices {
    // Collection is a framework that provides an architecture to store and manipulate a group of objects

    // Collection is a group of objects
    // Collection is a group of elements
    // Collection is a group of data
    // Collection is a group of values

    // Collection is a framework
    // Collection is a library

    // Collection is a framework that provides an architecture to store and manipulate a group of objects

    public static void main(String[] args) {
        CollectionPractices collectionPractices = new CollectionPractices();
        collectionPractices.ArrayListPractice();
    }

    public void ArrayListPractice(){
        // ArrayList is a class
        // ArrayList is used to store a group of objects
        // ArrayList is used for dynamic arrays
        // ArrayList implements List interface

        // Example of ArrayList
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");

        // Print the list
        System.out.println(list);

        // Access the element from the list
        System.out.println(list.get(0));

        // Remove the element from the list
        list.remove(0);

        // Print all the elements from the list
        System.out.println(list);

        // print all elements from loop
        for (String element : list) {
            System.out.println(element);
        }
    }

    private void LinkedListPractice(){
        // LinkedList is a class
        // LinkedList is used to store a group of objects
        // LinkedList is used for fast insertion and deletion
        // LinkedList is implemented for doubly linked list and it implements List and Deque interfaces

        // Example of LinkedList
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");

        // Print the list
        System.out.println(list);

        // Access the element from the list
        System.out.println(list.get(0));

        // Remove the element from the list
        list.remove(0);

        // Print all the elements from the list
        System.out.println(list);

        // print all elements from loop
        for (String element : list) {
            System.out.println(element);
        }
    }

    private void VectorPractice(){
        // Vector is a class
        // Vector is used to store a group of objects
        // Vector is used for dynamic arrays
        // Vector is synchronized
        // Vector implements List interface

        // Example of Vector
        List<String> list = new Vector<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");

        // Print the list
        System.out.println(list);

        // Access the element from the list
        System.out.println(list.get(0));

        // Remove the element from the list
        list.remove(0);

        // Print all the elements from the list
        System.out.println(list);

        // print all elements from loop
        for (String element : list) {
            System.out.println(element);
        }
    }

    private void StackPractice(){
        // Stack is a class
        // Stack is used to store a group of objects
        // Stack is used for last-in-first-out (LIFO) data structure
        // Stack extends Vector class

        // Example of Stack
        List<String> list = new Stack<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");

        // Print the list
        System.out.println(list);

        // Access the element from the list
        System.out.println(list.get(0));

        // Remove the element from the list
        list.remove(0);

        // Print all the elements from the list
        System.out.println(list);

        // print all elements from loop
        for (String element : list) {
            System.out.println(element);
        }
    }

    // Hash -- Set, Map, Queue, Deque, ListIterator, HashTable
    // Set is unsorted and unique
    // Map is key-value pair
    // Linked follows the order of insertion

    // Set example
    private void SetPractice(){
        // Set is a class
        // Set is used to store a group of objects
        // Set is used to store unique elements

        // Example of Set
         Set<String> set = new HashSet<>();
         Set<String> set1 = new LinkedHashSet<>();
         Set<String> set2 = new TreeSet<>();
    }

    // Map example
    private void MapPractice(){
        // Map is an interface
        // Map is used to store a group of objects
        // Map is used to store key-value pairs
        // Map is used to store unique keys

        // Example of Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "C#");


        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Java");
        hashtable.put(2, "Python");
        hashtable.put(3, "C++");
        hashtable.put(4, "C#");


        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Java");
        map1.put(2, "Python");
        map1.put(3, "C++");
        map1.put(4, "C#");

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "Java");
        map2.put(2, "Python");
        map2.put(3, "C++");
        map2.put(4, "C#");

    }

    // Queue example
    private void QueuePractice(){
        // Queue is a class
        // Queue is used to store a group of objects
        // Queue is used to store elements in FIFO (First In First Out) order

        // Example of Queue
        Queue<String> queue = new LinkedList<>();

    }

    // Deque example
    private void DequePractice(){
        // Deque is a class
        // Deque is used to store a group of objects
        // Deque is used to store elements in FIFO (First In First Out) order
        // Deque is used to store elements in LIFO (Last In First Out) order

        // Example of Deque
        Deque<String> deque = new LinkedList<>();
    }

    // ListIterator example
    private void ListIteratorPractice(){
        // ListIterator is a class
        // ListIterator is used to iterate over a list
        // ListIterator is used to iterate over a list in both directions

        // Example of ListIterator
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    // HashTable example
    private void HashTablePractice(){
        // HashTable is a class
        // HashTable is used to store a group of objects
        // HashTable is used to store key-value pairs
        // HashTable is synchronized

        // Example of HashTable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
    }
}
