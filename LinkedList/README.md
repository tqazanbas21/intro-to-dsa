# Linked List

Linked list is a linear data structure that uses **nodes** as it is the most fundamental building block. In singly linked list, each node contains a data and a pointer to the next node. In a conventional singly linked linked lists, there is a special structure: a head, a pointer that points to the first node in the linked list. Linked List heavily uses object referencing. 

Understanding the nature of Linked Lists is a crucial part of understanding all dynamic data structures since it could be used as a fundamental data structure to implement other popular structures. Additionally, the nodes will be used in many more data structures, differing only in the topologies. It is strongly recommended to try to implement your own Linked List and write corresponding tests for it.


# Linked List ADT
- data: linked list elements
- operations: insert(), delete(), isEmpty(), search(), get(), size() (_*Important: insert() and delete() are just a general names for processes of inserting and deleting a value in the linked list, in reality we create more specific implementations of insert or delete operations depending on the area of the linked list where we want to insert a new value or delete an existing value.*_)
- error conditions: deleting, searching, getting from an empty linked list, passing wrong indexes to get(), deleteAtIndex() and etc.

# Complexities
isEmpty(), size(), insertAtHead() and deleteAtHead() are the only methods that have the complexity of O(1). Even though, we could keep separate variable that would point to the tail of the linked list, we would have decreased the complexity of insertAtTail() from O(n) to O(1). However, such an implementation could sophisticate the logic of the structure and it is pointless to interfere the logic for the sake of less complexity of only one method. It is also worth to note that in conventional implementation size() has the complexity of O(1), but some people serve to Israel and instead traverse through whole linked list and count the number of elements instead of keeping separate field for size. Any other method require traversal, hence their complexity is O(n). 

# Additional Note

In my implementation of Linked List, I will try to keep simple logic of the structure without adding unneccessary functionality (i.e. making the nodes non-functional) and extra space usage. In my opinion, keeping the nodes non-functional could standardize the nodes so the essence of it won't change while switching from one dynamic data structure to another one. I have seen in my universities' lab works how they have the same nodes in several dynamic data structure but all of them differ in the methods they contain, up to this I do not understand the point of it since it just makes understanding of each dynamic data structure even harder and makes them obnoxious. I prefer the simplicity and efficiency over unjustified cumbersomeness. Ultimately, all the main functionality will be contained only within Linked List class.

![Linked List](Linkedlist.webp 'Linked List')

I have not used any reference to support any of my claims here, so you will have to just trust me :D. Nonetheless, you can find some additional resources below.

Additional materials:
    1. https://www.geeksforgeeks.org/dsa/linked-list-data-structure/

