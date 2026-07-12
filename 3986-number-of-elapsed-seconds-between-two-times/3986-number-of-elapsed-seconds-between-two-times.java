class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] ch = startTime.split(":");
        String[] ch1 = endTime.split(":");
        int st=0;
        int et=0;
        st=Integer.parseInt(ch[0])*3600+Integer.parseInt(ch[1])*60+Integer.parseInt(ch[2]);
        et=Integer.parseInt(ch1[0])*3600+Integer.parseInt(ch1[1])*60+Integer.parseInt(ch1[2]);
        return et-st;
    }
}