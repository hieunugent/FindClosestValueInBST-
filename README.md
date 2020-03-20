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
        - with the right children node and left children node
        - with the value of each node
    - define insert new node function
        - function will used as .insert(new number),
        - this number will be the new node that satisfy the condition of BST,
        - greater the root will on the right root , less than the root will be on the left
    - define remove node function
        - this function will remove/delete the node input
        - if the node does not exit return there is no node to delete
        - the node will be delete if there is one.
