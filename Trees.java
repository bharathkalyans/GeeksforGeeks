import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int k){
        data=k;
    }
}
    public class Trees {
        public static void main(String[] args) {
            Node root=new Node(10);
            root.left=new Node(2);
            root.right=new Node(11);
            root.left.left=new Node(1);
            root.left.right=new Node(3);
            root.right.right=new Node(23);
            root.right.right.right=new Node(39);


        }



       /* public static int preIndex=0;
		//is=inorder start index,ie=inorder start index
        //Time Complexity of below written method is O(n^2)
		public static Node completeTree(int[] inorder,int[]preorder,int is,int ie){
			if(is>ie)
				return null;
			Node root=new Node(preorder[preIndex++]);
			
			int inIndex = 0;
			
			for(int i=is;i<=ie;i++){
				if(inorder[i]==root.data){
					inIndex=i;
					break;
				}
			}
			
			root.left=completeTree(inorder,preorder,is,inIndex-1);
			root.right=completeTree(inorder,preorder,inIndex+1,ie);
			
			return root;
		}*/
        public static int preIndex=0;
        private static HashMap<Integer,Integer> map=new HashMap<>();
        public static void cTree(int[] inorder,int[]preorder,int is,int ie){
            for (int i=0;i<inorder.length;i++)
                map.put(inorder[i],i);//Preprocessing the Inorder array to reduce Time Complexity.

            cTree(inorder,preorder,is,ie,map);
        }
        public static Node cTree(int[] inorder,int[]preorder,int is,int ie,HashMap<Integer,Integer> map){

            if(is>ie)
                return null;
            Node root=new Node(preorder[preIndex++]);
            int inIndex=map.get(root.data);//Here I cut the part of using for loop!!

            root.left=cTree(inorder,preorder,is,inIndex-1,map);
            root.right=cTree(inorder,preorder,inIndex+1,ie,map);


            return  root;
        }

        public static Node prev=null;
        public static Node BinaryTreeToDLL(Node root){
            //Using Inorder Traversal!!!
            if(root==null) return root;

            Node head=BinaryTreeToDLL(root.left);


            if (prev==null)
                head=root;
            else{
                root.left=prev;
                prev.right=root;
            }
            prev=root;


            BinaryTreeToDLL(root.right);
            return head;
        }

        public static int isBalanced(Node root){
            //Make sure you write  a Balanced tree first and validate it.
            //In this we are basically returning height of the tree,if -1 then it is not a self balanced tree.
            if(root==null) return 0;
            int lh=isBalanced(root.left);
            if(lh==-1) return -1;
            int rh=isBalanced(root.right);
            if(rh==-1) return -1;

            if(Math.abs(lh-rh)>1) return -1;
            else return Math.max(lh,rh)+1;
        }
        public static boolean isBalancedNaive(Node root){
            if (root==null) return true;
            int lh=heightOfTree(root.left);
            int rh=heightOfTree(root.right);
            return (Math.abs(lh-rh)<=1 &&
                    isBalancedNaive(root.left) &&
                    isBalancedNaive(root.right)
            );

        }

        public static  boolean childSumProperty(Node root) {
            if (root==null) return true;
            if(root.left==null && root.right==null) return true;
            int sum=0;

            if(root.left!=null)
                sum+=root.left.data;
            if (root.right!=null)
                sum+=root.right.data;

            return (root.data==sum && childSumProperty(root.left) && childSumProperty(root.right));
        }

        public static int maxValue2=0;
        public static void printRV(Node root,int level){
            if (root==null) return;
            if(maxValue2<level){
                System.out.println(root.data);
                maxValue2=level;
            }
            printRV(root.right,level+1);
            printRV(root.left,level+1);
        }
        public static void printRightView(Node root){ printRV(root,1); }

        public static int maxValue=0;
        public static void printLV(Node root, int level){
            if (root==null) return;
            if(maxValue<level){
                System.out.println(root.data);
                maxValue=level;
            }
            printLV(root.left,level+1);
            printLV(root.right,level+1);

        }
        public static void printLeftView(Node root){ printLV(root,1); }

        public static int getMaxOfBT(Node root){
            if (root == null)
                return Integer.MIN_VALUE;
            else{
                return Math.max(root.data,Math.max(getMaxOfBT(root.left), getMaxOfBT(root.right)));
            }
        }
        public static int sizeOfBT(Node root){
            if(root==null)
                return 0;
            else return (1+sizeOfBT(root.left)+sizeOfBT(root.right));
        }
        public static void BFSNoob(Node root){
            /**
             * Time Complexity is  O(n*h)
             * InEfficient Solution
             * */
            int height=heightOfTree(root);
            for (int i=0;i<height;i++){
                printNodeAtKthDistance(root,i);
            }
        }
        public static void BFS(Node root){
            if (root==null)  return;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()){
                Node curr=q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
            }
        }
        public static void BFS2(Node root){
            if (root==null)  return;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (q.size()>1){
                Node curr=q.poll();
                if(curr==null){
                    System.out.println();
                    q.add(null);
                    continue;//Exit from the loop if you encounter a "null".
                }
                System.out.print(curr.data+" ");
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        public static void BFS3(Node root) {
            if (root==null)  return;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(q.isEmpty()==false){
                int count=q.size();
                for (int i=0;i<count;i++){
                    Node curr=q.poll();
                    System.out.print(curr.data+" ");
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
                System.out.println();
            }

        }
        public static void printNodeAtKthDistance(Node root,int k){
            if (k<0 || root==null) return;
            if (k==0){
                System.out.println(root.data);
                return;
            }

            printNodeAtKthDistance(root.left,k-1);
            printNodeAtKthDistance(root.right,k-1);


        }
        public static void inorderTraversal(Node root){

            if(root!=null){
              inorderTraversal(root.left);
              System.out.println(root.data);
              inorderTraversal(root.right);
          }
        }
        public static void postOrderTraversal(Node root){

            if(root!=null){
                inorderTraversal(root.left);
                inorderTraversal(root.right);
                System.out.println(root.data);
            }
        }
        public static void preOrderTraversal(Node root){

            if(root!=null){
                System.out.println(root.data);
                inorderTraversal(root.left);
                inorderTraversal(root.right);
            }
        }
        public static int heightOfTree(Node root){
            if (root==null)
                return 0;
            else
                return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
        }


}
