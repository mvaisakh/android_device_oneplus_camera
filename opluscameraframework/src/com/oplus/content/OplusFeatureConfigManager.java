//
// Copyright (C) 2023 StatiXOS
// SPDX-License-Identifier: Apache-2.0
//

package com.oplus.content;

import android.os.RemoteException;

public class OplusFeatureConfigManager {
    private static OplusFeatureConfigManager sInstance = null;

    public static OplusFeatureConfigManager getInstance() {
        if (sInstance == null) {
            sInstance = new OplusFeatureConfigManager();
        }
        return sInstance;
    }

    boolean hasFeature(String string) throws RemoteException {
        return false;
    }
}
