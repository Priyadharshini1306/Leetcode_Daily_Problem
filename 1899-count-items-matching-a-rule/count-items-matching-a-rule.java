class Solution {
    public int countMatches(List<List<String>> items, String key, String Value) {
        int col = -1;
        if(key.equals("type")) {
            col = 0;
        } else if(key.equals("color")) {
            col = 1;
        } else {
            col = 2;
        }
        int count = 0;
        for(List<String> li : items) {
            if(li.get(col).equals(Value)) {
                count++;
            }
        }
        return count;
    }
}