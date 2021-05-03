package utils

class SuitSystem {
    fun playerInput() {
        println("Player 1, Silahkan Masukkan Pilihanmu :")
        val playerOne = readLine().toString().toUpperCase()

        println("Player 2, Silahkan Masukkan Pilihanmu :")
        val playerTwo = readLine().toString().toUpperCase()

        if (playerOne == playerTwo) {
            println("Hasil : DRAW !")
        } else if (playerOne == "GUNTING" && playerTwo == "KERTAS" ||
            playerOne == "BATU" && playerTwo == "GUNTING" ||
            playerOne == "KERTAS" && playerTwo == "BATU") {
            println("Hasil : Player 1 MENANG !")
        } else if (playerOne == "KERTAS" && playerTwo == "GUNTING" ||
            playerOne == "GUNTING" && playerTwo == "BATU" ||
            playerOne == "BATU" && playerTwo == "KERTAS") {
            println("Hasil : Player 2 MENANG !")
        } else {
            println("Pilihan yang Anda Masukkan Salah . . .")
            println("Silahkan Ulangi . . .")
            SuitSystem().playerInput()
        }
    }
}