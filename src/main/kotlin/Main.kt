import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import javax.xml.bind.DatatypeConverter

fun main() {

    val keyHexadecimal = "1234567890"
    val texto = "Hola"

    val key = SecretKeySpec(DatatypeConverter.parseHexBinary(keyHexadecimal), "AES")

    val cipher = Cipher.getInstance("AES/ECB/NoPadding")
    cipher.init(Cipher.ENCRYPT_MODE, key)

    cipher.doFinal(DatatypeConverter.parseHexBinary(texto))


}