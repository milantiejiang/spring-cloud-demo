package com.github.wxiaoqi.eureka;

public class TEST {
    public static void main(String[] args) {
        //#V0A0C0j%
         //#E000049%
        //#K00010<%
        System.out.println('K'+'0'+'0'+'0'+'1'+'0');

        System.out.println(intToHex(60));
        System.out.println('j'+0);
//        System.out.println('A'+0);
    }

    private static String intToHex(int n) {
        //StringBuffer s = new StringBuffer();
        StringBuilder sb = new StringBuilder(8);
        String a;
        char []b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n != 0){
            sb = sb.append(b[n%16]);
            n = n/16;
        }
        a = sb.reverse().toString();
        return a;
    }
}
