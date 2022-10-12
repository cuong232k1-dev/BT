package com.example.fpt.Execute1;

public class TestOfFPT {

    /*
        Execute 1 : Write a console program which is used to process a string and return the longest word in that string. Keep in
mind that if there are two or more words with the same length, return the first word from the string with that
length.
     */

    private static String findLongestWord(String input) {
        String word = "";
        String result = "";
        int lengthOfLongestWord = 0;
        int lengthOfWord = 0;

        for (char value : input.toCharArray()) {

            if(value != ' ' && value != '.' && value != '\n' && value != ','){
                word = word + value;
                lengthOfWord++;
                if (lengthOfWord > lengthOfLongestWord) {
                    lengthOfLongestWord = lengthOfWord;
                    result = word;

                }
            }
            else  {
                lengthOfWord = 0;
                word = "";
            }

        }
        return result;
    }


    private static void assertEquals(String output, String expectedOutput) {

        if (output.equals(expectedOutput)) {
            System.out.println("PASS TEST CASE");
        } else {
            System.out.println("NO PASS TEST CASE");
        }

    }


    public static void main(String[] args) {
        String testCase1 = "Java is interesting";
        String expected1 = "interesting";
        String output1 = findLongestWord(testCase1);
        String testCase2 = "I like Java";
        String expected2 = "like";
        String output2 = findLongestWord(testCase2);
        String testCase3 = "";
        String expected3 = "";
        String output3 = findLongestWord(testCase3);
        String testCase4 = "hello word aosima";
        String expected4 = "aosima";
        String output4 = findLongestWord(testCase4);
        String testCase5 = "Write a console program which is used to process a string, and return the longest word in that string.";
        String expected5 = "console";
        String output5 = findLongestWord(testCase5);


        assertEquals(output1,expected1);
        assertEquals(output2,expected2);
        assertEquals(output3,expected3);
        assertEquals(output4,expected4);
        assertEquals(output5,expected5);

    }
}
