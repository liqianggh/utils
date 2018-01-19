package com.OnlineShop.util;

import java.math.BigDecimal;

/**
 * 用来计算浮点型数据，防止丢失精度
 * Created by Jann Lee on 2017/01/13 .
 */
public class BigDecimalUtil {

    private BigDecimalUtil() {

    }

    public static BigDecimal add(double num1, double num2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(num1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(num2));
        return bigDecimal1.add(bigDecimal2);
    }


    public static BigDecimal sub(double num1, double num2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(num1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(num2));
        return bigDecimal1.subtract(bigDecimal2);
    }

    public static BigDecimal mul(double num1, double num2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(num1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(num2));
        return bigDecimal1.multiply(bigDecimal2);
    }

    public static BigDecimal div(double num1, double num2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(num1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(num2));
        //除不尽的要进行一定的舍去策略
        //四舍五入  保留两位小数
        return bigDecimal1.divide(bigDecimal2,2,BigDecimal.ROUND_HALF_UP);

    }
}
