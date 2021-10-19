package org.nari.util;


import org.springframework.util.DigestUtils;

public class MD5 {
    public static String getMD5(String s){
        return DigestUtils.md5DigestAsHex(s.getBytes());
    }
}
