Loop runs through all records and saves in a hashmap in constant time. Its complexity would be O(r), 
where r is the number of rows of input. Then another loop copies cows from hashmap to an ArrayList. This 
would again be constant time for every cow so its complexity would be O(c), where c is the number of cows. 
Finally, sorting using Java's Collections.sort() takes O(c*log(c)) time since it sorts using, according 
to Java's documentation, "a stable, adaptive, iterative" implementation of mergesort, which has a worst-
case performance of O(n*log(n)). Adding these parts together would give an average case of O(c*log(c)+r).
