/*37. Remove All Spaces from a String
Description: Remove all spaces from a string.


Input: "hello world"


Output: "helloworld"

*/

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("Output: " + result);
    }
}
