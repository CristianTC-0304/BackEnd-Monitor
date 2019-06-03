package com.ppi.monitor.util;

/**
 *
 * @author paulaj
 */
public class StringUtil {

    public static boolean isNullOrEmpty(String dato) {
        return dato == null || dato.isEmpty();
    }

    public static boolean isNullOrEmpty(Integer integer) {
        return integer == null || integer == 0;
    }

}
