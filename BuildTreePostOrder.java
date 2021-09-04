public class BuildTreePostOrder {

    public static int idy = 4;
    public static int idx = 0;

    // structure of single node
    public static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static int search(int in[],int start,int end,int data)
    {
        for (int i = start; i <= end; i++) {
            if(in[i] == data)
            {
                return i;
            }
        }
        return -1;
    }

    public static Node postOrderCreateTree(int post[],int in[],int start,int end)
    {

        // if inorder array is empty
        if(start>end)
        {
            return null;
        }
        int data = post[idy];
        idy--;
        // create root node
        Node root = new Node(data);

        // if array contain only one element
        if(start ==  end)
        {
            return root;
        }

        // find element position in inorder array
        int pos = search(in,start,end,data);

        // post order first right subtree build
        root.right = postOrderCreateTree(post, in, pos+1, end);
        root.left = postOrderCreateTree(post, in, start, pos-1);

        return root;

    }


    // build tree using preorder

    public static Node preOrderCreateTree(int pre[],int in[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        // create root node
        int data = pre[idx];
        idx++;
        Node root = new Node(data);
       
        if(start == end)
        {
            return root;
        }

        int pos = search(in, start, end, data);
        root.left = preOrderCreateTree(pre, in, start, pos-1);
        root.right = preOrderCreateTree(pre, in, pos+1, end);
        return root;

    }
    // print tree in post order
    public static void printPost(Node root)
    {
        if(root == null)
        {
            return;
        }
        printPost(root.left);
        printPost(root.right);
        System.out.print(root.data+" ");
    }

    // preorder traversal
    public static void printPre(Node root)
    {
        if(root == null)
        {
            return;
        }
        // traverse root
        System.out.print(root.data+" ");
        // traverse left
        printPre(root.left);
        printPre(root.right);
    }

    // inorder traversal
    public static void printIn(Node root)
    {
        if(root == null)
        {
            return;
        }
        printIn(root.left);
        System.out.print(root.data+" ");
        printIn(root.right);
    }
    public static void main(String[] args) {
        int in[] = {4,2,1,5,3};
        int post[] = {4,2,5,3,1};
        int pre[] = {1,2,4,3,5};
        Node root2 = preOrderCreateTree(pre, in, 0, 4);
        printPre(root2);
        System.out.println();
        printIn(root2);
        System.out.println();

        Node root1 = postOrderCreateTree(post, in, 0, 4);
        printPost(root1);
        System.out.println();
        printIn(root1);
        System.out.println();
       


    }
    
}
