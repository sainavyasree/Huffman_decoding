package h_decoding;

    abstract public class Node implements Comparable<Node> {
        public  int frequency; // the frequency of this tree
        public  char data;
        public  Node left, right; 
        public Node(int freq) { 
          frequency = freq; 
        }
     
        // compares on the frequency
        public int compareTo(Node tree) {
            return frequency - tree.frequency;
        }
      
    }
