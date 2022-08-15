package com.oplus.app;

import android.os.UserHandle;

public class OPlusAccessControlManager {
    public static final int USER_CURRENT = UserHandle.myUserId();

    public boolean isEncryptPass(String packageName, int userId) {
        return true;
    }

    public boolean isEncryptedPackage(String packageName, int userId) {
        return true;
    }
}
