package Chargebee;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

        // duplicate String in string with occurance
        public static void main(String[] args) {
            String  str = "My name is John, My full name is John Das, I am QA in IT firm, I belong to IT technology industry";

            String[] words = str.toLowerCase().trim().split(" ");
            Map<String, Integer> duplicateString = new HashMap<>();
            int count = 1;
            for (String x : words) {
                if (duplicateString.containsKey(x)) {
                    duplicateString.put(x, duplicateString.get(x) + 1);
                } else {
                    duplicateString.put(x, count);
                }
            }
            System.out.println("Duplicate Words in a String : ");
            for (Map.Entry a : duplicateString.entrySet()) {
                int val = (Integer) a.getValue();
                if (val > 1) {
                    System.out.println(a);
                }
            }

        }

}
