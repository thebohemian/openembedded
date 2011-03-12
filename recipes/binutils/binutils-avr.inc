SECTION = "devel"

AVR_PREFIX = "avr-"
AVR_SYS = "avr"

DEPENDS += "flex-native bison-native"
PROVIDES = "binutils-avr"
EXTRA_OECONF = "--target=${AVR_SYS} \
		--with-sysroot=${STAGING_DIR_TARGET} \
		--with-build-sysroot=${STAGING_DIR_TARGET} \
		--program-prefix=${AVR_PREFIX} \
		--disable-werror \
		--disable-static \
		--with-gnu-ld \
		--with-gnu-as \
		--enable-install-libbfd \
		--with-dwarf2 \
	       "

do_install () {
	oe_runmake 'DESTDIR=${D}' install
	rm -rf ${D}${prefix}/${AVR_SYS}
	# We don't really need these, so we'll remove them...
	rm -rf ${D}${prefix}/lib/ldscripts
	rm -rf ${D}${prefix}/share/info
	rm -rf ${D}${prefix}/share/locale
	rm -rf ${D}${prefix}/share/man
	rmdir ${D}${prefix}/share || :
	rmdir ${D}${prefix}/${libdir}/gcc-lib || :
	rmdir ${D}${prefix}/${libdir}64/gcc-lib || :
	rmdir ${D}${prefix}/${libdir} || :
	rmdir ${D}${prefix}/${libdir}64 || :
	rmdir ${D}${prefix}/${prefix} || :
	# Insert symlinks into libexec so when tools without a prefix are searched for, the correct ones are
	# found.
	dest=${D}${prefix}/${AVR_SYS}${base_bindir_native}
	install -d $dest
	for t in ar as ld nm objcopy objdump ranlib strip; do
		ln -sf ../..${base_bindir_native}/${TARGET_PREFIX}$t $dest/$t
	done
}
