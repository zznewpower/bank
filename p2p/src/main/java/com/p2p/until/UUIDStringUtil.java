package com.p2p.until;

import java.util.UUID;

/**
 * Created by Administrator on 2017/10/24.
 */
public class UUIDStringUtil {

    public static String getUUID(String str){
        String s = UUID.randomUUID().toString();
        String s1 = s.replaceAll("-", "");
        return s1+str;
    }
}
