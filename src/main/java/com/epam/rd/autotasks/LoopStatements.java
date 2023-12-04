package com.epam.rd.autotasks;


class LoopStatements {
    public static int sumOddDigits(int n) {
        int x, num, result;
        num = n;
        result = 0;
        if (n<=0){
            return 0; //Value returned should the integer provided be equal or less than 0
        }
        else{
            while (num>0) {
                x = num % 10;
                num = num / 10;
                if (x%2!=0){
                    result=result+x;
                }
            }
        }
        return result;
    }




}
