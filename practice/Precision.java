package practice;

import java.text.DecimalFormat;

public class Precision {
    public static void main(String[] args)
    {
        double num = 342.3452846283443423245;
        System.out.println(num);
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(num));
        System.out.println(String.format("%.5f", num));

        float f1 = 1.23432345f;
        float f2 = 13253.43254365f;

        System.out.println(f1);
        System.out.println(f2);
    }
}
