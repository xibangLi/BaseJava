package com.bang.list;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式学习
 * Created by bang on 18-1-17.
 */
public class ZhengZe {


    //密码的强度必须是包含大小写字母和数字的组合，不能使用特殊字符，长度在8-10之间
    private static String regEx_passwordStonger = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}&";

    //字符串仅能是中文
    private static String regEx_chinese = "[\\u4e00-\\u9fa5]{0,}$";

    //校验日期 “yyyy-mm-dd“ 格式的日期校验，已考虑平闰年。
    private static String regEx_date = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";

    //校验IE版本
    private static String regEx_ie = "^.*MSIE [5-8](?:\\\\.[0-9]+)?(?!.*Trident\\\\/[5-9]\\\\.0).*$";

    //提取网页图片
    private static String regEx_image = "\\< *[img][^\\\\>]*[src] *= *[\\\"\\']{0,1}([^\\\"\\'\\ >]*)";

    //校验手机号
    private static String regEx_phone = "^(13[0-9]|18[0-9]17[0-9]|18[0-9])\\d{8}";

    //校验邮箱
    private static String regEx_email = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";

    //校验身份证:校验632126 1992 0620 4113
    private static String regEx_idCard = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";

    //校验金额
    private static String regEx_money = "^[0-9]+(.[0-9]{2})?$";


    /**
     * 正则表达式验证
     * @param regEx
     * @param value
     * @return
     */
    private static boolean regEx(String regEx,String value){

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(value);
        boolean rs = matcher.matches();

        return  rs;
    }


    public static void main(String[] args) {
        Boolean result;
        //String phone = "18244294525";
        //result = regEx_Phone(phone);
        //String email = "41328784sg@qq.com.cn";
        //result = regEx_Email(email);
        //String idCard = "632126199206204113";
        //result = regEx_IdCard(idCard);

        String money = "123.32";
        result = regEx(regEx_money, money);
        System.out.println("测试结果："+result);
    }
}
