package com.example.reidsspringboot.gof23.test;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * The triangle is the most balanced
 */
//题目：要求：
//数值大于等于1024即向更大的单位转换
//数值小于1即向更小的单位转换
//最小支持Byte，最大支持到TB，超出范围则保持当前单位，不考虑 1/2条件。
//输入数值+单位，输出转换后的数值+单位，如输入： 10240KB，输出10MB（忽略单位字母大小写）
//小数位超过两位，四舍五入保留两位小数
//注意异常处理，如输入错误
//测试用例（请在程序输出一下数据转换后的结果）：
//2048MB：2G
//29340578605Byte：27.33GB
//0.009MB：9.22KB
//4096000GB：4000TB
//3000：输入不正确（或其他类似提示

//空字符 在asc表中最小；
//trim只能左右的空格，中间的空格是无法去除的
//使用replace(" ","")
//replace 的参数是 char 和 CharSequence，即可以支持字符的替换，也支持字符串的替换(CharSequence 即字符串序列的意思，说白了也就是字符串)；
//replaceAll 的参数是 regex，即基于正则表达式的替换。比如，可以通过 replaceAll ("\d", “*”) 把一个字符串所有的数字字符都换成星号；
//String 类执行了替换操作后，返回一个新的对象，源字符串的内容是没有发生改变的。
public class Client {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //原数组
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            Random random = new Random();
            int rd = random.nextInt(a.length - i);
            b[i] = a[rd];
            if ((a.length - i) > 1) {
                int temp = a[rd];
                a[rd] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }

        }
        System.out.println(Arrays.toString(b));

//      while (true){
//          Scanner scanner = new Scanner(System.in);
//          String s=scanner.nextLine();
//          Conversion.handler(s);
//      }
    }
}

class Conversion {
    public static String handler(String input) {
        String conform = conform(input);
        String[] split;
        BigDecimal number;
        if (!conform.equals("")) {
            split = conform.split("\\|");
            number = new BigDecimal(split[0]);
            while (number.compareTo(new BigDecimal(1024)) >= 0) {
                BigDecimal divide = number.divide(new BigDecimal(1024));
                BigDecimal bigDecimal = divide.setScale(2, BigDecimal.ROUND_HALF_UP);
                String sp = carryOver(split[1]);
                if (!sp.equals(split[1])) {
                    number = bigDecimal;
                    split[1] = sp;
                } else {
                    break;
                }
            }
            while (number.compareTo(new BigDecimal(0)) > 0 && number.compareTo(new BigDecimal(1)) < 0) {
                BigDecimal divide = number.multiply(new BigDecimal(1024));
                BigDecimal bigDecimal = divide.setScale(2, BigDecimal.ROUND_HALF_UP);
                String sp = adbcate(split[1]);
                if (!sp.equals(split[1])) {
                    number = bigDecimal;
                    split[1] = sp;
                } else {
                    break;
                }
            }
            System.out.println(number.stripTrailingZeros().toPlainString() + split[1]);
            return number.stripTrailingZeros().toPlainString() + split[1];
        } else {
            return "";
        }
    }

    private static String conform(String input) {
        if (input.trim().split("\\s+").length > 2) {
            System.out.println("格式错误");
            return "";
        }
        String temp = input.replace(" ", "").toUpperCase();
        Matcher matcher = Pattern.compile("(^(\\d)+(KB|BYTE|MB|TB)$)|(^\\d+\\.\\d+KB|BYTE|MB|TB$)").matcher(temp);
        if (matcher.find()) {
            if (matcher.start() == 0 || matcher.end() == temp.length()) {
                Matcher matcher1 = Pattern.compile("KB|BYTE|MB|TB").matcher(temp);
                if (matcher1.find()) {
                    String sb1 = temp.substring(0, matcher1.start());
                    String sb2 = temp.substring(matcher1.start());
                    return sb1 + "|" + sb2;
                }
            }

        }
        System.out.println("格式错误");
        return "";
    }

    private static String carryOver(String input) {

        if (input.equals("BYTE")) {
            return "KB";
        }
        if (input.equals("KB")) {
            return "MB";
        }
        if (input.equals("MB")) {
            return "TB";
        }
        System.out.println("已经达到极限了");
        return input;
    }

    private static String adbcate(String input) {
        if (input.equals("KB")) {
            return "BYTE";
        }
        if (input.equals("MB")) {
            return "KB";
        }
        if (input.equals("TB")) {
            return "MB";
        }
        System.out.println("已经到极限了");
        return input;
    }

}