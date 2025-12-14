# SDET Interview LeetCode Study Guide

**Target:** Senior SDET roles at Amazon, Google, Meta, Fintech companies  
**Difficulty Distribution:** ~20% Easy, ~60% Medium, ~20% Hard  
**Estimated Time:** 6-8 weeks (2-3 problems daily)

---

## Study Priority Order

1. **Arrays & Strings** (Week 1-2) - Most frequently asked
2. **Hash Maps & Sets** (Week 2) - Amazon favorite
3. **Trees & BST** (Week 3) - Common in all FAANG
4. **Graphs: BFS/DFS** (Week 4) - Amazon's top topic
5. **Dynamic Programming** (Week 5) - Medium-Hard problems
6. **Sliding Window & Two Pointers** (Week 5-6)
7. **Stack & Queue** (Week 6)
8. **Linked Lists** (Week 6)
9. **Heap/Priority Queue** (Week 7)
10. **Backtracking** (Week 7-8)

---

## Phase 1: Foundation (Weeks 1-2)

### Arrays & Strings - Essential

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 1 | Two Sum | Easy | https://leetcode.com/problems/two-sum/ | Classic warm-up, HashMap approach |
| 2 | Best Time to Buy and Sell Stock | Easy | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ | Single pass, track min |
| 3 | Contains Duplicate | Easy | https://leetcode.com/problems/contains-duplicate/ | HashSet basics |
| 4 | Product of Array Except Self | Medium | https://leetcode.com/problems/product-of-array-except-self/ | Prefix/suffix arrays |
| 5 | Maximum Subarray | Medium | https://leetcode.com/problems/maximum-subarray/ | Kadane's algorithm |
| 6 | Maximum Sum Circular Subarray | Medium | https://leetcode.com/problems/maximum-sum-circular-subarray/ | **Asked at Amazon SDET** |
| 7 | Maximum Points from Cards | Medium | https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/ | **Asked at Amazon SDET** |
| 8 | 3Sum | Medium | https://leetcode.com/problems/3sum/ | Two pointer technique |
| 9 | Container With Most Water | Medium | https://leetcode.com/problems/container-with-most-water/ | Two pointers |
| 10 | Merge Intervals | Medium | https://leetcode.com/problems/merge-intervals/ | Sorting + iteration |
| 11 | Valid Anagram | Easy | https://leetcode.com/problems/valid-anagram/ | Character counting |
| 12 | Group Anagrams | Medium | https://leetcode.com/problems/group-anagrams/ | HashMap with sorted key |
| 13 | Longest Substring Without Repeating | Medium | https://leetcode.com/problems/longest-substring-without-repeating-characters/ | Sliding window |
| 14 | Longest Consecutive Sequence | Medium | https://leetcode.com/problems/longest-consecutive-sequence/ | **Asked at Amazon SDET** |
| 15 | First Unique Character in String | Easy | https://leetcode.com/problems/first-unique-character-in-a-string/ | **Common SDET question** |
| 16 | Rotate Array | Medium | https://leetcode.com/problems/rotate-array/ | Multiple approaches |
| 17 | Move Zeroes | Easy | https://leetcode.com/problems/move-zeroes/ | In-place swap |
| 18 | Find All Duplicates in Array | Medium | https://leetcode.com/problems/find-all-duplicates-in-an-array/ | Index marking trick |
| 19 | Trapping Rain Water | Hard | https://leetcode.com/problems/trapping-rain-water/ | **Asked at Amazon SDET** |
| 20 | Search in Rotated Sorted Array | Medium | https://leetcode.com/problems/search-in-rotated-sorted-array/ | Binary search variant |

### Hash Maps & Hash Sets - Amazon Favorite

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 21 | Valid Sudoku | Medium | https://leetcode.com/problems/valid-sudoku/ | HashSet per row/col/box |
| 22 | Top K Frequent Elements | Medium | https://leetcode.com/problems/top-k-frequent-elements/ | HashMap + Heap or Bucket sort |
| 23 | Subarray Sum Equals K | Medium | https://leetcode.com/problems/subarray-sum-equals-k/ | Prefix sum + HashMap |
| 24 | Two Sum II - Sorted Array | Medium | https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ | Two pointers |
| 25 | 4Sum II | Medium | https://leetcode.com/problems/4sum-ii/ | HashMap optimization |
| 26 | Intersection of Two Arrays II | Easy | https://leetcode.com/problems/intersection-of-two-arrays-ii/ | HashMap counting |
| 27 | Happy Number | Easy | https://leetcode.com/problems/happy-number/ | Cycle detection with HashSet |
| 28 | Isomorphic Strings | Easy | https://leetcode.com/problems/isomorphic-strings/ | Two HashMaps |
| 29 | Word Pattern | Easy | https://leetcode.com/problems/word-pattern/ | Bijection with HashMap |
| 30 | LRU Cache | Medium | https://leetcode.com/problems/lru-cache/ | HashMap + Doubly Linked List |

