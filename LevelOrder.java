import java.util.LinkedList;
import java.util.Queue;

/**
Level Order Traversing in Tree
1.Create Queue that store node
2.Insert root and null in queue
3.Traverse queue start to end
4.Access Queue front element and remove front
5.Front is not null than insert front child in queue 
6.Front is null than insert null in queue
7.run loop until queue is not empty
*/

/**
 * Find number of element at kth level
 * 1.Level increment when queue front is null
 * 2.if(k == level) than increment count
 * 3.Until front is not null
 */

/**
 *Count all nodes in binary tree
 *all nodes = left subtree + right subtree + 1;
 */

/**
 * Sum of all nodes in binary tree
 * sum = left subtree + right subtree + root.data;
 */


public class LevelOrder {
    // Tree Level Order Traversal

    // create structure of tree node
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }


    // Code of level order traversal
    public static int levelOrder(Node root,int k)
    {
        // step-1 create queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        // define level
        int level = 0;
        int count = 0;
        int sum = 0;

        // traverse queue start to end 
        while(!queue.isEmpty())
        {
            Node frontElement = queue.element();
            queue.remove(); // remove front

            // front is not null
            if(frontElement != null)
            {
                // System.out.print(frontElement.data+" ");

                // level match
                if(k == level)
                {
                    count = count +1;  // count num of element at kth level
                }


                // sum of node at kth level
                if(k == level)
                {
                    sum = sum + frontElement.data;
                }


                if(frontElement.left != null)
                {
                    queue.add(frontElement.left);
                }
                if(frontElement.right != null)
                {
                    queue.add(frontElement.right);
                }
            }
            // else is null
            // than also check queue is empty or not
            else if(frontElement == null && !queue.isEmpty())
            {
                queue.add(null);
                level++;
            }
    
        }
        return sum;
    }

    // count all nodes of binary tree
    public static int countAllNode(Node root)
    {
        // if no child nod exist than return 0
        if(root == null)
        {
            return 0;
        }
        return countAllNode(root.left)+countAllNode(root.right)+1;
    }

    // find sum of all nodes in binary tree
    public static int findSum(Node root)
    {
        // if no child nod exist than return 0
        if(root == null)
        {
            return 0;
        }
        return findSum(root.left) + findSum(root.right) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        

        int sum= levelOrder(root,2);
        System.out.println(sum);

        System.out.println("Total Sum:"+findSum(root));
        System.out.println("Total Nodes:"+countAllNode(root));

        
    }
}
