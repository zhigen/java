package com.zglu.java.base.lang;

import lombok.extern.log4j.Log4j2;

/**
 * 测试整数相关
 *
 * @author zglu
 */
@Log4j2
public class IntegerTest {

    public static void main(String[] args) {
        init();
        toRadixString();
        complement();
        bitwise();
    }

    /**
     * 初始化整数
     */
    private static void init() {
        log.info("使用不同进制的“{}”为整数属性赋值", 1000);
        Integer i = 0b1000;
        log.info("2进制{}", i);
        // i = 01000; // 不推荐使用
        i = Integer.valueOf("1000", 8);
        log.info("8进制{}", i);
        i = 1000;
        log.info("10进制{}", i);
        i = 0x1000;
        log.info("16进制{}", i);
    }

    /**
     * 整数转换成对应进制表示
     */
    private static void toRadixString() {
        int i = 100;
        log.info("{}使用以下进制表示", i);
        String s = Integer.toBinaryString(i);
        log.info("2进制表示{}", s);
        s = Integer.toOctalString(i);
        log.info("8进制表示{}", s);
        s = Integer.toUnsignedString(i);
        log.info("10进制表示{}", s);
        s = Integer.toHexString(i);
        log.info("16进制表示{}", s);
    }

    /**
     * 补码运算
     */
    private static void complement() {
        //8位无符号数，00000000~11111111表示0~255，8位有符号数00000000~01111111表示0~127，10000000~11111111表示-128~-1，0到最大正值到最大负值到最小负值，有符号表示负数的码称为补码
        //补码的规则，也就是正数转成负数的规则：与正数相加后刚好溢出的数，称为这个正数的补数，加上这个补数就等于减去这个正数，补数的生成方法是这个正数的反码+1，因为这个正数的反码与这个正数相加等于11111111，还差1溢出
        //下面是2
        int a = 0b00000000000000000000000000000010;
        //这是5
        int b = 0b00000000000000000000000000000101;
        //这是-5
        int c = ~b + 1;
        //2-5等于-3
        log.info(a + c);
        //不用二进制表示，亦如此
        int a1 = 2;
        int b1 = 5;
        log.info(a1 + ~b1 + 1);
        log.info("查看-5的补码：" + Integer.toBinaryString(-5));
    }

    /**
     * 按位运算
     */
    private static void bitwise() {
        int a = 0b10101010;
        int b = 0b01010101;
        //&按位与
        log.info(Integer.toBinaryString(a & b));
        //|按位或
        log.info(Integer.toBinaryString(a | b));
        //^按位异或
        log.info(Integer.toBinaryString(a ^ b));
        //~取反
        log.info(Integer.toBinaryString(~a));
        //<<左移
        log.info(Integer.toBinaryString(a << 1));
        //>>右移
        log.info(Integer.toBinaryString(a >> 1));
        //>>>无符号右移
        log.info(Integer.toBinaryString(a >>> 1));
    }
}
