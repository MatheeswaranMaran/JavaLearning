public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        if (areAnagrams(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] chcount = new int[128]; // Assuming ASCII character set
        
        for (int i = 0; i < str1.length(); i++) {
            chcount[str1.charAt(i)]++;
            chcount[str2.charAt(i)]--;
        }
        
        for (int count : chcount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}
