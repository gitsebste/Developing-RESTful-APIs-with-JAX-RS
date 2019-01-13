/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.messenger.util;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author device02
 */
public class DateUtil {

    public static Date getDate(int y, int m, int d) {
        Date ret=null;
        
        Calendar c = Calendar.getInstance();
        c.set(y, m, d);
        ret = c.getTime();
        
        return ret;
    }
    
    
}
