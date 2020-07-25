package com.jiang.utils.utils;

import java.sql.Timestamp;

public class DateUtils {

    private Timestamp dateStr2Timestamp(){
        
        return new Timestamp(System.currentTimeMillis());
    }

}
