DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become a full-featured computer algebra system (CAS) while keeping the code as simple as possible in order to be comprehensible and easily extensible. SymPy is written entirely in Python. It depends on mpmath, and other external libraries may be optionally for things like plotting support."
HOMEPAGE = "http://sympy.org/"
SUMMARY = "Computer algebra system (CAS) in Python"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

PYPI_PACKAGE = "mpmath"

SRC_URI[md5sum] = "af5cc956b2673b33a25c3e57299bae7b"
SRC_URI[sha256sum] = "68ddf6426dcda445323467d89892d2cffbbd1ae0b31ac1241b1b671749d63222"

inherit pypi setuptools

