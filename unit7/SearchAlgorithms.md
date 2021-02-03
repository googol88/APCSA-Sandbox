# Search Algorithms

## Linear Search
- Take an unsorted list
- Literally traverses the list and stops after finding the first occurence - a brute force approach
- Efficiency depends on where the item is in the list
- Very inefficient for obvious reasons

## Binary search
- Requires sorted list
- Go from the middle, and evaluate which half it is in
- Use high, low, and mid pointers
- mid pointer is determined by taking the floored average (Java division woop woop!)
- Imagine an ArrayList of seven names

| Aa | Ab | Ca | Cb | D | R | T | W |
| --- |


example - Find R
1. Aa - Low, W - High
2. Find midpoint - 