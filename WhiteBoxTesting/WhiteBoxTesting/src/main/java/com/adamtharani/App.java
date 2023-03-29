package com.adamtharani;

/**
 * Hello world!
 *
 */
public class App 
{

    public static int characterOccurence(char [] array, char character) {
        int count = 0;
        for (char c : array) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }
}
