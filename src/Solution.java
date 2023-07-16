import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> numbers = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                StringBuilder sb = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;
                }
                numbers.add(Integer.parseInt(sb.toString()));
            } else {
                i++;
            }
        }

        for (int j = 0; j < numbers.size() - 1; j++) {
            if (numbers.get(j) >= numbers.get(j + 1)) {
                return false;
            }
        }

        return true;
    }
}

