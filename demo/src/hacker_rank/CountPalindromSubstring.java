/*
package hacker_rank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPalindromSubstring {
    static Map bruteforce(int n, String s) {
        Map result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int len = 1; len <= n - i; len++) {
                String substr = s.substring(i, i + len);

                if (substr.length() == 1) {
                    if (!result.containsKey(substr)) {
                        result.put(substr, 0l);
                    }
                    result.put(substr, result.get(substr) + 1);
                } else if (substr.length() > 0 && substr.length() % 2 == 0) {
                    boolean allSame = true;
                    for (int j = 1; j < substr.length(); j++) {
                        if (substr.charAt(j) != substr.charAt(j - 1)) {
                            allSame = false;
                            break;
                        }
                        if (allSame) {
                            if (!result.containsKey(substr)) {
                                result.put(substr, 0l);
                            }
                            result.put(substr, result.get(substr) + 1);
                        }
                    }
                } else if (substr.length() > 0 && substr.length() % 2 == 1) {
                    int mid = substr.length() / 2;
                    String left = substr.substring(0, mid);
                    String right = substr.substring(mid + 1);
                    if (left.equals(right)) {
                        if (!result.containsKey(substr)) {
                            result.put(substr, 0l);
                        }
                        result.put(substr, result.get(substr) + 1);
                    }
                }
            }
        }

        return result;
    }

    static long substrCount(int n, String s) {
        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans++;
            char previousChar = s.charAt(i);
            int charsLeftCount = 1;
            int charsRightCount = 0;
            boolean reachedMiddle = false;

            for (int j = i + 1; j < n; j++) {
                char ch = s.charAt(j);
                if (!reachedMiddle && ch != previousChar) {
                    reachedMiddle = true;
                } else if (reachedMiddle && (ch != previousChar || j == n - 1)) {
                    if (j == n - 1 && ch == previousChar) {
                        charsRightCount++;
                    }

                    if (charsLeftCount == charsRightCount) {
                        ans++;
                    }

                    break;
                } else if (!reachedMiddle && ch == previousChar) {
                    charsLeftCount++;
                    if (charsLeftCount >= 2) {
                        ans++;
                    }
                } else if (reachedMiddle && ch == previousChar) {
                    charsRightCount++;
                    if (charsLeftCount == charsRightCount) {
                        ans++;
                        break;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(System.getProperty("user.home") + "/" + "in3.txt"));

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        long startTime = System.currentTimeMillis();
        long result = substrCount(n, s);
        long endTime = System.currentTimeMillis();

        System.out.println("Took " + (endTime - startTime) + " ms");

        Scanner expectedScanner = new Scanner(new FileInputStream(System.getProperty("user.home") + "/" + "expected3.txt"));
        long expected = expectedScanner.nextLong();
        if (result != expected) {
            System.out.println("Error: expected " + expected + " got " + result);
        } else {
            System.out.println("Correct: expected " + expected + " got " + result);
        }
    }
}
*/
