DESCRIPTION = "GreekNetRadio"
SUMMARY = "Greek web radios"
SECTION = "multimedia"
MAINTAINER = "SatDreamGR"
HOMEPAGE = "http://satdreamgr.com"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://setup.py;beginline=1;endline=7;md5=3451c7d09e6a53ab08a8eb20a698a582"

RDEPENDS_${PN} = "python-core"

PV = "3.1+git${SRCPV}"
PKGV = "3.1+git${GITPKGV}"
PR = "r0"

S="${WORKDIR}/git"

SRC_URI = "git://github.com/satdreamgr/GreekNetRadio;protocol=git"

SRCREV = "${AUTOREV}"

inherit distutils-openplugins gitpkgv

#PACKAGES =+ "${PN}-src"

FILES_${PN} = "${libdir}/enigma2/python/Plugins/Extensions/GreekNetRadio/*"
FILES_${PN}-src = "${libdir}/enigma2/python/Plugins/Extensions/GreekNetRadio/*.py \
	${libdir}/enigma2/python/Plugins/enigma2_plugin_extensions_greeknetradio-1.0-py2.7.egg-info \
	${libdir}/python2.7/* \
	"

