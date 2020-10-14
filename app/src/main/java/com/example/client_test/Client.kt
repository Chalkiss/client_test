import android.system.Os.socket
import com.example.client_test.decodeText
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStream
import java.net.Socket
import java.nio.charset.Charset
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread


fun main(args: Array<String>) {
    val address = "192.168.1.77"
    val port = 10201
    val client = Client(address, port)
    client.read()
}

class Client(address: String, port: Int) {
    private val connection: Socket = Socket(address, port)
    private var connected: Boolean = true

    init {
        println("Connected to server at $address on port $port")
    }
    var  fullOutput = ArrayList<String>()
    private val reader: Scanner = Scanner(connection.getInputStream())
    private val writer: OutputStream = connection.getOutputStream()

 /*   fun run(): Array<String> { // button na wejście do activity wywołuje run, run wywołuje crawler raz.
        thread { outputToSend= read()
            return outputToSend
        }
        if(connected) {
            val input =  ""
            if ("" == input) {
                write(" \n")
            }
        }

    }
*/
    private fun write(message: String) {
        writer.write((message + '\n').toByteArray(Charset.defaultCharset()))
    }

     fun read(): ArrayList<String> {
        if(connected) {
            val input =  ""
            if ("" == input) {
                write(" \n")
            }
        }
         var nextParagraph = 0
        while(reader.hasNextLine()) {
            if (nextParagraph < 1) {
                val plainText = decodeText(reader.nextLine())
                print(plainText)
                fullOutput.add(plainText)
                nextParagraph++
                //                  return plainText
            } else {
                println("\n")
                nextParagraph = 0


            }
        }
 //        connected = false
  //       reader.close()
   //      connection.close()
        return fullOutput
    }


}