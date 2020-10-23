Loop runs through all records and saves in hashset in constant time. Its worst complexity would be R. 
Then another loop copies cows from hashset to a list. This would again be constant time for every cow 
so its complexity would be C. Finally, sorting using Java's Collections.sort() takes c*log(c) time 
since it sorts using a "a stable, adaptive, iterative" implementation of mergesort, which has a 
worst-case performance of O(n*log(n)).