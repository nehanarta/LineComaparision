package linecomparision;

public class LineComp {
    static boolean callEqualsMethod(String firstLine, String secondLine){
        System.out.println("equalMethod==>");
                return firstLine. equals(secondLine);
    }
    public static void main(String[] args){
        System.out.println("Line Comparison ");
        double x1=4, x2=8;
        double y1=6, y2=7;
        double x3=2, x4=6;
        double y3=3, y4=9;

        double firstLineValueX=Math.pow((x2-x1),2);
        double firstLineValueY=Math.pow((y2-y1),2);
        double lengthOfFirstLine=Math.sqrt(firstLineValueX + firstLineValueY);
        System.out.println("FirstLine==>"+lengthOfFirstLine);

        double secondLineValueX=Math.pow((x4-x3),2);
        double secondLineValueY=Math.pow((y4-y3),2);
        double lengthOfSecondLine=Math.sqrt(secondLineValueX + secondLineValueY);
        System.out.println("SecondLine==>"+ lengthOfSecondLine);

        String firstLine=String.valueOf(lengthOfFirstLine);
        String secondLine=String.valueOf(lengthOfSecondLine);
        boolean equalsResult = callEqualsMethod(firstLine , secondLine);
        if(equalsResult != true) {
            System.out.println("lines are not equal");
        }else{
            System.out.println("lines are equal");
        }
    }
}
