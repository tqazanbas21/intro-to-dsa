# Stack

Recursion is an algorithmic technique which is based on a function calling itself in its own body. 
It is widely used in order to increase algorithmic efficiency and simplify the logic. Use cases of recursion can vary heavily, it can be considered as special iteration case or special algorithmic decomposition case.

Recursive function have two main parts: base case and recursive case. Base case is basically a stop-sign for a recursive function and it is binded to certain conditions. Recursive case is part of function body where the function calls itself. Each recursive call must return something. Recursive calls are handled via call stack [1]. Tail recursion is special case of recursion when a function does not perform an arithmetic operation on the last line of the recursive case, but calls another function ending the recursive case with a recursion (it is where its name comes from :D). Also, there are direct and indirect recursion. Direct recursion happens when a function calls itself, indirect recursion happens when two function call each other [2].

![Call Stack]("%22callstack.jpg "Call stack") [1]

---

References:
    [1] learn1.open.ac.uk/mod/oublog/viewpost.php?post=162710
    [2] https://www.baeldung.com/cs/recursion-direct-vs-indirect
