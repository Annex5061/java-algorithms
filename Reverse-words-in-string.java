class Solution {
    public String reverseWords(String s) {
        String resp = "";
        List<String> list  = Arrays.asList(s.split(" "));
        for(String word : list){
            resp += reverseIt(word);
            resp += " ";
        }
        return resp.trim();
    }
    
   String reverseIt(String word){
   StringBuilder input = new StringBuilder();
        input.append(word);
        input.reverse();
       return input.toString();
   }
}
