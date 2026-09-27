# Doubly Markov Matrix

## Problem
Given a square matrix of order `N`, determine whether it is a doubly Markov matrix. Every element must be non-negative, and the sum of the elements in each row and each column must equal `1`.

## Input
The first value is `N`, followed by the `N * N` matrix values.

## Constraints
- `1 <= N <= 100`
- Matrix values must be non-negative.

## Output
Print `Invalid Entry` if `N` is outside the allowed range or any matrix value is negative. Otherwise, print whether the matrix is a doubly Markov matrix.

## Example
```text
Input:
2
1 0
0 1

Output:
It is a Doubly Matrix
```

