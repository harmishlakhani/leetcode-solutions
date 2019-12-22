package com.techmisal.easy;


/*

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.


Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true

 */

import java.util.Stack;

public class Parentheses {



    public boolean getValidParanthenses(String str){

        Stack<String> stack = new Stack<>();


        int pushCount = 0, popCount=0;

        if(str.isEmpty()){
            return true;
        }


        for(int i=0;i<str.length();i++) {

            if(str.charAt(i)=='('){
                stack.push(")");
                pushCount++;
            }else if(str.charAt(i) == '['){
                stack.push("]");
                pushCount++;
            }else if(str.charAt(i) == '{'){
                stack.push("}");
                pushCount++;
            }


            if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i)==']'){
                if(!stack.empty()){
                    if(!stack.pop().equals(""+str.charAt(i))){
                        return false;
                    }

                    popCount++;

                }else{
                    return false;
                }
            }


        }


        if(!stack.empty()){
            return false;
        }


        if(pushCount== 0 && popCount == 0){
            return false;
        }

        return true;

    }


}
