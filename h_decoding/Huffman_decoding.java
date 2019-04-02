/*
 * You are given pointer to the root of the Huffman tree and a binary coded string to decode. You need to print the decoded string.

Function Description

Complete the function decode_huff in the editor below. It must return the decoded string.

decode_huff has the following parameters:

root: a reference to the root node of the Huffman tree
s: a Huffman encoded string
Input Format

There is one line of input containing the plain string, . Background code creates the Huffman tree then passes the head node and the encoded string to the function.

Constraints


Output Format

Output the decoded string on a single line.

Sample Input

image

s="1001011"
Sample Output

ABACA
 */

package h_decoding;

public class Huffman_decoding {
    
    public void decode(String s, Node root) {
        char input[]=new char[100];
        input=s.toCharArray();
        Node root_node=root;
        for(int i=0;i<s.length();i++)
        {
            if(input[i]=='0')
            root_node=root_node.left;
            else if(input[i]=='1')
            root_node=root_node.right;
            if(root_node.left==null||root_node.right==null)
            {
            System.out.print(root_node.data);
            root_node=root;
            }
        }

       
    }

}
