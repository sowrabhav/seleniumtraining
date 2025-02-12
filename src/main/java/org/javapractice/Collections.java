package org.javapractice;

public class Collections {
    public static void main(String[] args) {
        System.out.println("Hello, Collections!");
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Overloading the printArray method
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Collection Interface
     * List
     * ArrayList
     * LinkedList
     * Vector
     * Stack
     * Set
     * HashSet
     * LinkedHashSet
     * TreeSet
     * Queue
     * PriorityQueue
     * ArrayDeque
     * ConcurrentLinkedQueue
     * LinkedBlockingQueue
     * PriorityBlockingQueue
     * DelayQueue
     * SynchronousQueue
     * LinkedBlockingDeque
     * ConcurrentLinkedDeque
     * Deque
     * ArrayDeque
     * ConcurrentLinkedDeque
     * LinkedBlockingDeque
     * Map Interface
     * Map
     * HashMap
     * LinkedHashMap
     * TreeMap
     * Hashtable
     * IdentityHashMap
     * WeakHashMap
     * ConcurrentHashMap
     * ConcurrentSkipListMap
     * SortedSet Interface
     * SortedSet
     * TreeSet
     * SortedMap Interface
     * SortedMap
     * TreeMap
     * NavigableSet Interface
     * NavigableSet
     * TreeSet
     * NavigableMap Interface
     * NavigableMap
     * TreeMap
     * BlockingQueue Interface
     * BlockingQueue
     * ArrayBlockingQueue
     * DelayQueue
     * LinkedBlockingQueue
     * PriorityBlockingQueue
     * SynchronousQueue
     * BlockingDeque Interface
     * BlockingDeque
     * LinkedBlockingDeque
     * ConcurrentLinkedDeque
     * TransferQueue Interface
     * TransferQueue
     * LinkedTransferQueue
     * CopyOnWriteArrayList
     * CopyOnWriteArrayList
     * CopyOnWriteArraySet
     * CopyOnWriteArraySet
     * Abstract Classes
     * AbstractCollection
     * AbstractList
     * ArrayList
     * LinkedList
     * Vector
     * Stack
     * AbstractSet
     * HashSet
     * LinkedHashSet
     * TreeSet
     * AbstractQueue
     * PriorityQueue
     * ArrayDeque
     * ConcurrentLinkedQueue
     * LinkedBlockingQueue
     * PriorityBlockingQueue
     * DelayQueue
     * SynchronousQueue
     * LinkedBlockingDeque
     * ConcurrentLinkedDeque
     * AbstractMap
     * HashMap
     * LinkedHashMap
     * TreeMap
     * Hashtable
     * IdentityHashMap
     * WeakHashMap
     * ConcurrentHashMap
     * ConcurrentSkipListMap
     * */

    // Collections are used to store, retrieve, manipulate, and communicate aggregate data
    // Collections are used to store multiple values in a single variable

    // Arrays are used to store multiple values in a single variable

    // Arrays are fixed in size
    // Collections are dynamic in size

    // Arrays can store primitive data types and objects
    // Collections can store only objects

    // Arrays can store only homogeneous data
    // Collections can store heterogeneous data

    // Arrays can store only one type of data
    // Collections can store multiple types of data

    // Arrays can store only one-dimensional data
    // Collections can store multi-dimensional data

    // Arrays can store only fixed-size data
    // Collections can store variable-size data

    // Arrays can store only contiguous memory data
    // Collections can store non-contiguous memory data

    // Arrays can store only indexed data
    // Collections can store indexed and non-indexed data


    // Types of Collections:
    // 1. List
    // 2. Set
    // 3. Map
    // 4. Queue
    // 5. Stack
    // 6. Deque
    // 7. SortedSet
    // 8. SortedMap
    // 9. NavigableSet
    // 10. NavigableMap
    // 11. BlockingQueue
    // 12. BlockingDeque
    // 13. TransferQueue
    // 14. ConcurrentMap
    // 15. ConcurrentNavigableMap
    // 16. AbstractCollection
    // 17. AbstractList
    // 18. AbstractSequentialList
    // 19. AbstractSet
    // 20. AbstractQueue
    // 21. AbstractMap
    // 22. EnumSet
    // 23. EnumMap
    // 24. IdentityHashMap
    // 25. WeakHashMap
    // 26. LinkedHashMap
    // 27. TreeMap
    // 28. HashMap
    // 29. Hashtable
    // 30. Properties
    // 31. Vector
    // 32. Stack
    // 33. ArrayList
    // 34. LinkedList
    // 35. HashSet
    // 36. LinkedHashSet
    // 37. TreeSet
    // 38. PriorityQueue
    // 39. ArrayDeque
    // 40. ConcurrentLinkedQueue
    // 41. LinkedBlockingQueue
    // 42. PriorityBlockingQueue
    // 43. DelayQueue
    // 44. SynchronousQueue
    // 45. LinkedBlockingDeque
    // 46. ConcurrentLinkedDeque
    // 47. CopyOnWriteArrayList
    // 48. CopyOnWriteArraySet
    // 49. ConcurrentHashMap
    // 50. ConcurrentSkipListSet
    // 51. ConcurrentSkipListMap

    // List:
    // 1. List is an interface in Java
    // 2. List is an ordered collection of elements
    // 3. List allows duplicate elements
    // 4. List allows null elements
    // 5. List allows multiple null elements
    // 6. List allows heterogeneous elements
    // 7. List allows insertion order
    // 8. List allows indexed elements
    // 9. List allows non-indexed elements
    // 10. List allows contiguous memory elements
    // 11. List allows non-contiguous memory elements
    // 12. List allows fixed-size elements
    // 13. List allows variable-size elements
    // 14. List allows homogeneous elements
    // 15. List allows one-dimensional elements
    // 16. List allows multi-dimensional elements
    // 17. List allows only objects
    // 18. List allows primitive data types
    // 19. List allows only one type of data
    // 20. List allows multiple types of data
    // 21. List allows only indexed data
    // 22. List allows indexed and non-indexed data
    // 23. List allows only contiguous memory data
    // 24. List allows non-contiguous memory data

    // List Interface:
    // 1. List is an interface in Java
    // 2. List is a sub-interface of Collection
    // 3. List is a sub-interface of Iterable
    // 4. List is a sub-interface of Serializable
    // 5. List is a sub-interface of Cloneable
    // 6. List is a sub-interface of RandomAccess
    // 7. List is a sub-interface of ListIterator
    // 8. List is a sub-interface of AbstractList
    // 9. List is a sub-interface of AbstractSequentialList
    // 10. List is a sub-interface of ArrayList
    // 11. List is a sub-interface of LinkedList
    // 12. List is a sub-interface of Vector

    // List Classes:
    // 1. ArrayList
    // 2. LinkedList
    // 3. Vector

    // ArrayList:
    // 1. ArrayList is a class in Java
    // 2. ArrayList is a sub-class of Abstract
    // 3. ArrayList is a sub-class of Abstract
    // 4. ArrayList is a sub-class of Abstract

    // LinkedList:
    // 1. LinkedList is a class in Java
    // 2. LinkedList is a sub-class of Abstract

    // Vector:
    // 1. Vector is a class in Java
    // 2. Vector is a sub-class of Abstract

    // Set:
    // 1. Set is an interface in Java
    // 2. Set is an unordered collection of elements
    // 3. Set does not allow duplicate elements
    // 4. Set does not allow null elements
    // 5. Set does not allow multiple null elements
    // 6. Set does not allow heterogeneous elements
    // 7. Set does not allow insertion order
    // 8. Set does not allow indexed elements
    // 9. Set does not allow non-indexed elements
    // 10. Set does not allow contiguous memory elements
    // 11. Set does not allow non-contiguous memory elements
    // 12. Set does not allow fixed-size elements
    // 13. Set does not allow variable-size elements
    // 14. Set does not allow homogeneous elements
    // 15. Set does not allow one-dimensional elements
    // 16. Set does not allow multi-dimensional elements
    // 17. Set does not allow only objects
    // 18. Set does not allow primitive data types
    // 19. Set does not allow only one type of data
    // 20. Set does not allow multiple types of data
    // 21. Set does not allow only indexed data
    // 22. Set does not allow indexed and non-indexed data
    // 23. Set does not allow only contiguous memory data
    // 24. Set does not allow non-contiguous memory data

    // Set Interface:
    // 1. Set is an interface in Java
    // 2. Set is a sub-interface of Collection
    // 3. Set is a sub-interface of Iterable
    // 4. Set is a sub-interface of Serializable
    // 5. Set is a sub-interface of Cloneable
    // 6. Set is a sub-interface of AbstractSet
    // 7. Set is a sub-interface of HashSet
    // 8. Set is a sub-interface of LinkedHashSet
    // 9. Set is a sub-interface of TreeSet

    // Set Classes:
    // 1. HashSet
    // 2. LinkedHashSet
    // 3. TreeSet

    // HashSet:
    // 1. HashSet is a class in Java
    // 2. HashSet is a sub-class of Abstract

    // LinkedHashSet:
    // 1. LinkedHashSet is a class in Java
    // 2. LinkedHashSet is a sub-class of Abstract

    // TreeSet:
    // 1. TreeSet is a class in Java
    // 2. TreeSet is a sub-class of Abstract

    // Map:
    // 1. Map is an interface in Java
    // 2. Map is a collection of key-value pairs
    // 3. Map does not allow duplicate keys
    // 4. Map allows duplicate values
    // 5. Map allows null keys
    // 6. Map allows null values
    // 7. Map allows multiple null keys
    // 8. Map allows multiple null values
    // 9. Map allows heterogeneous keys
    // 10. Map allows heterogeneous values
    // 11. Map allows insertion order
    // 12. Map allows indexed keys
    // 13. Map allows non-indexed keys
    // 14. Map allows contiguous memory keys
    // 15. Map allows non-contiguous memory keys
    // 16. Map allows fixed-size keys
    // 17. Map allows variable-size keys
    // 18. Map allows homogeneous keys
    // 19. Map allows one-dimensional keys
    // 20. Map allows multi-dimensional keys
    // 21. Map allows only objects
    // 22. Map allows primitive data types
    // 23. Map allows only one type of data
    // 24. Map allows multiple types of data
    // 25. Map allows only indexed keys
    // 26. Map allows indexed and non-indexed keys
    // 27. Map allows only contiguous memory keys
    // 28. Map allows non-contiguous memory keys

    // Map Interface:
    // 1. Map is an interface in Java
    // 2. Map is a sub-interface of Collection
    // 3. Map is a sub-interface of Iterable
    // 4. Map is a sub-interface of Serializable
    // 5. Map is a sub-interface of Cloneable
    // 6. Map is a sub-interface of AbstractMap
    // 7. Map is a sub-interface of HashMap
    // 8. Map is a sub-interface of Hashtable
    // 9. Map is a sub-interface of LinkedHashMap
    // 10. Map is a sub-interface of TreeMap

    // Map Classes:
    // 1. HashMap
    // 2. Hashtable
    // 3. LinkedHashMap
    // 4. TreeMap

    // HashMap:
    // 1. HashMap is a class in Java
    // 2. HashMap is a sub-class of Abstract

    // Hashtable:
    // 1. Hashtable is a class in Java
    // 2. Hashtable is a sub-class of Abstract

    // LinkedHashMap:
    // 1. LinkedHashMap is a class in Java
    // 2. LinkedHashMap is a sub-class of Abstract

    // TreeMap:
    // 1. TreeMap is a class in Java
    // 2. TreeMap is a sub-class of Abstract

    // Queue:
    // 1. Queue is an interface in Java
    // 2. Queue is a collection of elements
    // 3. Queue is an ordered collection of elements
    // 4. Queue allows duplicate elements
    // 5. Queue allows null elements
    // 6. Queue allows multiple null elements
    // 7. Queue allows heterogeneous elements
    // 8. Queue allows insertion order
    // 9. Queue allows indexed elements
    // 10. Queue allows non-indexed elements
    // 11. Queue allows contiguous memory elements
    // 12. Queue allows non-contiguous memory elements
    // 13. Queue allows fixed-size elements
    // 14. Queue allows variable-size elements
    // 15. Queue allows homogeneous elements
    // 16. Queue allows one-dimensional elements
    // 17. Queue allows multi-dimensional elements
    // 18. Queue allows only objects
    // 19. Queue allows primitive data types
    // 20. Queue allows only one type of data
    // 21. Queue allows multiple types of data
    // 22. Queue allows only indexed data
    // 23. Queue allows indexed and non-indexed data
    // 24. Queue allows only contiguous memory data
    // 25. Queue allows non-contiguous memory data

    // Queue Interface:
    // 1. Queue is an interface in Java
    // 2. Queue is a sub-interface of Collection
    // 3. Queue is a sub-interface of Iterable
    // 4. Queue is a sub-interface of Serializable
    // 5. Queue is a sub-interface of Cloneable
    // 6. Queue is a sub-interface of AbstractQueue
    // 7. Queue is a sub-interface of PriorityQueue
    // 8. Queue is a sub-interface of ArrayDeque
    // 9. Queue is a sub-interface of ConcurrentLinkedQueue
    // 10. Queue is a sub-interface of LinkedBlockingQueue
    // 11. Queue is a sub-interface of PriorityBlockingQueue
    // 12. Queue is a sub-interface of DelayQueue
    // 13. Queue is a sub-interface of SynchronousQueue
    // 14. Queue is a sub-interface of LinkedBlockingDeque
    // 15. Queue is a sub-interface of ConcurrentLinkedDeque

    // Queue Classes:
    // 1. PriorityQueue
    // 2. ArrayDeque
    // 3. ConcurrentLinkedQueue
    // 4. LinkedBlockingQueue
    // 5. PriorityBlockingQueue
    // 6. DelayQueue
    // 7. SynchronousQueue
    // 8. LinkedBlockingDeque
    // 9. ConcurrentLinkedDeque

    // PriorityQueue:
    // 1. PriorityQueue is a class in Java
    // 2. PriorityQueue is a sub-class of Abstract

    // ArrayDeque:
    // 1. ArrayDeque is a class in Java
    // 2. ArrayDeque is a sub-class of Abstract

    // ConcurrentLinkedQueue:
    // 1. ConcurrentLinkedQueue is a class in Java
    // 2. ConcurrentLinkedQueue is a sub-class of Abstract

    // LinkedBlockingQueue:
    // 1. LinkedBlockingQueue is a class in Java
    // 2. LinkedBlockingQueue is a sub-class of Abstract

    // PriorityBlockingQueue:
    // 1. PriorityBlockingQueue is a class in Java
    // 2. PriorityBlockingQueue is a sub-class of Abstract

    // DelayQueue:
    // 1. DelayQueue is a class in Java
    // 2. DelayQueue is a sub-class of Abstract

    // SynchronousQueue:
    // 1. SynchronousQueue is a class in Java
    // 2. SynchronousQueue is a sub-class of Abstract

    // LinkedBlockingDeque:
    // 1. LinkedBlockingDeque is a class in Java
    // 2. LinkedBlockingDeque is a sub-class of Abstract

    // ConcurrentLinkedDeque:
    // 1. ConcurrentLinkedDeque is a class in Java
    // 2. ConcurrentLinkedDeque is a sub-class of Abstract

    // Stack:
    // 1. Stack is a class in Java
    // 2. Stack is a sub-class of Vector

    // Deque:
    // 1. Deque is an interface in Java
    // 2. Deque is a sub-interface of Queue
    // 3. Deque is a sub-interface of AbstractCollection
    // 4. Deque is a sub-interface of AbstractList
    // 5. Deque is a sub-interface of AbstractSequentialList
    // 6. Deque is a sub-interface of ArrayDeque
    // 7. Deque is a sub-interface of ConcurrentLinkedDeque
    // 8. Deque is a sub-interface of LinkedBlockingDeque

    // Deque Classes:
    // 1. ArrayDeque
    // 2. ConcurrentLinkedDeque
    // 3. LinkedBlockingDeque

    // ArrayDeque:
    // 1. ArrayDeque is a class in Java
    // 2. ArrayDeque is a sub-class of Abstract

    // ConcurrentLinkedDeque:
    // 1. ConcurrentLinkedDeque is a class in Java
    // 2. ConcurrentLinkedDeque is a sub-class of Abstract

    // LinkedBlockingDeque:
    // 1. LinkedBlockingDeque is a class in Java
    // 2. LinkedBlockingDeque is a sub-class of Abstract

    // SortedSet:
    // 1. SortedSet is an interface in Java
    // 2. SortedSet is a sub-interface of Set
    // 3. SortedSet is a sub-interface of NavigableSet
    // 4. SortedSet is a sub-interface of AbstractSet
    // 5. SortedSet is a sub-interface of TreeSet

    // SortedSet Interface:
    // 1. SortedSet is an interface in Java
    // 2. SortedSet is a sub-interface of Set
    // 3. SortedSet is a sub-interface of NavigableSet
    // 4. SortedSet is a sub-interface of AbstractSet
    // 5. SortedSet is a sub-interface of TreeSet

    // SortedSet Classes:
    // 1. TreeSet

    // TreeSet:
    // 1. TreeSet is a class in Java
    // 2. TreeSet is a sub-class of Abstract

    // SortedMap:
    // 1. SortedMap is an interface in Java
    // 2. SortedMap is a sub-interface of Map
    // 3. SortedMap is a sub-interface of NavigableMap
    // 4. SortedMap is a sub-interface of AbstractMap
    // 5. SortedMap is a sub-interface of TreeMap

    // SortedMap Interface:
    // 1. SortedMap is an interface in Java
    // 2. SortedMap is a sub-interface of Map
    // 3. SortedMap is a sub-interface of NavigableMap
    // 4. SortedMap is a sub-interface of AbstractMap
    // 5. SortedMap is a sub-interface of TreeMap

    // SortedMap Classes:
    // 1. TreeMap

    // TreeMap:
    // 1. TreeMap is a class in Java
    // 2. TreeMap is a sub-class of Abstract

    // NavigableSet:
    // 1. NavigableSet is an interface in Java
    // 2. NavigableSet is a sub-interface of SortedSet
    // 3. NavigableSet is a sub-interface of AbstractSet
    // 4. NavigableSet is a sub-interface of TreeSet

    // NavigableSet Interface:
    // 1. NavigableSet is an interface in Java
    // 2. NavigableSet is a sub-interface of SortedSet
    // 3. NavigableSet is a sub-interface of AbstractSet
    // 4. NavigableSet is a sub-interface of TreeSet

    // NavigableSet Classes:
    // 1. TreeSet

    // NavigableMap:
    // 1. NavigableMap is an interface in Java
    // 2. NavigableMap is a sub-interface of SortedMap
    // 3. NavigableMap is a sub-interface of AbstractMap
    // 4. NavigableMap is a sub-interface of TreeMap

    // NavigableMap Interface:
    // 1. NavigableMap is an interface in Java
    // 2. NavigableMap is a sub-interface of SortedMap
    // 3. NavigableMap is a sub-interface of AbstractMap
    // 4. NavigableMap is a sub-interface of TreeMap

    // NavigableMap Classes:
    // 1. TreeMap

    // BlockingQueue:
    // 1. BlockingQueue is an interface in Java
    // 2. BlockingQueue is a sub-interface of Queue
    // 3. BlockingQueue is a sub-interface of AbstractQueue
    // 4. BlockingQueue is a sub-interface of ArrayBlockingQueue
    // 5. BlockingQueue is a sub-interface of DelayQueue
    // 6. BlockingQueue is a sub-interface of LinkedBlockingQueue
    // 7. BlockingQueue is a sub-interface of PriorityBlockingQueue
    // 8. BlockingQueue is a sub-interface of SynchronousQueue

    // BlockingQueue Interface:
    // 1. BlockingQueue is an interface in Java
    // 2. BlockingQueue is a sub-interface of Queue
    // 3. BlockingQueue is a sub-interface of AbstractQueue
    // 4. BlockingQueue is a sub-interface of ArrayBlockingQueue
    // 5. BlockingQueue is a sub-interface of DelayQueue
    // 6. BlockingQueue is a sub-interface of LinkedBlockingQueue
    // 7. BlockingQueue is a sub-interface of PriorityBlockingQueue
    // 8. BlockingQueue is a sub-interface of SynchronousQueue

    // BlockingQueue Classes:
    // 1. ArrayBlockingQueue
    // 2. DelayQueue
    // 3. LinkedBlockingQueue
    // 4. PriorityBlockingQueue
    // 5. SynchronousQueue

    // BlockingDeque:
    // 1. BlockingDeque is an interface in Java
    // 2. BlockingDeque is a sub-interface of Deque
    // 3. BlockingDeque is a sub-interface of BlockingQueue
    // 4. BlockingDeque is a sub-interface of AbstractQueue
    // 5. BlockingDeque is a sub-interface of ArrayBlockingQueue
    // 6. BlockingDeque is a sub-interface of DelayQueue
    // 7. BlockingDeque is a sub-interface of LinkedBlockingQueue
    // 8. BlockingDeque is a sub-interface of PriorityBlockingQueue
    // 9. BlockingDeque is a sub-interface of SynchronousQueue
    // 10. BlockingDeque is a sub-interface of LinkedBlockingDeque
    // 11. BlockingDeque is a sub-interface of ConcurrentLinkedDeque

    // BlockingDeque Interface:
    // 1. BlockingDeque is an interface in Java
    // 2. BlockingDeque is a sub-interface of Deque
    // 3. BlockingDeque is a sub-interface of BlockingQueue
    // 4. BlockingDeque is a sub-interface of AbstractQueue
    // 5. BlockingDeque is a sub-interface of ArrayBlockingQueue
    // 6. BlockingDeque is a sub-interface of DelayQueue
    // 7. BlockingDeque is a sub-interface of LinkedBlockingQueue
    // 8. BlockingDeque is a sub-interface of PriorityBlockingQueue
    // 9. BlockingDeque is a sub-interface of SynchronousQueue
    // 10. BlockingDeque is a sub-interface of LinkedBlockingDeque
    // 11. BlockingDeque is a sub-interface of ConcurrentLinkedDeque

    // BlockingDeque Classes:
    // 1. ArrayBlockingQueue
    // 2. DelayQueue
    // 3. LinkedBlockingQueue
    // 4. PriorityBlockingQueue
    // 5. SynchronousQueue
    // 6. LinkedBlockingDeque
    // 7. ConcurrentLinkedDeque

    // TransferQueue:

}
