class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int d = (int)Math.pow(10,4);
        long v = (int)Math.pow(10,9);
        long volume = (long)length*width*height;
        if((length>=d || width>=d || height>=d || volume>=v) && mass>=100){
            return "Both";
        }
        if(length>=d || width>=d || height>=d || volume>=v){
        return "Bulky";
        }
        if(mass>=100){
            return "Heavy";
        }
        return "Neither";
    }
}