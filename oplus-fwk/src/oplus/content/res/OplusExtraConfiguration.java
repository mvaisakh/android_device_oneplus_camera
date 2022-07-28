package oplus.content.res;

import android.os.Parcel;

public class OplusExtraConfiguration implements Comparable {
    public static final int ACESSIBLE_OPLUS_MODE_CHANGED = 67108864;
    public static final int CONFIG_FLIPFONT = 33554432;
    public static final int FONT_VARIATION_SETTINGS_CHANGED = 16777216;
    public static final long MAX_MATERIAL_HIGH = 1879048191;
    public static final int OPLUS_CONFIG_CHANGED = 268435456;
    public static final int OPLUS_CONFIG_FOLER_ANGLE = 65536;
    public static final int OPLUS_DARKMODE_RANK_CHANGED = 1;
    public static final int THEME_NEW_SKIN_CHANGED = 150994944;
    public static final int THEME_OLD_SKIN_CHANGED = 134217728;
    public static final int UX_ICON_CONFIG_CHANGED = 8388608;
    public int mAccessibleChanged;
    public int mFlipFont;
    public long mOplusChangedConfigs;
    public long mOplusConfigType;
    public int mThemeChanged;
    public long mThemeChangedFlags;
    public long mUxIconConfig;
    public int mUserId = -1;
    public int mFontUserId = -1;
    public long mMaterialColor = -1;
    public int mFontVariationSettings = -1;
    public String mIconPackName = "";
    public float mDarkModeDialogBgMaxL = -1.0f;
    public float mDarkModeBackgroundMaxL = -1.0f;
    public float mDarkModeForegroundMinL = -1.0f;
    public int mFontOpSansSettings = -1;
    public float mFoldingAngle = -1.0f;
    public String mThemePrefix = "";

    @Override
    public int compareTo(Object obj) {
        return compareTo((OplusExtraConfiguration) obj);
    }

    public int compareTo(OplusExtraConfiguration extraconfiguration) {
        int i = this.mThemeChanged - extraconfiguration.mThemeChanged;
        if (i != 0) {
            return i;
        }
        int i2 = this.mFlipFont - extraconfiguration.mFlipFont;
        if (i2 != 0) {
            return i2;
        }
        boolean same = this.mIconPackName.equals(extraconfiguration.mIconPackName);
        if (!same) {
            return -1;
        }
        int i3 = this.mUserId - extraconfiguration.mUserId;
        if (i3 != 0) {
            return i3;
        }
        int i4 = this.mFontUserId - extraconfiguration.mFontUserId;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.mAccessibleChanged - extraconfiguration.mAccessibleChanged;
        if (i5 != 0) {
            return i5;
        }
        int i6 = Long.compare(this.mMaterialColor, extraconfiguration.mMaterialColor);
        if (i6 != 0) {
            return i6;
        }
        int i7 = Long.compare(this.mUxIconConfig, extraconfiguration.mUxIconConfig);
        if (i7 != 0) {
            return i7;
        }
        int i8 = Float.compare(this.mDarkModeBackgroundMaxL, extraconfiguration.mDarkModeBackgroundMaxL);
        if (i8 != 0) {
            return i8;
        }
        int i9 = Float.compare(this.mDarkModeDialogBgMaxL, extraconfiguration.mDarkModeDialogBgMaxL);
        if (i9 != 0) {
            return i9;
        }
        int i10 = Float.compare(this.mDarkModeForegroundMinL, extraconfiguration.mDarkModeForegroundMinL);
        if (i10 != 0) {
            return i10;
        }
        int i11 = Float.compare(this.mFoldingAngle, extraconfiguration.mFoldingAngle);
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.mFontVariationSettings - extraconfiguration.mFontVariationSettings;
        if (i12 != 0) {
            return i12;
        }
        int i13 = this.mFontOpSansSettings - extraconfiguration.mFontOpSansSettings;
        if (i13 != 0) {
            return i13;
        }
        String str = this.mThemePrefix;
        if (str != null && !str.equals(extraconfiguration.mThemePrefix)) {
            return -1;
        }
        return i13;
    }