---

## Phase 2: Trees & Graphs (Weeks 3-4)

### Binary Trees - Core Knowledge

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 31 | Binary Tree Inorder Traversal | Easy | https://leetcode.com/problems/binary-tree-inorder-traversal/ | Iterative & recursive |
| 32 | Binary Tree Level Order Traversal | Medium | https://leetcode.com/problems/binary-tree-level-order-traversal/ | BFS with queue |
| 33 | Maximum Depth of Binary Tree | Easy | https://leetcode.com/problems/maximum-depth-of-binary-tree/ | DFS basics |
| 34 | Same Tree | Easy | https://leetcode.com/problems/same-tree/ | Recursive comparison |
| 35 | Symmetric Tree | Easy | https://leetcode.com/problems/symmetric-tree/ | Mirror check |
| 36 | Invert Binary Tree | Easy | https://leetcode.com/problems/invert-binary-tree/ | Classic recursion |
| 37 | Path Sum | Easy | https://leetcode.com/problems/path-sum/ | Root to leaf |
| 38 | Binary Tree Right Side View | Medium | https://leetcode.com/problems/binary-tree-right-side-view/ | BFS or DFS |
| 39 | Lowest Common Ancestor of BST | Medium | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ | BST property |
| 40 | Lowest Common Ancestor of BT | Medium | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/ | Recursive search |
| 41 | Validate Binary Search Tree | Medium | https://leetcode.com/problems/validate-binary-search-tree/ | In-order or range check |
| 42 | Kth Smallest Element in BST | Medium | https://leetcode.com/problems/kth-smallest-element-in-a-bst/ | **Asked at Amazon SDET** |
| 43 | Construct BT from Preorder & Inorder | Medium | https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/ | Divide and conquer |
| 44 | Serialize and Deserialize BT | Hard | https://leetcode.com/problems/serialize-and-deserialize-binary-tree/ | BFS or preorder |
| 45 | Binary Tree Maximum Path Sum | Hard | https://leetcode.com/problems/binary-tree-maximum-path-sum/ | Post-order DFS |

### Graphs: BFS/DFS - Amazon's Top Topic

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 46 | Number of Islands | Medium | https://leetcode.com/problems/number-of-islands/ | **Must know** - DFS/BFS flood fill |
| 47 | Clone Graph | Medium | https://leetcode.com/problems/clone-graph/ | DFS + HashMap |
| 48 | Course Schedule | Medium | https://leetcode.com/problems/course-schedule/ | Topological sort |
| 49 | Course Schedule II | Medium | https://leetcode.com/problems/course-schedule-ii/ | Topological sort with order |
| 50 | Pacific Atlantic Water Flow | Medium | https://leetcode.com/problems/pacific-atlantic-water-flow/ | Multi-source BFS |
| 51 | Word Ladder | Hard | https://leetcode.com/problems/word-ladder/ | BFS shortest path |
| 52 | Rotting Oranges | Medium | https://leetcode.com/problems/rotting-oranges/ | Multi-source BFS |
| 53 | 01 Matrix | Medium | https://leetcode.com/problems/01-matrix/ | BFS from all zeros |
| 54 | Surrounded Regions | Medium | https://leetcode.com/problems/surrounded-regions/ | Border DFS |
| 55 | Graph Valid Tree | Medium | https://leetcode.com/problems/graph-valid-tree/ | Union-Find or DFS |
| 56 | Number of Connected Components | Medium | https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/ | Union-Find or DFS |
| 57 | Shortest Path in Binary Matrix | Medium | https://leetcode.com/problems/shortest-path-in-binary-matrix/ | BFS |
| 58 | All Paths From Source to Target | Medium | https://leetcode.com/problems/all-paths-from-source-to-target/ | DFS backtracking |
| 59 | Network Delay Time | Medium | https://leetcode.com/problems/network-delay-time/ | Dijkstra's algorithm |
| 60 | Cheapest Flights Within K Stops | Medium | https://leetcode.com/problems/cheapest-flights-within-k-stops/ | BFS with constraints |

---

## Phase 3: Dynamic Programming (Week 5)

