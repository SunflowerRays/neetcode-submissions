class Solution {
    public boolean isValid(String s) {
    
    boolean is_valid = true;

    List<Character> openP = new ArrayList();

    String s0 = "([{";

    for(int i=0; i < s.length(); i++){
        char ch = s.charAt(i);
        if (ch == s0.charAt(0) || ch == s0.charAt(1) || ch == s0.charAt(2)){
            if(i== (s.length()-1)){
                return false;
            }
            openP.add(ch);
        }
        if (openP.size() > 0){
            switch(ch){

                case ')':
                    is_valid = openP.get(openP.size() - 1) == s0.charAt(0);
                    openP.remove(openP.size() - 1);
                    break;
                case ']':
                    is_valid = openP.get(openP.size() - 1) == s0.charAt(1);
                    openP.remove(openP.size() - 1);
                    break;
                case '}':
                    is_valid = openP.get(openP.size() - 1) == s0.charAt(2);
                    openP.remove(openP.size() - 1);
                    break;
            } 
        } else if (ch == ')'|| ch == ']'|| ch == '}') {
                return false;
            }
        if (is_valid == false) return false;
    }
        return openP.isEmpty();
    }
}
