'''
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4


'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None



'''
special case- 1. [1], [2,3]
              2. [], [1,2,3]
              3. [1,2,3], []  
'''

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1 == None:
            return l2
        elif l2 == None:
            return l1
        root = None
        if l1.val < l2.val:
            root = l1
            l1 = l1.next
        else:
            root = l2
            l2 = l2.next
        temp = root
        while l1 and l2:
            if l1.val < l2.val:
                temp.next = l1
                temp = l1
                l1 = l1.next
            else:
                temp.next = l2
                temp = l2
                l2 = l2.next
        if l1:
            temp.next = l1
        elif l2:
            temp.next = l2
        return root    
                              