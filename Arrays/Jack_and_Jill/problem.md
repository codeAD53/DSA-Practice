# Jack and Jill

## Problem statement

Jack and Jill are travelling through a jungle when they encounter a monster, The monster gives them a puzzle to solve before allowing them to escape.

There are `n` buckets, and initially each bucket contains `0` fruits.

The monster provides an array `target` of `n` integers, where target[i] represents the required number of fruits in the `i-th` bucket.

You can perform the following operations:

1. Incremental Operation
    Increment the number of fruits in each bucket by 1.

2. Doubling Operation
    Double the number of fruits in each bucket.

The goal is to reach the exact target array using the minimum number of operations.

## Input

- The first line contains an integer `n`, representing the size of the array

- The second line contains `n` space-separated integers representing the target array.

## Output

Print a single integer representing the minimum number of operations required.

## Constraints

    - 1 <= n <= 1000
    - 1 <= target[i] <= 1000

## Example

**Sample Input**

```text
2
2 2
```

**Sample Output**

```text
2
```

**Explanation**

Start with `[0, 0]`.

1. Increment: `[1, 1]`
2. Double: `[2, 2]`

The target is reached in 2 operations, which is the minimum.