# FindClosestValueInBST
  - given a BST data Structure , and and target num , the output is the closest number to the target num.
  - Assume that there will only be one closet value. so there is no ambiguous value.
# Solution
  - assign initial closest is the largest number that could have + infinitive
  - check current node value is distance from target and the closest to the target then update the closest value
  - check the left side or right side need to go, base on the value of the root/current node.
  - if it equal exit no more action need.
  - time complexity : O(LogN)
  - space / memory : O(1) or O(N) depend on the method using
# Define the BST class:
    - Class BST
    - define insert new node function
    - define remove node function
