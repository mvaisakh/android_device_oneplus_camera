#
# Copyright (C) 2023 StatiXOS
#

# OPlus Camera product specifications

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/priv-app-permissions-oplus-camera.xml:$(TARGET_COPY_OUT_PRODUCT)/etc/permissions/privapp-permissions-oplus-camera.xml \
    $(LOCAL_PATH)/hiddenapi-package-whitelist-oplus-system.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/sysconfig/hiddenapi-package-whitelist-oplus-system.xml

PRODUCT_PACKAGES += \
    opluscameraframework

PRODUCT_BOOT_JARS += opluscameraframework

$(call inherit-product, vendor/oplus/camera/camera-vendor.mk)