### 1D Dynamic Programming

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 61 | Climbing Stairs | Easy | https://leetcode.com/problems/climbing-stairs/ | Fibonacci variant |
| 62 | House Robber | Medium | https://leetcode.com/problems/house-robber/ | Classic DP |
| 63 | House Robber II | Medium | https://leetcode.com/problems/house-robber-ii/ | Circular array DP |
| 64 | Coin Change | Medium | https://leetcode.com/problems/coin-change/ | **Must know** - unbounded knapsack |
| 65 | Word Break | Medium | https://leetcode.com/problems/word-break/ | DP + HashSet |
| 66 | Longest Increasing Subsequence | Medium | https://leetcode.com/problems/longest-increasing-subsequence/ | DP or Binary Search |
| 67 | Decode Ways | Medium | https://leetcode.com/problems/decode-ways/ | String DP |
| 68 | Perfect Squares | Medium | https://leetcode.com/problems/perfect-squares/ | BFS or DP |
| 69 | Maximum Product Subarray | Medium | https://leetcode.com/problems/maximum-product-subarray/ | Track min and max |
| 70 | Jump Game | Medium | https://leetcode.com/problems/jump-game/ | Greedy or DP |

### 2D Dynamic Programming

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 71 | Unique Paths | Medium | https://leetcode.com/problems/unique-paths/ | Grid DP basics |
| 72 | Unique Paths II | Medium | https://leetcode.com/problems/unique-paths-ii/ | With obstacles |
| 73 | Minimum Path Sum | Medium | https://leetcode.com/problems/minimum-path-sum/ | Grid DP |
| 74 | Longest Common Subsequence | Medium | https://leetcode.com/problems/longest-common-subsequence/ | **Asked at Amazon SDET** |
| 75 | Edit Distance | Medium | https://leetcode.com/problems/edit-distance/ | Classic 2D DP |
| 76 | Maximal Square | Medium | https://leetcode.com/problems/maximal-square/ | 2D DP |
| 77 | Target Sum | Medium | https://leetcode.com/problems/target-sum/ | 0/1 Knapsack variant |
| 78 | Partition Equal Subset Sum | Medium | https://leetcode.com/problems/partition-equal-subset-sum/ | 0/1 Knapsack |
| 79 | Best Time Buy Sell Stock with Cooldown | Medium | https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/ | State machine DP |
| 80 | Interleaving String | Medium | https://leetcode.com/problems/interleaving-string/ | 2D DP |

---

## Phase 4: Sliding Window & Two Pointers (Week 5-6)

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 81 | Minimum Window Substring | Hard | https://leetcode.com/problems/minimum-window-substring/ | Sliding window + HashMap |
| 82 | Sliding Window Maximum | Hard | https://leetcode.com/problems/sliding-window-maximum/ | Deque/Monotonic queue |
| 83 | Longest Repeating Character Replacement | Medium | https://leetcode.com/problems/longest-repeating-character-replacement/ | Sliding window |
| 84 | Permutation in String | Medium | https://leetcode.com/problems/permutation-in-string/ | Fixed window |
| 85 | Find All Anagrams in String | Medium | https://leetcode.com/problems/find-all-anagrams-in-a-string/ | Sliding window |
| 86 | Minimum Size Subarray Sum | Medium | https://leetcode.com/problems/minimum-size-subarray-sum/ | Variable window |
| 87 | Fruit Into Baskets | Medium | https://leetcode.com/problems/fruit-into-baskets/ | At most 2 types |
| 88 | Max Consecutive Ones III | Medium | https://leetcode.com/problems/max-consecutive-ones-iii/ | Flip at most k |
| 89 | Subarrays with K Different Integers | Hard | https://leetcode.com/problems/subarrays-with-k-different-integers/ | atMost(k) - atMost(k-1) |
| 90 | Longest Subarray of 1s After Deleting | Medium | https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/ | Sliding window |

---

## Phase 5: Stack, Queue & Linked Lists (Week 6)

### Stack Problems

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 91 | Valid Parentheses | Easy | https://leetcode.com/problems/valid-parentheses/ | **Classic SDET question** |
| 92 | Min Stack | Medium | https://leetcode.com/problems/min-stack/ | Design problem |
| 93 | Daily Temperatures | Medium | https://leetcode.com/problems/daily-temperatures/ | Monotonic stack |
| 94 | Evaluate Reverse Polish Notation | Medium | https://leetcode.com/problems/evaluate-reverse-polish-notation/ | Stack operations |
| 95 | Basic Calculator II | Medium | https://leetcode.com/problems/basic-calculator-ii/ | Expression parsing |
| 96 | Largest Rectangle in Histogram | Hard | https://leetcode.com/problems/largest-rectangle-in-histogram/ | Monotonic stack |
| 97 | Decode String | Medium | https://leetcode.com/problems/decode-string/ | Nested stack |
| 98 | Asteroid Collision | Medium | https://leetcode.com/problems/asteroid-collision/ | Stack simulation |
| 99 | Remove K Digits | Medium | https://leetcode.com/problems/remove-k-digits/ | Monotonic stack |
| 100 | Next Greater Element I | Easy | https://leetcode.com/problems/next-greater-element-i/ | Monotonic stack |

