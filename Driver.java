import java.util.Random;

public class Driver
{
public static void main(String[] args)
{
	Random r = new Random();
BinaryTree bt = new BinaryTree();
for(int i = 0; i < 50000; i++)
{
	bt.add(r.nextInt());
}
bt.add(10);
bt.add(4);
bt.add(16);
bt.add(0);
bt.add(8);
bt.add(12);
bt.add(81);
bt.add(2);
bt.add(5);
bt.add(9);
bt.add(11);
bt.add(24);
bt.add(1);
bt.add(3);
bt.add(38);
System.out.println(bt.isBalanced());
}
}

