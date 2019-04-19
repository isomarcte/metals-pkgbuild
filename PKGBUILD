# This is an example PKGBUILD file. Use this as a start to creating your own,
# and remove these comments. For more information, see 'man PKGBUILD'.
# NOTE: Please fill out the license field for your package! If it is unknown,
# then please put 'unknown'.

# Maintainer: David Strawn <isomarcte a__t gmail d__o__t c__o__m>
pkgname='metals'
pkgver='0.5.0'
pkgrel=7
epoch=
pkgdesc='Language Server For Scala'
url='https://scalameta.org/metals/'
arch=(any)
license=('Apache')
groups=()
depends=('java-environment=8' 'findutils' 'python')
makedepends=('sbt' 'sed' 'grep' 'coreutils')
checkdepends=()
optdepends=('bloop')
provides=()
conflicts=()
replaces=()
backup=()
options=()
install=
changelog=
source=("https://github.com/scalameta/${pkgname}/archive/v${pkgver}.tar.gz" 'metals-client.sh' 'metals-emacs.sh' 'metals-vim.sh' 'metals-vscode.sh' 'metals-sublime.sh' 'version-fix.patch')
noextract=()
md5sums=('1893a9e8e8a26431904cced138d8e26d'
         '35ee070c7f53e7e02498be2e4c56d816'
         'ad97e9262c7b22dd71b017a6402f612a'
         '000bd73ebc3ea46b23e2c418ef97f4c7'
         '83b5669127510100d6e7ab4094877a6e'
         '38c34ab96f6cf637f7be9f72b7400983'
         '1228820359ad5d636e56db35349350f4')
sha1sums=('8370cb58637a47d0640f4f619c95207374cb5eb7'
          '8e1b6939afe4dd9a845edbdb5d61dab1c69f62c3'
          'b498568936dcfd03a06d7b41f76bbb7fffbc3bdf'
          '3882901e88f4a85f85d67dcda53f83c89d4563c6'
          'f2d0e8aa2744697d4dad0a7c10f835fe5814524b'
          'b2577ac4ee93e3a611558294378c185227ed8321'
          'feaf909569c00776b67e8d5315332ae3dc02a8b2')
sha224sums=('24546483700bda5d64cd135bc3d7d53a34b33376ec8a4502c5335385'
            '438186ea833e286e9b531987d5867d47c9ae9d1127b6c038b672ff43'
            '43d2f6b0b4b7ef539f5109b1127dcd88828f2f8ae0b9c052899af1c9'
            'a99d9457fd6cf582b349e56e5e8e9cece30e33ff6866c5969f090f5e'
            '6ffcb9ee870dd260f90e333082e90b9b30212f1f21dd3d3a0048a67e'
            'fff5cbeed72e44f9159872f59a0ca0a19fc81a8ed943500373e9108e'
            '702ee997e46be69bca262c1be3867203ccb4454df859b8b9ca323d74')
sha256sums=('57f61352e382cef8c53a674307fcc8aab1d2b44719831830a9d899dbf14f197c'
            '8d71d694bc627f788b4d53c5f49327f6e7cd353856f5e4892d33769268767b00'
            'b3579e68cee7f23f6f6a12fe0bc6396f1722434d23ce3c58e7c9fac2233cd1d3'
            'e9bbc61ec99dc0893560a12a8a0f56c9f27016895e177a164019ab9174fe94e2'
            'c2213c8d4a1a0fe5bb12d5bcde53ab04d9b0aa08ddcabd60de938a8d480e49d5'
            'fb42157046a11089fa69e0120ae83ff3bc354709e2add4644fe3fc60aa80c984'
            '510bab61855505e4e301f98c2b44259964803ced3799fb9fb3d5bc180ba765f9')
sha384sums=('871a1da43a17de6a7251c0c7c1ae19bf6aa85f293249674ffa535803a75bfcc14714cf19fc6ea0956bdb00f94332517d'
            '9246da0123e02641954b1fcca7213c37599cfbf03a7d8fb8dcc49f4f5dbc523931126f202d62459f0bb600f60ccf3648'
            '762dd7c73e994b74ebeb5c975ca0b53ddf4cbf181664d465bd9c543798333dcc4939c360a4b5b8b1b162810ea363d288'
            '6bee0d21d0fcf3d8f5ee14545be63fb2bbababb0665020540daafc708939bbc539ab940cfe122b2281156bc78d401768'
            '26859b59a04e38a5e7d02e188643765d06b893385232895f5b1435fb3d4fa4d676e8d43bbc80360f9ee7a2ee01e64d2c'
            '8b9204ce4a60890eb94f0fe673504a9a10c583b9814e844da14b8d1313db7f8cf7d5f9a7b8db0bbd25fb2f9263e434b7'
            '24ae61e7e62d5b2944093cc1273b9be3a813db436ffe44769e5dbe0dc37f085492950389e0324285bd149c4d818f79ca')
sha512sums=('21d6bd645ad35b749374b76015e7019375e2723b4e4e1b25dc0a983591f475c5466f1b6840a90b8dcd582e870a25f7d8296c04da8ec6e780512f0a5b53c6dd5c'
            'a9cca2cb0b75fabc93b0b9b5de7228503c3f35638944ce5bccd4cd6bcb097de784e12be1d620546e57b85bb13b8c11a05e1183c52fc1cb914b32f4247efcbcb4'
            'bd26818e43627c4e20aa931663b4623e45ade0930a29952d6508fa6e1302f5140afed7f57a796c12da3e9ae256ff7c0b3eb2e5075b00ceda9d2e4ddc22e89205'
            '16d01a820f1ed93ae46194d3d77187adf6fd4e9764fcf99554430e3e2f2af4cc2b6f7918f595febd3c5e6a380bbfb930bb47a3dd2ba93c60b2ca1f874f264fee'
            '722770a6c30ccf75c73ae9be19655cdff00561c62bf15b619dfa618cdd636e97aaf5a6aca1297add4e6a54274cd49e81781d98a59986526d0077a6c64855562d'
            '9f32d0ead26fad866f52209c0f6dabdaa3481bafd6121134b2fde6e95a80b5d2757c17ca6f1804b6e060b839efa9a9f7d342d48ad8d22b767e13c585e209045b'
            'b4a4eb0bde4045de411b639e16cf41b95e3e50d8950c3a48008d42b60751541e4957c463f4f817320f15488c702d52fb977d3fe63d8832d55f259907f7e0afcf')
