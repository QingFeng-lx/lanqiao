package com.lx.lanqiao.circle_s;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        if (r <= 0) {
            System.out.println(0);
        } else {
            BigDecimal s = new BigDecimal(Math.PI * r * r);
            System.out.println(s.setScale(7, BigDecimal.ROUND_HALF_UP));
        }
    }
}
