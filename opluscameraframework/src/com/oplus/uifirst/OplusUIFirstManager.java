package com.oplus.uifirst;

import com.oplus.uifirst.Utils;

public class OplusUIFirstManager extends Utils {
    private OplusUIFirstManager sInstance = null;
    private OplusUIFirstManager() {}

    public OplusUIFirstManager getInstance() {
        if (sInstance == null) {
            sInstance = new OplusUIFirstManager();
        }
        return sInstance;
    }

    public void setUxThreadValue(int pid, int tid, String value) {
    }
}
