
public class BinaryTree
{
//private Node root;
private boolean isEmpty;
private int payload;
private BinaryTree leftTree;
private BinaryTree rightTree;
private int depth;
public BinaryTree()
{
	this(0);
}

private BinaryTree(int depth)
{
this.isEmpty = true;
this.leftTree = null;
this.rightTree = null;
this.depth = depth;
}
public boolean search(int value)
{	//if 
	//(BinaryTree.this.isEmpty == true)
//return true;
//else 
	//return false;
	if(this.isEmpty)
	{
		return false;
	}
	else
	{
		if(this.payload== value)
		{
			return true;
		}
		else
		{
			if(value < payload)
			{
				if(this.leftTree == null)
				{
					return false;
					}
				else
				{
					return this.leftTree.search(value);
				}
			}
		}
	}
	return isEmpty;
}
public boolean isEmpty() {
	return isEmpty;
}
public void setEmpty(boolean isEmpty) {
	this.isEmpty = isEmpty;
}
public int getPayload() {
	return payload;
}
public void setPayload(int payload) {
	this.payload = payload;
}
private void visitInOrder()
{
if(this.leftTree != null)
{
this.leftTree.visitInOrder();
}
System.out.println(this.payload + " : " + this.depth);
if(this.rightTree != null)
{
this.rightTree.visitInOrder();
}
}
public void displayInOrder()
{
System.out.println("**** In Order ****");
if(this.isEmpty)
{
System.out.println("Empty Tree");
}
else
{
this.visitInOrder();
}
}
private void visitPreOrder()
{
System.out.println(this.payload);
if(this.leftTree != null)
{
this.leftTree.visitPreOrder();
}
if(this.rightTree != null)
{
this.rightTree.visitPreOrder();
}
}
public void displayPreOrder()
{
System.out.println("**** Pre Order ****");
if(this.isEmpty)
{
System.out.println("Empty Tree");
}
else
{
this.visitPreOrder();
}
}
private void visitPostOrder()
{
if(this.leftTree != null)
{
this.leftTree.visitPostOrder();
}
if(this.rightTree != null)
{
this.rightTree.visitPostOrder();
}
System.out.println(this.payload);
}
public void displayPostOrder()

{
System.out.println("**** Post Order ****");
if(this.isEmpty)
{
System.out.println("Empty Tree");
}
else
{
this.visitPostOrder();
}
}
private int getMaxDepth()
{
	if(this.leftTree == null && this.rightTree == null)
	{
		return this.depth;
	}
	else if(this.leftTree == null)
	{
		return this.rightTree.getMaxDepth();
	}
	else if(this.rightTree == null)
	{
		return this.leftTree.getMaxDepth();
	}
	else
	{
		return Math.max(this.leftTree.getMaxDepth(), this.rightTree.getMaxDepth());
	}
}
public boolean isBalanced()
{
	if(this.isEmpty)
	{
		return true;
	}
	else
	{
		//boolean-expr?true-val:false-val
		int currMaxLeftDepth = this.leftTree == null?0:this.leftTree.getMaxDepth();
		int currMaxRightDepth = this.rightTree == null?0:this.rightTree.getMaxDepth();
		System.out.println("Max Left = " + currMaxLeftDepth);
		System.out.println("Max Right = " + currMaxRightDepth);
		return Math.abs(currMaxLeftDepth - currMaxRightDepth) <=1;
	}
}
public void add(int value)
{
if(this.isEmpty)
{
this.payload = value;
this.isEmpty = false;
}
else
{
if(value <= this.payload)
{
if(this.leftTree == null)
{
this.leftTree = new BinaryTree(this.depth+1);
}
this.leftTree.add(value);
}
else
{
if(this.rightTree == null)
{
this.rightTree = new BinaryTree();
}
this.rightTree.add(value);
}
}
}
public void reBalance()
{
	if(this.leftTree.getMaxDepth() == this.getMaxDepth()-1)
	{
		if(this.leftTree.getMaxDepth() >2)
		{
			this.leftTree.reBalance();
		}
		else
		{
			if(this.rightTree == null)
			{
				rotateLeft(this);
			}
			else
			{
				rotateLeft(this);
				rotateRight1(rotateLeft(this));
			}
		}
	}
	else
	{
		if()
		{
			this.rightTree.reBalance();
		}
		else
		{
			if(this.leftTree == null)
			{
				rotateRight1(this);
			}
			else
			{
				rotateRight1(this);
			}
			else
			{
				rotateRight1(this);
				rotateLeft(rotateRight1(this));
			}
				}
	}
}

private void rotateRight1(Object rotateLeft) {
	// TODO Auto-generated method stub
	
}

private BinaryTree rotateRight1(Object rotateLeft) {
	return leftTree;
	// TODO Auto-generated method stub
	
}

private void rotateRight(Object rotateLeft) {
	// TODO Auto-generated method stub
	
}

private void rotateLeft(BinaryTree binaryTree) {
	// TODO Auto-generated method stub
	
}
}