    public void setTo(OplusExtraConfiguration extraconfiguration) {
        this.mThemeChanged = extraconfiguration.mThemeChanged;
        this.mThemeChangedFlags = extraconfiguration.mThemeChangedFlags;
        this.mFlipFont = extraconfiguration.mFlipFont;
        this.mUserId = extraconfiguration.mUserId;
        this.mAccessibleChanged = extraconfiguration.mAccessibleChanged;
        this.mUxIconConfig = extraconfiguration.mUxIconConfig;
        this.mFontUserId = extraconfiguration.mFontUserId;
        this.mMaterialColor = extraconfiguration.mMaterialColor;
        this.mFontVariationSettings = extraconfiguration.mFontVariationSettings;
        this.mFoldingAngle = extraconfiguration.mFoldingAngle;
        this.mIconPackName = extraconfiguration.mIconPackName;
        this.mOplusConfigType = extraconfiguration.mOplusConfigType;
        this.mDarkModeDialogBgMaxL = extraconfiguration.mDarkModeDialogBgMaxL;
        this.mDarkModeForegroundMinL = extraconfiguration.mDarkModeForegroundMinL;
        this.mDarkModeBackgroundMaxL = extraconfiguration.mDarkModeBackgroundMaxL;
        this.mOplusChangedConfigs = extraconfiguration.mOplusChangedConfigs;
        this.mFontOpSansSettings = extraconfiguration.mFontOpSansSettings;
        this.mThemePrefix = extraconfiguration.mThemePrefix;
    }

    public String toString() {
        return "mThemeChanged= " + this.mThemeChanged + ", mThemeChangedFlags= " + this.mThemeChangedFlags + ", mFlipFont= " + this.mFlipFont + ", mAccessibleChanged= " + this.mAccessibleChanged + ", mUxIconConfig= " + this.mUxIconConfig + ", mMaterialColor= " + Long.toHexString(this.mMaterialColor) + ", mUserId= " + this.mUserId + ", mFontUserId= " + this.mFontUserId + ", mFontVariationSettings= " + Integer.toHexString(this.mFontVariationSettings) + ", mFoldingAngle = " + this.mFoldingAngle + ", mIconPackName= " + this.mIconPackName + ", mDarkModeBackgroundMaxL= " + this.mDarkModeBackgroundMaxL + ", mDarkModeDialogBgMaxL= " + this.mDarkModeDialogBgMaxL + ", mDarkModeForegroundMinL= " + this.mDarkModeForegroundMinL + ", mOplusConfigType= " + this.mOplusConfigType + ", mOplusChangedConfigs= " + this.mOplusChangedConfigs + ", OpSans= " + this.mFontOpSansSettings;
    }

    public void setToDefaults() {
        this.mThemeChanged = 0;
        this.mThemeChangedFlags = 0L;
        this.mFlipFont = 0;
        this.mUserId = -1;
        this.mAccessibleChanged = 0;
        this.mUxIconConfig = 0L;
        this.mFontUserId = -1;
        this.mMaterialColor = -1L;
        this.mFontVariationSettings = 0;
        this.mFoldingAngle = -1.0f;
        this.mIconPackName = "";
        this.mOplusConfigType = 0L;
        this.mDarkModeBackgroundMaxL = -1.0f;
        this.mDarkModeForegroundMinL = -1.0f;
        this.mDarkModeDialogBgMaxL = -1.0f;
        this.mOplusChangedConfigs = 0L;
        this.mFontOpSansSettings = -1;
        this.mThemePrefix = "";
    }

