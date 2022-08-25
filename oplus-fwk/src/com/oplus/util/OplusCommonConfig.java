package com.oplus.util;

import android.os.Bundle;

public class OplusCommonConfig {
    private static volatile OplusCommonConfig sConfig = null;

    public static OplusCommonConfig getInstance() {
        if (sConfig == null) {
            synchronized (OplusCommonConfig.class) {
                if (sConfig == null) {
                    sConfig = new OplusCommonConfig();
                }
            }
        }
        return sConfig;
    }

    public boolean putConfigInfo(String configName, Bundle bundle, int flag) {
        return false;
    }

    public Bundle getConfigInfo(String configName, int flag) {
        return null;
    }

    public Bundle getConfigInfoAsUser(String configName, int flag, int userId) {
        return null;
    }
}
