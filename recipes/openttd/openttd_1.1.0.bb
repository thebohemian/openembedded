require openttd.inc

# This recipe is meant as an outlook at what changes are neccessary to the openttd 
# build for the soon to be released 1.1.0 stable series.
DEFAULT_PREFERENCE = "-1"

# lzma is required for 1.1.0+
DEPENDS += "lzma"

# Reusing that variable for this autotools-lookalike build system.
EXTRA_OECONF = "--with-liblzma='${STAGING_LIBDIR}/liblzma.a'"

SRC_URI ="http://binaries.openttd.org/releases/${UPV}/${PN}-${PV}-source.tar.gz"

S = "${WORKDIR}/${PN}-${PV}"

PR = "r0"

SRC_URI[md5sum] = "d5ca3357e5c7f995aa43414ff4d93cfb"
SRC_URI[sha256sum] = "f5584fb48a64fe173f351d13993f2d9439afe5cf3ad457692604d4f801d895f8"