    public int updateFrom(OplusExtraConfiguration extraconfiguration) {
        int i = 0;
        int i2 = extraconfiguration.mThemeChanged;
        if (i2 > 0 && this.mThemeChanged != i2) {
            i = 0 | 134217728;
            this.mThemeChanged = i2;
            this.mThemeChangedFlags = extraconfiguration.mThemeChangedFlags;
            int i3 = extraconfiguration.mUserId;
            if (i3 >= 0) {
                this.mUserId = i3;
            }
            this.mThemePrefix = extraconfiguration.mThemePrefix;
        }
        int i4 = extraconfiguration.mAccessibleChanged;
        if (i4 != 0 && this.mAccessibleChanged != i4) {
            i |= 67108864;
            this.mAccessibleChanged = i4;
            int i5 = extraconfiguration.mUserId;
            if (i5 >= 0) {
                this.mUserId = i5;
            }
        }
        int i6 = extraconfiguration.mFlipFont;
        if (i6 > 0 && this.mFlipFont != i6) {
            i |= 33554432;
            this.mFlipFont = i6;
        }
        int i7 = extraconfiguration.mUserId;
        if (i7 >= 0 && this.mUserId != i7) {
            i |= 268435456;
            this.mUserId = i7;
        }
        int i8 = extraconfiguration.mFontUserId;
        if (i8 >= 0 && this.mFontUserId != i8) {
            i |= 268435456;
            this.mFontUserId = i8;
        }
        long j = extraconfiguration.mUxIconConfig;
        if (j > 0 && j != this.mUxIconConfig) {
            i |= 8388608;
            this.mUxIconConfig = j;
            int i9 = extraconfiguration.mUserId;
            if (i9 >= 0) {
                this.mUserId = i9;
            }
        }
        if (isMaterialChanged(extraconfiguration)) {
            i |= 67108864;
            this.mMaterialColor = extraconfiguration.mMaterialColor;
            int i10 = extraconfiguration.mUserId;
            if (i10 >= 0) {
                this.mUserId = i10;
            }
        }
        int i11 = extraconfiguration.mFontVariationSettings;
        if (i11 > 0 && i11 != this.mFontVariationSettings) {
            i |= 16777216;
            this.mFontVariationSettings = i11;
        }
        float f = extraconfiguration.mFoldingAngle;
        if (f > -1.0f && f != this.mFoldingAngle) {
            i |= 65536;
            this.mFoldingAngle = f;
        }
        String str = extraconfiguration.mIconPackName;
        if (str != null && !str.equals("") && !extraconfiguration.mIconPackName.equals(this.mIconPackName)) {
            i |= 8388608;
            this.mIconPackName = extraconfiguration.mIconPackName;
            int i12 = extraconfiguration.mUserId;
            if (i12 >= 0) {
                this.mUserId = i12;
            }
        }
        if (isDarkModeBgChanged(extraconfiguration)) {
            i |= 268435456;
            this.mDarkModeBackgroundMaxL = extraconfiguration.mDarkModeBackgroundMaxL;
            this.mOplusConfigType = 1L;
        }
        if (isDarkModeDialogBgChanged(extraconfiguration)) {
            i |= 268435456;
            this.mDarkModeDialogBgMaxL = extraconfiguration.mDarkModeDialogBgMaxL;
            this.mOplusConfigType = 1L;
        }
        if (isDarkModeFgChanged(extraconfiguration)) {
            i |= 268435456;
            this.mDarkModeForegroundMinL = extraconfiguration.mDarkModeForegroundMinL;
            this.mOplusConfigType = 1L;
        }
        if (isOpSansSettingsChanged(extraconfiguration)) {
            int i13 = i | 16777216;
            this.mFontOpSansSettings = extraconfiguration.mFontOpSansSettings;
            return i13;
        }
        return i;
    }

    public int diff(OplusExtraConfiguration extraconfiguration) {
        int i = 0;
        int i2 = extraconfiguration.mThemeChanged;
        if (i2 > 0 && this.mThemeChanged != i2) {
            i = 0 | 134217728;
        }
        int i3 = extraconfiguration.mAccessibleChanged;
        if (i3 != 0 && this.mAccessibleChanged != i3) {
            i |= 67108864;
        }
        int i4 = extraconfiguration.mFlipFont;
        if (i4 > 0 && this.mFlipFont != i4) {
            i |= 33554432;
        }
        int i5 = extraconfiguration.mUserId;
        if (i5 >= 0 && this.mUserId != i5) {
            i |= 268435456;
        }
        int i6 = extraconfiguration.mFontUserId;
        if (i6 >= 0 && this.mFontUserId != i6) {
            i |= 268435456;
        }
        long j = extraconfiguration.mUxIconConfig;
        if (j > 0 && this.mUxIconConfig != j) {
            i |= 8388608;
        }
        if (isMaterialChanged(extraconfiguration)) {
            i |= 67108864;
        }
        int i7 = extraconfiguration.mFontVariationSettings;
        if (i7 >= 0 && this.mFontVariationSettings != i7) {
            i |= 16777216;
        }
        float f = extraconfiguration.mFoldingAngle;
        if (f > -1.0f && f != this.mFoldingAngle) {
            i |= 65536;
        }
        String str = extraconfiguration.mIconPackName;
        if (str != null && !str.equals("") && !extraconfiguration.mIconPackName.equals(this.mIconPackName)) {
            i |= 8388608;
        }
        if (isDarkModeBgChanged(extraconfiguration)) {
            i |= 268435456;
        }
        if (isDarkModeDialogBgChanged(extraconfiguration)) {
            i |= 268435456;
        }
        if (isDarkModeFgChanged(extraconfiguration)) {
            i |= 268435456;
        }
        if (isOpSansSettingsChanged(extraconfiguration)) {
            return i | 16777216;
        }
        return i;
    }

