package io.zipcoder;

public class Problem3 {

    public static void main(String[] args) {
        System.out.println(wuTang());
    }

    public static String wuTang() {
        String output = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                output += "WuTang";
            } else if (i % 5 == 0){
                output += "Tang";
            } else if (i % 3 == 0){
                output += "Wu";
            } else {
                output += i + "";
            }

            if (i < 50){
                output += ", ";
            }
        }
        return output;
    }
}
