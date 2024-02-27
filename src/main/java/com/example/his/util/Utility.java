package com.example.his.util;

import java.util.UUID;

public class Utility {

    public static String getUniqueUUID(){
        String str = UUID.randomUUID().toString();
        str = str.replace("-","").substring(0,16);

        return str+System.currentTimeMillis();
    }
}
