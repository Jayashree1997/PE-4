package com.stackroute.pe4;

public class StringTranspose {
    public String transpose(String  s){
        char[] ch=s.toCharArray();
        String out="";
        for(int i=0;i<ch.length;i++)
        {
            String res="";
            while(i < ch.length)
            {
                res=ch[i]+res;
                i++;
            }out=res+out;
        }return out;
    }
}