### Linked List Problems

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 101 | Reverse Linked List | Easy | https://leetcode.com/problems/reverse-linked-list/ | Iterative & recursive |
| 102 | Merge Two Sorted Lists | Easy | https://leetcode.com/problems/merge-two-sorted-lists/ | Basic merge |
| 103 | Linked List Cycle | Easy | https://leetcode.com/problems/linked-list-cycle/ | Fast/slow pointers |
| 104 | Linked List Cycle II | Medium | https://leetcode.com/problems/linked-list-cycle-ii/ | Find cycle start |
| 105 | Remove Nth Node From End | Medium | https://leetcode.com/problems/remove-nth-node-from-end-of-list/ | Two pointers |
| 106 | Reorder List | Medium | https://leetcode.com/problems/reorder-list/ | Find mid + reverse + merge |
| 107 | Add Two Numbers | Medium | https://leetcode.com/problems/add-two-numbers/ | Carry handling |
| 108 | Copy List with Random Pointer | Medium | https://leetcode.com/problems/copy-list-with-random-pointer/ | HashMap or interweaving |
| 109 | Merge K Sorted Lists | Hard | https://leetcode.com/problems/merge-k-sorted-lists/ | Heap or divide-conquer |
| 110 | Reverse Nodes in K-Group | Hard | https://leetcode.com/problems/reverse-nodes-in-k-group/ | Complex pointer manipulation |

---

## Phase 6: Heap & Backtracking (Week 7-8)

### Heap / Priority Queue

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 111 | Kth Largest Element in Array | Medium | https://leetcode.com/problems/kth-largest-element-in-an-array/ | Min-heap or quickselect |
| 112 | Find Median from Data Stream | Hard | https://leetcode.com/problems/find-median-from-data-stream/ | Two heaps |
| 113 | Task Scheduler | Medium | https://leetcode.com/problems/task-scheduler/ | Greedy + max-heap |
| 114 | Top K Frequent Words | Medium | https://leetcode.com/problems/top-k-frequent-words/ | HashMap + heap |
| 115 | Reorganize String | Medium | https://leetcode.com/problems/reorganize-string/ | Max-heap greedy |
| 116 | K Closest Points to Origin | Medium | https://leetcode.com/problems/k-closest-points-to-origin/ | Max-heap or quickselect |
| 117 | Find K Pairs with Smallest Sums | Medium | https://leetcode.com/problems/find-k-pairs-with-smallest-sums/ | Min-heap BFS |
| 118 | Kth Smallest in Sorted Matrix | Medium | https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/ | Min-heap or binary search |
| 119 | Meeting Rooms II | Medium | https://leetcode.com/problems/meeting-rooms-ii/ | Min-heap |
| 120 | IPO | Hard | https://leetcode.com/problems/ipo/ | Two heaps |

### Backtracking

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 121 | Subsets | Medium | https://leetcode.com/problems/subsets/ | Backtracking template |
| 122 | Subsets II | Medium | https://leetcode.com/problems/subsets-ii/ | With duplicates |
| 123 | Permutations | Medium | https://leetcode.com/problems/permutations/ | Classic backtracking |
| 124 | Permutations II | Medium | https://leetcode.com/problems/permutations-ii/ | With duplicates |
| 125 | Combination Sum | Medium | https://leetcode.com/problems/combination-sum/ | Unlimited use |
| 126 | Combination Sum II | Medium | https://leetcode.com/problems/combination-sum-ii/ | Single use |
| 127 | Letter Combinations of Phone | Medium | https://leetcode.com/problems/letter-combinations-of-a-phone-number/ | Mapping + backtrack |
| 128 | Generate Parentheses | Medium | https://leetcode.com/problems/generate-parentheses/ | Valid combinations |
| 129 | Word Search | Medium | https://leetcode.com/problems/word-search/ | Grid backtracking |
| 130 | N-Queens | Hard | https://leetcode.com/problems/n-queens/ | Classic constraint backtracking |

---

## Phase 7: Binary Search & Intervals (Week 8)

