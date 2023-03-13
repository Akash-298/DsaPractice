class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mapping = new HashMap<Character, Integer>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && mapping.get(s.charAt(i)) > mapping.get(s.charAt(i - 1))) {
                result += mapping.get(s.charAt(i)) - 2 * mapping.get(s.charAt(i - 1));
            } else {
                result += mapping.get(s.charAt(i));
            }
        }
        return result;
    }
}
