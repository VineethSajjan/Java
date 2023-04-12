/*
Imagine that you are playing  word game, the conept of game is,you will be given  list of different words and  Provided with a search word, you should determine if you can change exactly one character in this search word to match any word in the given list of words.
      "note use trie datastructure only."
input :
       line one is an integer(say n) which gives number of words to read
	   next n lines list of words in lowercase only
	   next line a word to search
output :
         true or false
sample cases
example 1:
input :5
hello
kmit
ngit
kmec
aiml
kmIt
output : true
Explanation : we can change the I in kmIt to i to match kmit of input word so result is true
example 2:
input = 6
bill
ball
board
bat
boat
bracnh
ball
output = true
Explanation : we have exact match for ball search key in the given strings but by changing one character that is a in ball we can make it as bill hence result is true
Example 3:
input=5
ball
board
bat
boat
branch
ball
output =false
Explanation : search keyword ball can't form any word in the given words with one character change hence result is false.
*/

import java.util.*;
class TrieNode {
    boolean end;
    TrieNode[] children;
    TrieNode() {
        end=false;
        children = new TrieNode[26];
    }
    TrieNode get(char a){
        return children[a-'a'];
    }
    void put(char a,TrieNode n){
        children[a-'a'] = n;
    }
    boolean containsKey(char a){
        if(children[a-'a']!=null){
            return true;
        }
        return false;
    }
    void setend(){
        end=true;
    }
    boolean isend(){
        return end;
    }
}

class MagicDictionary {
    
    TrieNode root;

    /** Initialize your data structure here. */
    public MagicDictionary() {
        root = new TrieNode();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String s) {
        TrieNode t = root;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!t.containsKey(c)){
                t.put(c,new TrieNode());
            }
            t=t.get(c);
        }
        t.setend();
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean findword(String word) {
        TrieNode t = root;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            if(!t.containsKey(c)){
                return false;
            }
            t=t.get(c);
        }
        return t.isend();
    }
    
    private boolean search(String word) {
        for(int j=0;j<word.length();j++){
            for(int k=0;k<26;k++){
                if(word.charAt(j)-'a'==k) continue;
                StringBuilder sb = new StringBuilder(word);
                sb.setCharAt(j,(char)(k+'a'));
                String s = sb.toString();
                if(findword(s)) return true;
            }
        }
        return false;
    }
	
    public static void main(String[] args) {
        MagicDictionary obj = new MagicDictionary();
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] dict = new String[n];
        for (int i = 0; i < n; i++) {
            dict[i] = scanner.nextLine();
        }
        for(int i=0;i<dict.length;i++){
            obj.buildDict(dict[i]);
        }
        String word = scanner.nextLine();
        boolean result = obj.search(word);
        System.out.println(result);

        scanner.close();
    
}

}
