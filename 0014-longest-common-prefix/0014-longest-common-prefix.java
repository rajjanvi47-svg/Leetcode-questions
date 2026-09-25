class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix = strs[0];

    // -------- comparing strings
    for(int i=1;i<strs.length;i++)
    {
        while(!strs[i].startsWith(prefix))
        {

     //  _______ prefix ka last character remove _______
    
     prefix= prefix.substring(0,prefix.length()-1);
      if (prefix.isEmpty()){
        return "";
      }
        }
    }
        
        return prefix;

    }
}