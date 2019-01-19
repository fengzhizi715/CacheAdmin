package cn.netdiscovery.cache.common;

/**
 * Created by tony on 2019-01-17.
 */
public class BooleanUtils {

    public static boolean toBoolean(final Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean toBoolean(final String str) {

        if (str.equals("true")||str.equals("TRUE")) {
            return Boolean.TRUE;
        }

        return false;
    }
}
