
//George Lees Jr.
// Binary Search Tree Class

public class binaryST {
	 private bNode root = null;	//declare root Node
	 static boolean result;		//need return result
	 
	 static class bNode{		//First thing first make nodes
			Comparable data;	//make data type comparable so i can use compareTo method
			bNode left;			//leftChild data field
			bNode right;		//rightChild data field
			
			//create node object w/ comparable argument constructor
			bNode(Comparable data){
				this.data=data;		//set passed in value for data at datafield data
				this.left=this.right=null;}	//set children equal to null until specified
	 }			
//recursive wrapper for Search 
public void Searchwrapper(int value)
	 {  if (root == null)      
	       System.out.println ("Empty tree.");
	    else                   
	       Search(root, value);		//recursive call to Search if bst not empty
		System.out.println(result);	//once recursive method reaches base case then print result
		System.out.println();
}

public static boolean Search(bNode node, int value){
						
	        if(node == null){	    //if search is unsuccessful	
	        result=false;
	        return false;}
	        
	        else{					//traverse node here 
	        result=true;			//compare with local node recursively 
	        return 
	                node.data == (Comparable)value ||
	                Search(node.left, value) ||
	                Search(node.right, value);}

}
			
@SuppressWarnings("unchecked")
//insert method recursive
public void insert(Comparable value){

	root=insert(value,root);}		//recursive wrapper

@SuppressWarnings("unchecked")
private bNode insert(Comparable value,bNode node){//input value to insert then wrapper method passes local root
	
	 if ( node == null )
         return new bNode(value);					//empty bst then make it root
      else if (value.compareTo(node.data) < 0)		//traverse to find where to insert
         node.left  = insert ( value, node.left );	//recursively traverse
      else
         node.right = insert ( value, node.right );
      return node;}

public void inorderTraversalwrapper()//recursive wrapper for inOrder Traversal
{  if (root == null)      
      System.out.println ("Empty tree.");	//empty bst case
   else                   
      inorderTraversal(root);  			//wrapper call to inorderTraversal passing in local root
} 

void inorderTraversal(bNode item)
{
   if ( item == null) return;        
  
   inorderTraversal(item.left);     	//recursive traversal
   System.out.println ( item.data);
   inorderTraversal(item.right);      
} 

//deletion!
public boolean delete(Comparable data){

	bNode focusNode=root;		//ok need a reference node to compare to
	bNode parent=root;			//set parent equal to root
	
	boolean isLeft=true;		//return type boolean so need this
	
	while(focusNode.data !=data){	// if data is not equal to focus node data then
		parent=focusNode;			//set parent = to focus node because we are going down 
		
		if(data.compareTo(focusNode.data)<0){//if data is less then focus node data then go left
			isLeft=true;
			
			focusNode=focusNode.left;		//set focus to left child
		}else{
			isLeft=false;
			
			focusNode=focusNode.right;		//set focus node right if focusnode >data
		}
		if(focusNode==null)					//couldn't find the number
			return false;
		
	}
	if(focusNode.left==null && focusNode.right==null){//ok if the node doesn't have Children
		if(focusNode==root){							//set root null
			root=null;
										//leaf nodes
		}else if(isLeft){				//if it is left child then delete child from parent node
			parent.left=null;
		
		}else{							//if its a right leaf the delete from parent
			parent.right=null;}
			
		}
	

	else if(focusNode.right==null){		//if no right child

		if(focusNode==root)
			root=focusNode.left;		//set focus node to left

		else if(isLeft)					
			parent.left=focusNode.left;		//just set parents left child to focusnodes left childs
		else parent.right=focusNode.left;
	}
	else if(focusNode.left==null){
		
		if(focusNode==root)
			root=focusNode.right;
		
		else if(isLeft)
			parent.left=focusNode.right;
		
		else
			parent.right=focusNode.left;
	}
	else{
		bNode replacement =getReplacementNode(focusNode);//if there are two children
														//we need to figure out replacement
		if(focusNode==root)
			root=replacement;
		
		else if(isLeft)
			parent.left=replacement;
		else
			parent.right=replacement;
		
		replacement.left=focusNode.left;
	}
	return true;
}



public bNode getReplacementNode(bNode replacedNode){//return replacement node

bNode replacementParent=replacedNode;
bNode replacement=replacedNode;

bNode focusNode=replacedNode.right;

while(focusNode !=null){
	
	replacementParent=replacement;
	
	replacement=focusNode;
	
	focusNode=focusNode.left;
}

if(replacement != replacedNode.right){
	
	replacementParent.left=replacement.right;
	replacement.right=replacedNode.right;
}
return replacement;}			

	
	public static void main(String[] args) {
		
		binaryST theTree= new binaryST();
		
		theTree.insert(50);
		theTree.insert(40);
		theTree.insert(80);
		theTree.insert(20);
		theTree.insert(45);
		theTree.insert(60);
		theTree.insert(90);
		theTree.insert(55);
		theTree.insert(65);
		theTree.inorderTraversalwrapper();
		theTree.Searchwrapper(20);
		theTree.delete(20);
		theTree.inorderTraversalwrapper();
		theTree.Searchwrapper(80);
		theTree.delete(80);
		theTree.inorderTraversalwrapper();
	}
	
}

		
		
		
	
	



	
	

