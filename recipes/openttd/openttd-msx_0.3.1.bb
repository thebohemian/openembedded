DESCRIPTION = "Freely licensed music data files for OpenTTD"
HOMEPAGE = "http://bundles.openttdcoop.org"
LICENSE = "GPLv2"

PACKAGE_ARCH = "all"

SRC_URI = "http://bundles.openttdcoop.org/openmsx/releases/${PV}/openmsx-${PV}.zip"

S = "${WORKDIR}/openmsx-${PV}"

do_install() {
	install -d ${D}${datadir}/games/openttd/data/
	install -m 0644 ${S}/*.mid ${D}${datadir}/games/openttd/data/
	install -m 0644 ${S}/openmsx.obm ${D}${datadir}/games/openttd/data/
	install -m 0644 ${S}/changelog.txt ${D}${datadir}/games/openttd/data/openmsx_changelog.txt
	install -m 0644 ${S}/readme.txt ${D}${datadir}/games/openttd/data/openmsx_readme.txt
	install -m 0644 ${S}/license.txt ${D}${datadir}/games/openttd/data/openmsx_license.txt
}

FILES_${PN} = "${datadir}"

SRC_URI[md5sum] = "858b79d44aea6de5e15d9d1439e86cc3"
SRC_URI[sha256sum] = "92e293ae89f13ad679f43185e83fb81fb8cad47fe63f4af3d3d9f955130460f5"

