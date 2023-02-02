import java.util.HashSet;

public class Test {
        public String decodeMessage(String key, String message) {
            char[] chs = new char[128];
            chs[' '] = ' ';
            for(int i = 0, j=0; i<key.length(); i++){
                char c = key.charAt(i);
                if(chs[c]==0){
                    chs[c]=(char) ('a' + j++);
                }
            }
            char[] ans = message.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char an : ans) {
                sb.append(chs[an]);
            }
            return sb.toString();
        }
}
