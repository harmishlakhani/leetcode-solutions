package com.techmisal.easy;

/*

    Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false


 */



public class JudgeCircle {


    public boolean judgeCircleMethod(String moves) {



        int X=0;
        int Y=0;


        for(int i=0;i<moves.length();i++){

           if(moves.charAt(i)=='U')
                X++;
            if(moves.charAt(i)=='D')
                X--;
            if(moves.charAt(i)=='L')
                Y--;
            if(moves.charAt(i)=='R')
                Y++;

        }

        if(X==0 && Y==0){
            return true;
        }


        return false;

    }


}
