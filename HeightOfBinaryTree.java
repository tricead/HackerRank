	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int getHeight(Node root) {
        if(root == null) {
            return -1;
        }
        
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(leftHeight > rightHeight) {
            return leftHeight + 1;
        }
        return rightHeight + 1;
    }
