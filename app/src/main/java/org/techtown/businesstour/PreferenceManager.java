package org.techtown.businesstour;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
    public static final String PREFERENCES_NAME = "preference";
    public static final String QNUM = "Qnum";
    public static final String WHERE = "where";

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public static void setString(Context context, String key, String value) {
        SharedPreferences pref = getPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void setInt(Context context, String key, int value) {
        SharedPreferences pref = getPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static String getString(Context context, String key) {
        SharedPreferences pref = getPreferences(context);
        String value = pref.getString(key, "");
        return value;
    }

    public static int getInt(Context context, String key) {
        SharedPreferences pref = getPreferences(context);
        int value = pref.getInt(key, 0);
        return value;
    }
}
