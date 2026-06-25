Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input. 
Types of notations 
1. O-notation: It is used to denote asymptotic upper bound. For a given function g(n), we denote it by O(g(n)). Pronounced as “big-oh of g of n”. It is also known as worst case time complexity as it denotes the upper bound in which the algorithm terminates. 
2. Ω-notation: It is used to denote asymptotic lower bound. For a given function g(n), we denote it by Ω(g(n)). Pronounced as “big-omega of g of n”. It is also known as best case time complexity as it denotes the lower bound in which the algorithm terminates. 
3. 𝚯-notation: It is used to denote the average time of a program. 


Space Complexity 
Space complexity of an algorithm quantifies the amount of time taken by a program to run as a function of length of the input. It is directly proportional to the largest memory your program acquires at any instance during run time. 
For example: int consumes 4 bytes of memory.


Common Time Complexities
Complexity	 Name	          Example
O(1)	     Constant	     Access array element
O(log n)	 Logarithmic     Binary Search
O(n)	     Linear	         Traversing an array
O(n log n)	 Linearithmic	 Merge Sort
O(n²)	     Quadratic	     Nested loops
O(2ⁿ)	     Exponential	 Recursive Fibonacci
O(n!)	     Factorial	     Generating all permutations


Most Important Complexities for Placements

Algorithm	      Time Complexity
Linear Search	       O(n)
Binary Search	     O(log n)
Bubble Sort	           O(n²)
Selection Sort	       O(n²)
Insertion Sort	       O(n²)
Merge Sort	        O(n log n)
Quick Sort (avg)	O(n log n)
BFS	                O(V + E)
DFS	                O(V + E)


Shortcut to Remember

-> Single loop → O(n)
->Nested loops → O(n²)
->Triple nested loops → O(n³)
->Divide by 2 each step → O(log n)
->Recursion tree often → O(2ⁿ)