package com.bridgelabz.oopslinecamparison;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class UC_4_OopsLineComparison {
        public static double getLengthOfLine1(double x1, double x2, double y1, double y2){
                    double length1 =  sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
                    return length1;
        }
        public static double getLengthOfLine2(double x3, double x4, double y3, double y4){
                    double length2 = sqrt(((x4-x3)*(x4-x3))+((y4-y3)*(y4-y3)));
                        return length2;
        }
    public static void main(String[] args) {
            double line1 = getLengthOfLine1(3.1,2.1,1.1,5.1);
            double line2 = getLengthOfLine2(3.1,2.1,1.1,5.1);
            if(Objects.equals(line1, line2)){
                System.out.println("Lines Are Equal");
            }else {
                System.out.println("Lines Are not Equal");
            }
        }
}
