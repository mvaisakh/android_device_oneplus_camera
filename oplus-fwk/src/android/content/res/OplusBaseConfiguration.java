package android.content.res;

import oplus.content.res.OplusExtraConfiguration;

public abstract class OplusBaseConfiguration {
    public OplusExtraConfiguration mOplusExtraConfiguration = new OplusExtraConfiguration();

    public OplusExtraConfiguration getOplusExtraConfiguration() {
        return this.mOplusExtraConfiguration;
    }
}
