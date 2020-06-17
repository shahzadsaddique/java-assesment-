package com.assessment.service;

import org.springframework.cache.annotation.Cacheable;

import java.util.ArrayList;

public class StringService
{
    ArrayList<String> permutation = new ArrayList<>();
    public String swap(String str, int i, int j){
        char ch;
        char[] array = str.toCharArray();
        ch = array[i];
        array[i] = array[j];
        array[j] = ch;
        return String.valueOf(array);
    }
    // Function to print all the permutations of the string

    @Cacheable(value = "shuffleString", key = "#string")
    public boolean isShuffled(String A, String B, String C)
    {
        int i = 0, j = 0, k = 0;
        while (k != C.length())
        {
            if (i<A.length()&&A.charAt(i) == C.charAt(k))
                i++;
            else if (j<B.length()&&B.charAt(j) == C.charAt(k))
                j++;
            else
                return false;
            k++;
        }

        if (i < A.length() || j < B.length())
            return false;

        return true;
    }


    public void permute(String str,int low,int high){
        if(low == high)
        {
            System.out.println(str);
            permutation.add(str);
        }
        int i;
        for(i = low; i<=high; i++){
            str = swap(str,low,i);
            permute(str, low+1,high);
            str = swap(str,low,i);
        }
    }

    @Cacheable(value = "permutations", key = "#perms")
    public ArrayList<String> getPermutation(String str)
    {

        // If string is empty
        if (str.length() == 0) {

            // Return an empty arraylist
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }

        // Take first character of str
        char ch = str.charAt(0);

        // Take sub-string starting from the
        // second character
        String subStr = str.substring(1);

        // Recurvise call
        ArrayList<String> prevResult = getPermutation(subStr);

        // Store the generated permutations
        // into the resultant arraylist
        ArrayList<String> Res = new ArrayList<>();

        for (String val : prevResult) {
            for (int i = 0; i <= val.length(); i++) {
                Res.add(val.substring(0, i) + ch + val.substring(i));
            }
        }

        // Return the resultant arraylist
        return Res;
    }
    public static boolean isAlpha(String s) {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }

    @Cacheable("reverse_string")
    //@CacheEvict(value="reverse_string")
    //@CachePut(value="reverse_string")
    public String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
