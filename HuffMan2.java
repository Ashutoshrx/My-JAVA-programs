import java.util.*;
import java.io.*;
abstract class HuffTree implements Comparable<HuffTree>
{
    public final int f; 
    public HuffTree(int freq) 
    { 
		f = freq; 
    }

    public int compareTo(HuffTree tree) 
	{
        return f - tree.f;
    }
}
 
class HuffLeaf extends HuffTree 
{
    public final char value; 
    public HuffLeaf(int freq, char val) 
    {
        super(freq);
        value = val;
    }
}
 
class HuffNode extends HuffTree 
{
  public final HuffTree left, right; 
  public HuffNode(HuffTree l, HuffTree r) 
  {
        super(l.f + r.f);
        left = l;
        right = r;
   }
}
 
public class HuffMan2
{
	public static HuffTree buildTree(int[] charFreqs) {
	PriorityQueue<HuffTree> trees = new PriorityQueue<HuffTree>();
	for (int i = 0; i < charFreqs.length; i++)
            
     if (charFreqs[i] > 0)
     trees.offer(new HuffLeaf(charFreqs[i], (char)i));
	assert trees.size() > 0;    
	while (trees.size() > 1) 
	{
        HuffTree a = trees.poll();
        HuffTree b = trees.poll();
 
        trees.offer(new HuffNode(a, b));
    }
	return trees.poll();
    }
 
public static void printC(HuffTree tree, StringBuffer prefix) 
{
	assert tree != null;
    if (tree instanceof HuffLeaf) 
	{
        HuffLeaf leaf = (HuffLeaf)tree;
        System.out.println(leaf.value + "\t" + leaf.f + "\t" + prefix);
	} 
    else if (tree instanceof HuffNode) 
	{
       HuffNode node = (HuffNode)tree;
       prefix.append('0');
       printC(node.left, prefix);
       prefix.deleteCharAt(prefix.length()-1);
 
       prefix.append('1');
       printC(node.right, prefix);
       prefix.deleteCharAt(prefix.length()-1);
    }
}
 
public static void main(String[] args) 
{
    String test = "ashutosh_satapathy";
    int[] charFreqs = new int[256];
	//char c;
	/*try
	{
		String test = null;
		FileReader fr=new FileReader("ashu.txt");
		BufferedReader br=new BufferedReader(fr);
		while((test=br.readLine())!=null)
		{*/
		for (char c : test.toCharArray())
		{
			//c=test.toChar();
			//charFreqs[test]++;
			charFreqs[c]++;
		}
        HuffTree tree = buildTree(charFreqs);
        printC(tree, new StringBuffer());
		}/*	
	}
	catch(FileNotFoundException e)
	{
		System.out.print("not found");
	}
	catch(IOException e)
	{
		System.out.print("IO");
	}
}*/
}
