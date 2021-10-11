package com.assignment3;

import java.net.InetAddress;

public class Main {

    public static void main(String args[]){
        try {
            String  address = InetAddress.getByName("www.google.com").getHostAddress();
            InetAddress inet = InetAddress.getByName(address);

            long end;
            long[] time=new long[10];
            for(int i=0;i<10;i++) {
                long start = System.currentTimeMillis();
                if (inet.isReachable(5000)) {
                    end = System.currentTimeMillis();
                    time[i]=end - start;
                } else {
                    System.out.println("Host is not reachable");
                }
            }
         System.out.println(calculateMedian(time));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static long calculateMedian(long[] time){
        int n=time.length;
        if(n%2==0) return time[n/2-1];
        else return (time[n/2]+time[n/2-2])/2;

    }

}
