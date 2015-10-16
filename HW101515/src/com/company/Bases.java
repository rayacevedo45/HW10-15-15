
package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Access Code 2.1
 * Ray Acevedo
 * Bases.java
 */
public class Bases
{
    public static void main(String[] args)
    {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        //majorityElement(array);
        validOrNah("(){}");


    }

    public static void decimalToBinary(int decimal)
    {
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
    }

    public static void hexToDecimal(String hex)
    {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
    }

    public static void isPalindrome(int decimal)
    {
        String string = Integer.toBinaryString(decimal);
        System.out.println(string.equals(new StringBuilder(string).reverse().toString()));
    }

    public static long factorial0(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        else return n * factorial0(n - 1);
    }

    public static void factorial(int n)
    {
        if(n <= 1)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(n * factorial0(n - 1));
        }
    }

    public static void majorityElement(int[] num)
    {
        Arrays.sort(num);
        int majorityInt = num[num.length / 2];
        int majorityIntCount = 0;
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] == majorityInt)
            {
                majorityIntCount++;
            }
        }
        if(majorityIntCount > num.length / 2)
        {
            System.out.println(num[num.length / 2]);
        }
        else
        {
            System.out.println("No majority element.");
        }
    }

    public static void validOrNah(String string)
    {
        int op = 0;
        int cp = 0;
        int oc = 0;
        int cc = 0;
        int os = 0;
        int cs = 0;
        for(int i = 0; i < string.length(); i++)
        {
            String c = String.valueOf(string.charAt(i));
            if(c.equals(op))
            {
                op++;
            }
            else if(c.equals(cp))
            {
                cp++;
            }
            else if(c.equals(oc))
            {
                oc++;
            }
            else if(c.equals(cc))
            {
                cc++;
            }
            else if(c.equals(os))
            {
                os++;
            }
            else {
                cs++;
            }
        }
        if(op != cp || oc != cc || os != cs)
        {
            System.out.println("nah");
        }
        else
        {
            System.out.println("yeah");
        }
    }
}