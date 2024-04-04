public class Ques {
    public static void main(String[] args) {
        String s = "aaabbcccc";
        System.out.println(freqString(s));
    }
    static String freqString(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        char ch = s.charAt(0);
        int count = 1;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length() ; i++){
                char c = s.charAt(i);
               if(c == ch){
                 count++;
               }else{
                sb.append(ch);
                sb.append(count);
                ch = c;
                count = 1;
               }
            }
            sb.append(ch);
            sb.append(count);
        return sb.toString();
    }
}
