import utils.SuitSystem
import kotlin.system.exitProcess

/*
* ===== PSEUDOCODE =====
* Buat Package Utils -> DONE
* Buat Class Suit System -> DONE
*   - Buat fun inputPlayer -> DONE
*       - Input Player 1 -> DONE
*       - Input Player 2 -> DONE
*   - Buat funtion suitCondition -> DONE
*   - Initialize fun suitCondition ke fun inputPlayer -> DONE
* Bikin Class App -> DONE
*   - Print Header -> DONE
*   - Play Game -> DONE
*   - Print Result -> DONE
* Repeat Game? -> DONE
* Check Every Result -> DONE (edit -> hapus fun suitCondition dan late init var karena hasil jadi draw terus)
* Push Final Version to Git -> DONE
* ===== PSEUDOCODE =====
*/

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            printHeader()
            SuitSystem().playerInput()
            playAgain()
        }

        private fun printHeader() {
            println("""
        ==============================================
        ========= GAME SUIT TERMINAL VERSION =========
        ==============================================
        """.trimIndent())
        }

        private fun playAgain() {
            println("Main Lagi? (Y/N)")
            if (readLine().equals("Y", ignoreCase = true)) {
                println("Masukkan Jumlah Main Lagi : ")
                val repeatPlay = readLine()?.toInt()
                if (repeatPlay != null) {
                    for (i in 1..repeatPlay) {
                        println(" ")
                        println("Permainan Ulang ke-$i")
                        SuitSystem().playerInput()
                    }
                }
            } else {
                println("Terima Kasih Sudah Bermain")
                exitProcess(0)
            }
        }
    }
}



/* VERSI WORKING NON OOP ADA DI BAWAH, JANGAN DIHAPUS
import kotlin.system.exitProcess

* ===== PSEUDOCODE =====
* Buat Package Utils ->
* Buat Class Suit System ->
* Bikin Class App -> DONE
* Print Header -> DONE
* Input Player 1 -> DONE
* Input Player 2 -> DONE
* Play Game -> DONE
* Print Result -> DONE
* Repeat Game? -> DONE
* ===== PSEUDOCODE =====

problem :
pake late init var ; var tsb harus diinialisasi, pas diisi "" ternyata hasilnya draw terus
akhirnya dimasukkan ke val tanpa late init dan function suit system dihapus supaya bisa berjalan

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            printHeader()
            playerInput()
            playAgain()
        }


        private fun printHeader() {
            println("""
        ==============================================
        ========= GAME SUIT TERMINAL VERSION =========
        ==============================================
        """.trimIndent())
        }

        private fun playerInput() {
            println("Player 1, Silahkan Masukkan Pilihanmu :")
            val playerOne = readLine().toString().toUpperCase()

            println("Player 2, Silahkan Masukkan Pilihanmu :")
            val playerTwo = readLine().toString().toUpperCase()
            if (playerOne == playerTwo) {
                println("Hasil : DRAW !")
            } else if (playerOne == "GUNTING" && playerTwo == "KERTAS" ||
                playerOne == "BATU" && playerTwo == "GUNTING" ||
                playerOne == "KERTAS" && playerTwo == "BATU"
            ) {
                println("Hasil : Player 1 MENANG !")
            } else if (playerOne == "KERTAS" && playerTwo == "GUNTING" ||
                playerOne == "GUNTING" && playerTwo == "BATU" ||
                playerOne == "BATU" && playerTwo == "KERTAS"
            ) {
                println("Hasil : Player 2 MENANG !")
            } else {
                println("Anda Belum Memasukkan Pilihan . . .")
            }
        }

        private fun playAgain() {
            println("Main Lagi? (Y/N)")
            if (readLine().equals("Y", ignoreCase = true)) {
                println("Masukkan Jumlah Main Lagi : ")
                val repeatPlay = readLine()?.toInt()
                if (repeatPlay != null) {
                    for (i in 1..repeatPlay) {
                        println(" ")
                        println("Permainan Ulang ke-$i")
                        playerInput()
                    }
                }
            } else {
                println("Terima Kasih Sudah Bermain")
                exitProcess(0)
            }
        }
    }
}
VERSI WORKING NON OOP, JANGAN DIHAPUS
*/