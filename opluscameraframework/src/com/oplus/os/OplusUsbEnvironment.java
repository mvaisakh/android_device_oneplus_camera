//
// Copyright (C) 2023 StatiXOS
// SPDX-License-Identifier: Apache-2.0
//

package com.oplus.os;

import android.content.Context;
import android.os.Environment;
import android.os.storage.StorageManager;
import java.io.File;

public class OplusUsbEnvironment extends Environment {
    private static final String DEFAULT_INTERNAL_PATH = "/storage/emulated/0";

    public static File getInternalSdDirectory(Context context) {
        return new File(DEFAULT_INTERNAL_PATH);
    }

    public static File getExternalSdDirectory(Context context) {
        return null;
    }

    public static String getInternalSdState(Context context) {
        StorageManager sm;
 
        if ((sm = (StorageManager) context.getSystemService("storage")) != null) {
            return sm.getVolumeState(DEFAULT_INTERNAL_PATH);
        }

        return "unknown";
    }

    public static String getExternalSdState(Context context) {
        return "unknown";
    }
}
