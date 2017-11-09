package com.p2p.until;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/10/18.
 */
public class SecurityUtil {

    public static  String addSecurity(String str){
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<bytes.length;i++){
                int a = bytes[i] & 0Xff;
                //加盐
                //在MD5的基础上加入自己的一些算法，防止解密
                a=a+1;
                if(a<16){
                    sb.append(0);
                }
                sb.append(Integer.toHexString(a));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
