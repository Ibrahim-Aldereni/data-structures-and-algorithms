# Merge Sort

## Trace

> Sample Array: [8,4,23,42,16,15]

- pass 1:
  divide the original array into 2 arrays (left and right).

  ![pass1](../img/merge-sort1.png)

- pass 2:
  divide left array also to left and right, till we reach one element in each array, and so on for the right array

  ![pass2](../img/merge-sort2.png)

- pass 3:
  sort and merge the left side and the right side

  ![pass3](../img/merge-sort3.png)

- pass 4:
  sort and merge with the original array

  ![pass4](../img/merge-sort4.png)

## Efficency

- Time: O(2n) >> many loops at the same level
- Space: O(n) >> new arrays declared
