<<<<<<< HEAD

Loop runs through all records and saves in hashset in constant time. Its worst complexity would be R. 
Then another loop copies cows from hashet to a list, again constant time for every cow so its complexity would be C. 
Finally, sorting by quick sort and it takes clogc time
=======
Loop runs through all records and saves in hashset in constant time. Its worst complexity would be O(r), 
where r is the number of rows of input. Then another loop copies cows from hashset to a list. This would 
again be constant time for every cow so its complexity would be O(c), where c is the number of cows. 
Finally, sorting using Java's Collections.sort() takes O(c*log(c)) time since it sorts using, according  
to Java's documentation, "a stable, adaptive, iterative" implementation of mergesort, which has a worst-
case performance of O(n*log(n)). Adding these parts together would give an average case of O(c*log(c)+r).
>>>>>>> 3c4364e458387524e5b70e0c4f4df570428abe89
