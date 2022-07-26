#
# Copyright (C) 2022 Statix
# SPDX-License-Identifer: Apache-2.0
#

PRODUCT_PACKAGES += \
    oplus-fwk

PRODUCT_BOOT_JARS += oplus-fwk

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/hiddenapi-package-whitelist-oplus-system.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/sysconfig/hiddenapi-package-whitelist-oplus-system.xml \
    $(LOCAL_PATH)/permissions-oplus-camera-extra.xml:$(TARGET_COPY_OUT_PRODUCT)/etc/permissions/permissions-oplus-camera-extra.xml

$(call inherit-product, vendor/oneplus/camera/camera-vendor.mk)
