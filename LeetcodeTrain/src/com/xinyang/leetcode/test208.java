package com.xinyang.leetcode;

public class test208 {
}


class node{
    node []child=new node[26];
    boolean isend;
};
class Trie {
    private node root;
    public Trie() {
        root=new node();
    }

    public void insert(String word) {
        node cur=root;
        for (char c : word.toCharArray()) {
            c-='a';
            if(cur.child[c]==null){
                cur.child[c]=new node();
            }
            cur=cur.child[c];
        }
        cur.isend=true;
    }

    public boolean search(String word) {
        return find(word)==2;
    }

    public boolean startsWith(String prefix) {
        return find(prefix)>0;
    }
    private int find(String word){
        node cur=root;
        for (char c : word.toCharArray()) {
            c-='a';
            if(cur.child[c]==null){
                return 0;
            }
            cur=cur.child[c];
        }
        return cur.isend?2:1;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */