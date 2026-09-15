# Find the Balloon Cost

## Problem Statement

A contest has 2 problems and `N` participants. Each participant may solve either or both problems.

For every problem solved, the participant receives a balloon. Each problem must have a balloon associated with it as a prize for solving that specific problem.

You can assign the balloon colors in either of these ways:
1. Problem 1 → Green, Problem 2 → Purple
2. Problem 1 → Purple, Problem 2 → Green
   
Given the cost of each balloon and which problems each participant solved, find the **minimum total cost** of balloons.

## Input
- First line: `T`, the number of test cases.
- For each test cases:
    - First line: cost of Green and Purple balloons.
    - Second line: `N`, the number of participants.
    - Next `N` lines: two values representing whether each participant solved Problem 1 and Problem 2 (`0` = not solved, `1` = solved).
  
## Output

For each test case, print the minimum cost of purchasing the balloons.

## Example

### Input

```text
2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0

1 9
10
0 1
0 0
0 0
0 1
1 0
0 1
0 1
0 0
0 1
0 0
Output
69
14