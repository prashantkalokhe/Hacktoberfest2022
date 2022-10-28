# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        def mirror(root):
            if not root:
                return
            temp=root
            mirror(root.left)
            mirror(root.right)
            temp=root.left
            root.left=root.right
            root.right=temp
        mirror(root)
        return 
