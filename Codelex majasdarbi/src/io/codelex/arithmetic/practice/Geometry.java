package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        return pi.multiply(radius).multiply(radius);
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal height) {
        BigDecimal baseHeight = height.multiply(base);
        return baseHeight.divide(BigDecimal.valueOf(2));
    }
}
