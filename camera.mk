#
# Copyright (C) 2022 Statix
# SPDX-License-Identifer: Apache-2.0
#

PRODUCT_PACKAGES += \
    oplus-fwk

PRODUCT_BOOT_JARS += oplus-fwk

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/hiddenapi-package-whitelist-oplus-system.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/sysconfig/hiddenapi-package-whitelist-oplus-system.xml \
    $(LOCAL_PATH)/privapp-permissions-oplus-extra.xml:$(TARGET_COPY_OUT_PRODUCT)/etc/permissions/privapp-permissions-oplus-extra.xml \
    $(LOCAL_PATH)/public.libraries-qti.txt:$(TARGET_COPY_OUT_SYSTEM_EXT)/etc/public.libraries-qti.txt \
    $(LOCAL_PATH)/init.camera.rc:$(TARGET_COPY_OUT_VENDOR)/etc/init/init.camera.rc

OPLUS_CAMERA_PROPERTIES := \
    vendor.camera.aux.packagelist=android,com.oplus.camera \
    persist.vendor.camera.privapp.list=com.oplus.camera \
    persist.camera.privapp.list=com.oplus.camera

PRODUCT_VENDOR_PROPERTIES += \
    $(OPLUS_CAMERA_PROPERTIES) \
    vendor.camera.algo.jpeghwencode=0

PRODUCT_PRODUCT_PROPERTIES += \
    $(OPLUS_CAMERA_PROPERTIES) \
    ro.com.google.lens.oem_camera_package=com.oplus.camera \
    ro.com.google.lens.oem_image_package=com.oneplus.gallery

PRODUCT_PACKAGES += \
    camera.device@3.6-external-impl:64 \
    libcamera2ndk_vendor

$(call inherit-product, vendor/oneplus/camera/camera-vendor.mk)
