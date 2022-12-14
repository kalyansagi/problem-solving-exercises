/*
Given a string of lowercase English letters s
your task is to rearrange its letters by pairing them together according to the following rule:
first letter with the last one, second letter with the second-to-last one, etc. More formally, if s = C1C2C3... Cn-2Ch-1Cn (where Ci is the ith letter of s),
then the letters should be arranged into C1CnC2Cn-1....
If s contains an odd number of letters, the middle letter should not be paired with any other letters, but placed at the end of the output string instead.
Example
For s = "abcdef", the output should be
solution (s) = "afbecd"
For s = "abcde", the output should be
solution (s) = "aebdc"
Since s has an odd number of letters, the middle letter 'c' is placed at the end.
*/
public class ReArrangingWords {

    public static void rearrangingWords() {
        StringBuilder str = new StringBuilder();
        String a = "abedef";

        if (a.length() % 2 == 0) {
            for (int i = 0; i < a.length() / 2; i++) {
                str = str.append(a.charAt(i));
                str = str.append(a.charAt(a.length() - 1 - i));
            }
        } else {
            for (int i = 0; i < a.length() / 2 + 1; i++) {
                char c = a.charAt(a.length() - 1 - i);
                if (a.charAt(i) == c) {
                    str = str.append(a.charAt(i));
                    break;
                }
                str = str.append(a.charAt(i));
                str = str.append(c);
            }
        }
        System.out.println(str);
    }
}
