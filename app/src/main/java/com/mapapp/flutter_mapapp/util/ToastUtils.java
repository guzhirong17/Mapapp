package com.mapapp.flutter_mapapp.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    /**
     * @param context The Class's context , where want to use this tool
     * @param message The message will be show
     */
    public static void showMessage(Context context, String message) {
        showMessage(context, message, false);

    }

    public static void showMessage(Context context, String message,
                                   boolean lengthLong) {
        if (lengthLong)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
