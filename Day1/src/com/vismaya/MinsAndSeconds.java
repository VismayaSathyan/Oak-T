package com.vismaya;

public class MinsAndSeconds {
    public static void main(String[] args) {
        System.out.println(getDurationString(156, 54));
        System.out.println(getDurationString(9029));
    }
    static String getDurationString(long mins, long secs){
        if((mins<0) || (secs<0) || (secs>59)){
            return "Invalid value";
        }
        long hours = mins/60;
        long minutes = mins % 60;
        //long seconds = secs/60;
        System.out.print(mins+"m " + secs+"s = ");
        return hours+"h " +minutes+ "m "+secs+"s";
    }
    static String getDurationString(long secs){
        if(secs<0){
            return "Invalid Value";
        }
        long min = secs/60;
        long remSecs = secs % 60;
        System.out.println(secs+"s = " +min+"m " +remSecs+ "s");
        return getDurationString(min, remSecs);

    }
}
