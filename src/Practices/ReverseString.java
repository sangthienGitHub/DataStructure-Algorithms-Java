package Practices;

import java.lang.*;

public class ReverseString {
    public static void main(String[] args)
    {
        String input = "Hello!";
        char[] inputArr = input.toCharArray();
        for(int i = inputArr.length - 1; i >= 0; i--){
            System.out.print(inputArr[i]);
        }
    }
}
