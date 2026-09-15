# Find the Game Winner

## Problem

There are `N` rounds between two players. In each round, both round, both players score some points.

After every round, calculate the cumulative score of both players. The players with the greater cumulative score is the leader, and the difference between their scores is the lead.

After all the rounds, the player with the maximum lead is the winner.

## Input

- First line `N`, the number of rounds
- Next `N` lines: 2 integers `P1` and `P2`, the scores of Player 1 and Player 2 in each round.
- 
## Output
Print the winner's player number and the maximum lead.

## Example

### Input

5
140 82
89  134
50  110
112 106
88  90

### Output

2 3

## Explanation

| Round | P1 Total | P2 Total | Leader | Lead |
|------:|---------:|---------:|--------|-----:|
| 1 | 140 | 82  | P1 | 58 |
| 2 | 229 | 216 | P1 | 13 |
| 3 | 279 | 326 | P2 | 47 |
| 4 | 391 | 432 | P2 | 41 |
| 5 | 479 | 522 | P2 | 43 |

The maximum lead is `58`, achieved by Player 1.

Therefore:

**Winner: Player 1, Lead: 58**

## Approach

1. Keep cumulative scores for both players.
2. After each round, calculate the current lead.
3. Track the largest lead and the player who achieved it.
4. Print the winner and maximum lead.

## Complexity

- Time: `O(N)`
- Space: `O(1)`


