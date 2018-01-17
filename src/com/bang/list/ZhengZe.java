package com.bang.list;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式学习
 * Created by bang on 18-1-17.
 */
public class ZhengZe {



    public static void main(String[] args) {
        Boolean result;
        //String phone = "18244294525";
        //result = regEx_Phone(phone);
        //String email = "41328784sg@qq.com.cn";
        //result = regEx_Email(email);
        String idCard = "632126199206204113";
        result = regEx_IdCard(idCard);
        System.out.println("测试结果："+result);
    }

    //校验手机号
    private static boolean regEx_Phone(String value){
        //校验手机号
        String regEx = "^(13[0-9]|18[0-9]17[0-9]|18[0-9])\\d{8}";

        Pattern pattern = Pattern.compile(regEx);

        Matcher matcher = pattern.matcher(value);
        boolean rs = matcher.matches();

        return rs;
    }

    //校验邮箱
    private static boolean regEx_Email(String value){
        //校验手机号
        String regEx = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";

        Pattern pattern = Pattern.compile(regEx);

        Matcher matcher = pattern.matcher(value);
        boolean rs = matcher.matches();

        return rs;
    }

    //校验身份证
    private static boolean regEx_IdCard(String value){
        //校验632126 1992 0620 4113
        String regEx = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";

        Pattern pattern = Pattern.compile(regEx);

        Matcher matcher = pattern.matcher(value);
        boolean rs = matcher.matches();

        return rs;
    }
}