### Binary Search

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 131 | Binary Search | Easy | https://leetcode.com/problems/binary-search/ | Template |
| 132 | Search Insert Position | Easy | https://leetcode.com/problems/search-insert-position/ | Lower bound |
| 133 | Find First and Last Position | Medium | https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ | Two binary searches |
| 134 | Search in 2D Matrix | Medium | https://leetcode.com/problems/search-a-2d-matrix/ | Treat as 1D |
| 135 | Search in 2D Matrix II | Medium | https://leetcode.com/problems/search-a-2d-matrix-ii/ | **Amazon interview** - staircase |
| 136 | Find Minimum in Rotated Array | Medium | https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ | Binary search variant |
| 137 | Find Peak Element | Medium | https://leetcode.com/problems/find-peak-element/ | Binary search |
| 138 | Koko Eating Bananas | Medium | https://leetcode.com/problems/koko-eating-bananas/ | Binary search on answer |
| 139 | Capacity to Ship Packages | Medium | https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/ | Binary search on answer |
| 140 | Median of Two Sorted Arrays | Hard | https://leetcode.com/problems/median-of-two-sorted-arrays/ | Binary search |

### Intervals

| # | Problem | Difficulty | Link | Notes |
|---|---------|------------|------|-------|
| 141 | Insert Interval | Medium | https://leetcode.com/problems/insert-interval/ | Merge logic |
| 142 | Non-overlapping Intervals | Medium | https://leetcode.com/problems/non-overlapping-intervals/ | Greedy |
| 143 | Meeting Rooms | Easy | https://leetcode.com/problems/meeting-rooms/ | Sort + check overlap |
| 144 | Minimum Number of Arrows | Medium | https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/ | Greedy intervals |
| 145 | Employee Free Time | Hard | https://leetcode.com/problems/employee-free-time/ | Merge all intervals |

---

## Bonus: SDET-Specific Testing Problems

These problems directly relate to testing scenarios:

| # | Problem | Difficulty | Link | Why It's SDET-Relevant |
|---|---------|------------|------|------------------------|
| 146 | Design HashMap | Easy | https://leetcode.com/problems/design-hashmap/ | Understand collision handling |
| 147 | Design HashSet | Easy | https://leetcode.com/problems/design-hashset/ | Data structure fundamentals |
| 148 | Implement Queue using Stacks | Easy | https://leetcode.com/problems/implement-queue-using-stacks/ | Understand transformations |
| 149 | Implement Stack using Queues | Easy | https://leetcode.com/problems/implement-stack-using-queues/ | Data structure design |
| 150 | Design Browser History | Medium | https://leetcode.com/problems/design-browser-history/ | State machine testing |

---

## Daily Practice Template

### Week 1-2 Schedule
```
Monday:    2 Easy + 1 Medium (Arrays)
Tuesday:   1 Easy + 2 Medium (Arrays/Strings)
Wednesday: 3 Medium (HashMaps)
Thursday:  2 Medium + 1 Hard (Mixed)
Friday:    2 Medium (Review weak areas)
Saturday:  1 Hard + Review
Sunday:    Mock interview / Rest
```

### Tracking Progress

- [ ] Arrays & Strings (20 problems)
- [ ] Hash Maps (10 problems)
- [ ] Binary Trees (15 problems)
- [ ] Graphs BFS/DFS (15 problems)
- [ ] Dynamic Programming (20 problems)
- [ ] Sliding Window (10 problems)
- [ ] Stack & Linked List (20 problems)
- [ ] Heap & Backtracking (20 problems)
- [ ] Binary Search & Intervals (15 problems)
- [ ] SDET-Specific (5 problems)

**Total: 150 problems**

---

## Problem-Solving Approach (SDET Style)

When solving in interviews, follow this pattern:

1. **Clarify requirements** (like writing test cases)
   - Input constraints
   - Edge cases
   - Expected output format

2. **Think out loud** - verbalize your approach

3. **Start with brute force**
   - State time/space complexity
   - Acknowledge limitations

4. **Optimize**
   - Identify bottlenecks
   - Apply patterns (sliding window, two pointers, etc.)

5. **Code cleanly**
   - Good variable names
   - Modular functions
   - Handle edge cases

6. **Test your solution**
   - Walk through with examples
   - Check boundary conditions
   - This is where SDET skills shine!

---

## Recommended Resources

1. **NeetCode 150** - Curated problem list: https://neetcode.io/
2. **Blind 75** - Classic list for FAANG
3. **LeetCode Explore Cards** - For structured topic learning
4. **System Design Primer** - https://github.com/donnemartin/system-design-primer

---

*Good luck with your preparation! Consistency beats intensity.*
