/*
 * Tower Of Hanoi
 * Difficulty: Medium
 * Accuracy: 35.23%
 * Submissions: 169K+
 * Points: 4
 * 
 * In the Tower of Hanoi puzzle, you are given n disks stacked in ascending order (smallest at the top) 
 * on the first of three rods. 
 * 
 * The goal is to move all disks to the third rod following two rules:
 * 1. Only one disk can be moved at a time.
 * 2. A disk can only be placed on top of a larger disk.
 * 
 * Given the number of disks n and three rods labeled as from, to, and aux (starting rod, target rod, 
 * and auxiliary rod respectively), return the total number of moves needed to transfer all disks 
 * from the starting rod to the target rod.
 * 
 * Examples:
 * 
 * Input: n = 2
 * Output: 3
 * Explanation: For n = 2, steps will be:
 * move disk 1 from rod 1 to rod 2
 * move disk 2 from rod 1 to rod 3
 * move disk 1 from rod 2 to rod 3
 * Total 3 steps.
 * 
 * Input: n = 3
 * Output: 7
 * Explanation: For n = 3, steps will be:
 * move disk 1 from rod 1 to rod 3
 * move disk 2 from rod 1 to rod 2
 * move disk 1 from rod 3 to rod 2
 * move disk 3 from rod 1 to rod 3
 * move disk 1 from rod 2 to rod 1
 * move disk 2 from rod 2 to rod 3
 * move disk 1 from rod 1 to rod 3
 * Total 7 steps.
 * 
 * Input: n = 0
 * Output: 0
 * Explanation: Total 0 steps will be taken.
 * 
 * Constraints:
 * 0 <= n <= 16
 */
class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        int moves[] = new int[1];
        tower(n, from, to, aux, moves);
       // System.out.println(moves[0]);
        return moves[0];
    }

    public void tower(int n, int from, int to, int aux, int moves[]) {
          if (n <= 0) {
        return;
    }
        if (n == 1) {
            moves[0]++;
            return;
        }

        tower(n - 1, from, aux, to, moves);

        moves[0]++;  // Count the move of disk n from `from` to `to`

        tower(n - 1, aux, to, from, moves);
    }
}