    public static boolean needNewResources(int i) {
        if ((134217728 & i) != 0 || (33554432 & i) != 0 || (i & 512) != 0 || (8388608 & i) != 0) {
            return true;
        }
        return false;
    }

    public static boolean needAccessNewResources(int i) {
        return (67108864 & i) != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mThemeChanged);
        parcel.writeLong(this.mThemeChangedFlags);
        parcel.writeInt(this.mFlipFont);
        parcel.writeInt(this.mUserId);
        parcel.writeInt(this.mAccessibleChanged);
        parcel.writeLong(this.mUxIconConfig);
        parcel.writeInt(this.mFontUserId);
        parcel.writeLong(this.mMaterialColor);
        parcel.writeInt(this.mFontVariationSettings);
        parcel.writeString(this.mIconPackName);
        parcel.writeLong(this.mOplusConfigType);
        parcel.writeFloat(this.mDarkModeForegroundMinL);
        parcel.writeFloat(this.mDarkModeBackgroundMaxL);
        parcel.writeFloat(this.mDarkModeDialogBgMaxL);
        parcel.writeFloat(this.mFoldingAngle);
        parcel.writeLong(this.mOplusChangedConfigs);
        parcel.writeInt(this.mFontOpSansSettings);
        parcel.writeString(this.mThemePrefix);
    }

    public void readFromParcel(Parcel parcel) {
        this.mThemeChanged = parcel.readInt();
        this.mThemeChangedFlags = parcel.readLong();
        this.mFlipFont = parcel.readInt();
        this.mUserId = parcel.readInt();
        this.mAccessibleChanged = parcel.readInt();
        this.mUxIconConfig = parcel.readLong();
        this.mFontUserId = parcel.readInt();
        this.mMaterialColor = parcel.readLong();
        this.mFontVariationSettings = parcel.readInt();
        this.mIconPackName = parcel.readString();
        this.mOplusConfigType = parcel.readLong();
        this.mDarkModeForegroundMinL = parcel.readFloat();
        this.mDarkModeBackgroundMaxL = parcel.readFloat();
        this.mDarkModeDialogBgMaxL = parcel.readFloat();
        this.mFoldingAngle = parcel.readFloat();
        this.mOplusChangedConfigs = parcel.readLong();
        this.mFontOpSansSettings = parcel.readInt();
        this.mThemePrefix = parcel.readString();
    }

    public int hashCode() {
        int i = this.mThemeChanged + ((int) this.mThemeChangedFlags);
        return (i * 31) + this.mFlipFont + (this.mAccessibleChanged * 16) + (this.mUserId * 8) + ((int) this.mUxIconConfig) + this.mIconPackName.hashCode();
    }

    private boolean isDarkModeBgChanged(OplusExtraConfiguration extraConfiguration) {
        float f = extraConfiguration.mDarkModeBackgroundMaxL;
        return f >= 0.0f && f != this.mDarkModeBackgroundMaxL;
    }

    private boolean isDarkModeFgChanged(OplusExtraConfiguration extraConfiguration) {
        float f = extraConfiguration.mDarkModeForegroundMinL;
        return f >= 0.0f && f != this.mDarkModeForegroundMinL;
    }

    private boolean isDarkModeDialogBgChanged(OplusExtraConfiguration extraConfiguration) {
        float f = extraConfiguration.mDarkModeDialogBgMaxL;
        return f >= 0.0f && f != this.mDarkModeDialogBgMaxL;
    }

    public static boolean shouldReportExtra(int i, int real) {
        if (((~real) & i & (-268435457)) != 0) {
            return false;
        }
        return true;
    }

    private boolean isOpSansSettingsChanged(OplusExtraConfiguration newExtraCfg) {
        int i = newExtraCfg.mFontOpSansSettings;
        return i >= 0 && i != this.mFontOpSansSettings;
    }

    private boolean isMaterialChanged(OplusExtraConfiguration extraConfig) {
        long oldHigh = this.mMaterialColor >> 32;
        long j = extraConfig.mMaterialColor;
        long newHigh = j >> 32;
        return (oldHigh < newHigh || (oldHigh >= 1879048190 && newHigh <= 1)) && j >= 0;
    }
}