validpgpkeys=()

prepare() {
    cd "$pkgname-$pkgver"

    # The build currently does not set the correct version unless
    # built from git with the environment variable CI set. See
    # https://github.com/scalameta/metals/issues/662
    patch -p1 -i ../version-fix.patch
}

build() {
    export COURSIER_CACHE="./.cache/coursier/v1"
    export CI="TRUE" # Needed so the build will not think it is a SNAPSHOT

    local -r _SBT_DIR="./.sbt"
    local -r _SBT_IVY="./.ivy2"
    cd "$pkgname-$pkgver"

    # When run with some AUR helpers, in particular `yay`, for a
    # reason I do not understand `sbt` will regularly attempt to
    # resolve the Scala compiler in a local-preloaded-ivy cache
    # _only_, and not attempt to download it. However if you just run
    # it again, it then tries to download it. This does not happen
    # when run locally, for me at least, with makepkg or in a
    # systemd-nspawn with extra-x86_64-build.
    sbt -sbt-dir "$_SBT_DIR" -ivy "$_SBT_IVY" clean compile || sbt -sbt-dir "$_SBT_DIR" -ivy "$_SBT_IVY" clean compile
}

check() {
    export COURSIER_CACHE="./.cache/coursier/v1"
    export CI="TRUE" # Needed so the build will not think it is a SNAPSHOT

    local -r _SBT_DIR="./.sbt"
    local -r _SBT_IVY="./.ivy2"
    cd "$pkgname-$pkgver"
    ## Tests on most recent release currently fail
    # sbt test
}

package() {
    export COURSIER_CACHE='./.cache/coursier/v1'
    export CI="TRUE" # Needed so the build will not think it is a SNAPSHOT

    ## Constants ##
    local -r _SBT_DIR='./.sbt'
    local -r _SBT_IVY='./.ivy2'
    local -r _TARGET_DIR='/usr/share/java/metals'
    local -r _DEST_DIR="${pkgdir}${_TARGET_DIR}"
    local -r _BIN_DEST_DIR="${_DEST_DIR}/bin"
    local -r _LIB_DEST_DIR="${_DEST_DIR}/lib"
    local -r _JAR_DEST_DIR="${_DEST_DIR}/jars"
    local -r _USR_BIN="${pkgdir}/usr/bin"
    local -r _TEMP_FILE="$(mktemp)"
    local -r _LAUNCHER_SCRIPTS=('metals-client.sh' 'metals-emacs.sh' 'metals-vim.sh' 'metals-vscode.sh' 'metals-sublime.sh')

    ## Change Into Correct Directory ##
    pushd "$pkgname-$pkgver"

    ## Create lib And bin Directories ##
    install -d "$_LIB_DEST_DIR"
    install -d "$_BIN_DEST_DIR"

    ## Install Class Files And Jars ##

    ### Determine Dependencies ###

    # If you're reading this and you know of a better way to get all
    # the dependencies from SBT directly, please let me know.
    sbt -sbt-dir "$_SBT_DIR" -ivy "$_SBT_IVY" compile 'show metals/dependencyClasspath' 2>/dev/null | grep Attributed | sed 's/^[^\*]\+\* Attributed(\([^)]\+\).*/\1/g' > "$_TEMP_FILE"
    while read dep
    do
        local _SANATIZED_DEP="${dep##*${pkgname}-${pkgver}/}"
        # Sort out directories from modules from third-party jars.
        if [ -d "$_SANATIZED_DEP" ]
        then
            pushd "$_SANATIZED_DEP"
            cp -r ./* "${_LIB_DEST_DIR}/"
            popd
        else
            if [ ! -e "$_JAR_DEST_DIR" ]
            then
               install -d "${_JAR_DEST_DIR}"
            fi
            local _JAR_PATH="${dep##*/maven2}"

            install -D "$_SANATIZED_DEP" "${_JAR_DEST_DIR}${_JAR_PATH}"
        fi
    done<"$_TEMP_FILE"

    ## Install Metals Class Files ##

    install -d "${_DEST_DIR}/metals"
    pushd 'metals/target/scala-2.12/classes'
    cp -r ./*  "${_DEST_DIR}/metals/"
    popd

    ## Install And Symlink Launcher Scripts ##
    for launcher in ${_LAUNCHER_SCRIPTS[@]}
    do
        local _LINK_NAME="${launcher##*/}"
        _LINK_NAME="${launcher%%.*}"
        if [ ! -e "$_USR_BIN" ]
        then
            install -d "${_USR_BIN}"
        fi
        install -m 755 "../${launcher}" "$_BIN_DEST_DIR"
        ln -s "${_TARGET_DIR}/bin/${launcher}" "${_USR_BIN}/${_LINK_NAME}"
    done

    ## Ensure Correct Permissions ##

    chown root:root -R "$_DEST_DIR"
    chmod u=rwX -R "$_DEST_DIR"
    chmod u=rwX -R "$_BIN_DEST_DIR"
    chmod og=rX -R "$_DEST_DIR"

    ## Cleanup ##
    rm "$_TEMP_FILE"
    popd
}
