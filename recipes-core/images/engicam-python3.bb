require core-image-minimal.bb

DESCRIPTION = "Engicam image with python3 support"


IMAGE_INSTALL_append += " mtd-utils imx-kobs mtd-utils-ubifs"

EXTRA_IMAGE_FEATURES = "debug-tweaks ssh-server-openssh tools-debug"

FSL_KERNEL_DEFCONFIG="icore-defconfig"

UBOOT_CONFIG = "nand"

IMAGE_FSTYPES = "tar.bz2 sdcard ubifs"

SOC_IMAGE_INSTALL = ""
SOC_IMAGE_INSTALL_mx6 = "gpu-viv-bin-mx6q gpu-viv-g2d fsl-gpu-sdk"
 
IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    engicam-mtd-script \
    engicam-emmc-script \
    python3-modules \
    python3-misc \
    "
