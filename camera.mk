#
# Copyright (C) 2022 Statix
# SPDX-License-Identifer: Apache-2.0
#

PRODUCT_PACKAGES += \
    oplus-fwk

PRODUCT_BOOT_JARS += oplus-fwk

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/hiddenapi-package-whitelist-oplus-system.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/sysconfig/hiddenapi-package-whitelist-oplus-system.xml \
    $(LOCAL_PATH)/permissions-oplus-camera-extra.xml:$(TARGET_COPY_OUT_PRODUCT)/etc/permissions/default-permissions/permissions-oplus-camera-extra.xml

OPLUS_CAMERA_PROPERTIES := \
    vendor.camera.aux.packagelist=android,com.oplus.camera \
    persist.vendor.camera.privapp.list=com.oplus.camera \
    persist.camera.privapp.list=com.oplus.camera

PRODUCT_VENDOR_PROPERTIES += $(OPLUS_CAMERA_PROPERTIES)
PRODUCT_PRODUCT_PROPERTIES += $(OPLUS_CAMERA_PROPERTIES)

$(call inherit-product, vendor/oneplus/camera/camera-vendor.mk)
