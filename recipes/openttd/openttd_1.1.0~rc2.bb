require openttd.inc

# This recipe is meant as an outlook at what changes are neccessary to the openttd 
# build for the soon to be released 1.1.0 stable series.
DEFAULT_PREFERENCE = "-1"

# lzma is required for 1.1.0+
DEPENDS += "lzma"

# 

# Reusing that variable for this autotools-lookalike build system.
#EXTRA_OECONF = "--with-liblzma='${STAGING_LIBDIR}/liblzma.a'"

# Upstream package version differs a bit
UPV = "1.1.0-RC2"

SRC_URI ="http://binaries.openttd.org/releases/${UPV}/${PN}-${UPV}-source.tar.gz"

S = "${WORKDIR}/${PN}-${UPV}"

PR = "r0"

SRC_URI[md5sum] = "7bd3830a0e036f03b41600768a15fd4e"
SRC_URI[sha256sum] = "c80a6f0e02039614a3cf95a64378469c86924fc7fc9a1735b362e0a7c3314334"
