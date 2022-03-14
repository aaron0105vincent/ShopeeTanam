# ShopeeTanam
Shopee Tanam

Problem Statement

In Shopee, there is a game called Shopee Tanam. It’s a game developed by Shopee
game developers in Indonesia. Shopee Tanam means that you can plant some plants
on the game platform. One of the game developers has an idea to create a new sub
game in Shopee Tanam. In the sub game, you are given a park and the park has 1
dimensional shape and it consists of M different cells. In each cell you must plant
exactly 1 tree. Each day, the tree can yield a beneficial fruit / poisonous fruit / neither
beneficial nor poisonous fruit. The beneficial fruit means that you will get a positive
number of health.The poisonous fruit gives you a negative number of health. Otherwise,
you will get 0 health.
Then you are given a character that will start at the left side of the one dimensional
park. You are given N days to play the game. Each day, the number of health in each
fruit produced by a tree might change. In one day the character can do one of these
actions:
1. Not crossing the park at all (stay at the current spot).
2. Walk through the park going through up to M cells, gathering all the beneficial
and poisonous fruits along the way, then the character turns around and goes
back to the initial position before he walks through the park.
3. Crossing the park completely, and going to the opposite side of the park, then the
character rests there.
Note: On one day, the fruit in a cell can be gotten at most once.
Help the character to get the maximum amount of health.

Input
There will be T (1 <= T <= 10) number of test cases. On each test case, there will be a
line with 2 integers, N and M (1 <= N <= 1000, 1 <= M <= 1000). Then N lines follow up,
with each line containing M integers, Ai,j (-109 <= Ai,j <= 109
), which means the health of
the fruit on day i at cell j.

Output
The output must consist of T number of integers, indicating the maximum amount of
health that the character can get.
Sample Input
3
1 5
-9 -8 1 2 3
2 3
1 4 -5
-1 -9 100
2 3
1 4 -5
-1 -1 100
Sample Output
0
100
103

Explanation
1. For the first example, the character can decide to not cross the park at all, hence
the total health that the character gets is 0.
2. For the second example,
a. On the first day, the character goes from the left, then completely crossing
the park, then he rests at the right side of the park, and the total number of
health is: 1 + 4 + (-5) = 0.
b. On the second day, the character goes from the right side of the bridge,
only to the first cell from the right, then goes back to the right side of the
bridge, and the total number of health the character gets from the second
day is 100.
c. Hence, the total health that the character gets from 2 days is 0 + 100 =
100.
3. For the third example,
a. On the first day, the character goes from the left, but only getting the
health from the first 2 cells, then the character goes back to the left side of
the park, and the total number of health is: 1 + 4 = 5.
b. On the second day, the character goes from the left side of the park, and
goes completely crossing the park, gaining total health of: (-1) + (-1) + 100
= 98 for the second day.
c. Hence, the total health that the character gets from 2 days is 5 + 98 = 103.
