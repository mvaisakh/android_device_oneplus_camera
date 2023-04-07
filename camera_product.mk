#
# Copyright (C) 2023 StatiXOS
#

# OPlus Camera product specifications

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/priv-app-permissions-oplus-camera.xml:$(TARGET_COPY_OUT_PRODUCT)/etc/permissions/privapp-permissions-oplus-camera.xml

$(call inherit-product, vendor/oplus/camera/camera-vendor.mk)
