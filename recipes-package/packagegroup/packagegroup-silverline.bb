DESCRIPTION = "Slverline Package Group"

inherit packagegroup

PACKAGES = "\
    packagegroup-silverline \
"

RDEPENDS_packagegroup-silverline = "\
    opkg \
    avahi \
    lighttpd \
    redis \
    silverline \
"

