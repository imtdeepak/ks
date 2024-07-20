package com.ks.datastructures.tree;

/**
 * @author Ahil
 */
public class Trie
{

    // Root node
    TrieNode root = null;

    public Trie()
    {
        root = new TrieNode();
    }

    public static void main(String args[])
    {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("cart");
        trie.insert("card");

        System.out.println("Word found: " + trie.search("car"));
        System.out.println("Word found: " + trie.search("dummy"));

        trie.printAllWords();
    }

    // Inserts a word into the trie.
    public void insert(String word)
    {
        TrieNode p = root;
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            int index = c - 'a';
            if ( p.data[index] == null )
            {
                TrieNode temp = new TrieNode();
                p.data[index] = temp;
                p = temp;
            }
            else
            {
                p = p.data[index];
            }
        }
        p.isEnd = true;
    }

    public boolean search(String word)
    {
        TrieNode p = root;
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            int index = c - 'a';
            if ( p.data[index] != null )
            {
                p = p.data[index];
            }
            else
            {
                return false;
            }
        }

        if ( p.isEnd )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printAllWords()
    {
        printWordStrings(root, "");
    }

    private void printWordStrings(TrieNode start, String toPrint)
    {
        if ( start == null )
        {
            return;
        }
        if ( start.isEnd )
        {
            System.out.println(toPrint);
        }

        for (int i = 0; i < start.data.length; i++)
        {
            TrieNode t = start.data[i];
            if ( t != null )
            {
                printWordStrings(t, toPrint + (char) (97 + i));
            }
        }
    }

    private class TrieNode
    {
        // Declare an array of 26 characters

        TrieNode[] data;
        boolean    isEnd;

        TrieNode()
        {
            data = new TrieNode[26];
        }

        public TrieNode[] getData()
        {
            return data;
        }

        public void setData(TrieNode[] data)
        {
            this.data = data;
        }

        public boolean isEnd()
        {
            return isEnd;
        }

        public void setIsEnd(boolean isEnd)
        {
            this.isEnd = isEnd;
        }
    }
}
