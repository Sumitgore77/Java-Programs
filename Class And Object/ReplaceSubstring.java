/*38. Replace Substring in String
Description: Replace a part of a string with another substring.

Input: "hello world", old substring "world", new substring "java"

Output: "hello java"

*/

public class ReplaceSubstring {
    public static void main(String[] args) {

        String str = "hello world", oldSub = "world", newSub = "java";
        String result = "";
        int index = str.indexOf(oldSub);

        if (index != -1) {
            result = str.substring(0, index) + newSub + str.substring(index + oldSub.length());
        } else {
            result = str; 
        }

        System.out.println("Output: " + result);
    }
}
