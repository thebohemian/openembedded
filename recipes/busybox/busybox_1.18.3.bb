require busybox_1.1x.inc
PR = "${INC_PR}.4"

SRC_URI += " \
	http://busybox.net/downloads/fixes-1.18.3/busybox-1.18.3-buildsys.patch;name=patch01 \
	http://busybox.net/downloads/fixes-1.18.3/busybox-1.18.3-modutils24.patch;name=patch02 \
	http://busybox.net/downloads/fixes-1.18.3/busybox-1.18.3-wget.patch;name=patch03 \
        http://busybox.net/downloads/fixes-1.18.3/busybox-1.18.3-menuconfig.patch;name=patch04 \
	http://busybox.net/downloads/fixes-1.18.3/busybox-1.18.3-klogd.patch;name=patch05 \
	http://busybox.net/downloads/fixes-1.18.3/busybox-1.18.3-cksum.patch;name=patch06 \
	"

SRC_URI[md5sum] = "660af4d44661d32b22025a66f4f78df2"
SRC_URI[sha256sum] = "83f112ee88b7eb85bea1cac0b1af33f61387a1036f1898c5ecd79813191a619b"
SRC_URI[patch01.md5sum] = "1270a714d2ed9940f04379c97bb83cba"
SRC_URI[patch01.sha256sum] = "cb438f0a5c46125387187b4a2389d56f7aa8db5a308aed314f5866cf9a09b72b"
SRC_URI[patch02.md5sum] = "ce7c3421c87088a7f779278680563bff"
SRC_URI[patch02.sha256sum] = "134ed86867784348f484810464df5bc97589e7aa41079c90e35b8d12b9284df8"
SRC_URI[patch03.md5sum] = "abe065069fed8458eedbdad48c115e1f"
SRC_URI[patch03.sha256sum] = "22538ebee96f66916104b8143cfd16e21568da4c5a89128b9daa60d83a59120b"
SRC_URI[patch04.md5sum] = "d12d997b66669451bd8c4cc494162a80"
SRC_URI[patch04.sha256sum] = "f3f8466432088248492fc44631a765ed0a95a8b7d14e37483fae25158d07dc68"
SRC_URI[patch05.md5sum] = "f2277e7a31d04295bd9d56a98ff1535b"
SRC_URI[patch05.sha256sum] = "4c7ab0e7d940a4aaf54a0b6fd21f00ab025eaf025d47f2e085a6269e1842016c"
SRC_URI[patch06.md5sum] = "04d7d01e71b2875f3093d4de9fa8c001"
SRC_URI[patch06.sha256sum] = "4ce825550723ded45a5cc71ac524cce50342508cfff118172f64e8e86bb65828"
