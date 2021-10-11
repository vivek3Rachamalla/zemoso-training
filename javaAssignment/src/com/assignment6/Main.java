package com.assignment6;

public class Main {
    public static boolean bool=false;
    public static void main(String args[]){
        vampireNumbers(5);
    }
    public static void vampireNumbers(int n){
        int number=10;
        while(n>0){
            if(Integer.toString(number).length()%2==0 && isVampireNumber(number)){
                System.out.println(number);
                n--;
            }
            number++;
        }
    }
    public static boolean isVampireNumber(int n){
        String s=Integer.toString(n);
        boolean[] notExist=new boolean[s.length()];
        bool=false;
        return genrateFactores(s,notExist,n,s.length(),"");
    }
    public static boolean genrateFactores(String s,boolean[] notExists,int n,int length,String rs){
        if(bool) return bool;
        else if(rs.length()==length)
            if(n==Integer.parseInt(rs.substring(0,length/2))*Integer.parseInt(rs.substring(length/2,length))
                    && rs.charAt(0)!='0' && rs.charAt(length/2)!='0' && (rs.charAt(length/2-1)!='0' || rs.charAt(length-1)!='0'))
                bool=true;

        else for(int i=0;i<length;i++){
            if(!notExists[i]){
                notExists[i]=true;
                if(genrateFactores(s,notExists,n,length,rs+s.charAt(i))) break;
                else notExists[i]=false;
            }
        }

        return bool;
    }
}
