package com.example.client_test

import Client
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


 class MainActivity : AppCompatActivity() {
     var info = arrayOf<String>("Po pierwsze bezpieczeństwo, czyli urzędowe życie e-Seniora",
             "https://www.gov.pl/web/koronawirus/po-pierwsze-bezpieczenstwo-czyli-urzedowe-zycie-e-seniora",
             "Zalecenia dla dyrektorów szkół i placówek ze stref czerwonej i żółtej",
             "https://www.gov.pl/web/koronawirus/zalecenia-dla-dyrektorow-szkol-i-placowek-ze-stref-czerwonej-i-zoltej",
             "Dobre praktyki Domów Pomocy Społecznej w czasie pandemii",
             "https://www.gov.pl/web/koronawirus/dobre-praktyki-domow-pomocy-spolecznej-w-czasie-pandemii",
             "Zero tolerancji dla nieprzestrzegających zasad bezpieczeństwa",
             "https://www.gov.pl/web/koronawirus/zero-tolerancji-dla-nieprzestrzegajacych-zasad-bezpieczenstwa",
             "Rekordowy budżet w 2021 roku na rozwój polskiego sportu w cieniu pandemii koronawirusa",
             "https://www.gov.pl/web/koronawirus/rekordowy-budzet-w-2021-roku-na-rozwoj-polskiego-sportu-w-cieniu-pandemii-koronawirusa",
             "Edukacja muzealna (stacjonarna) w warunkach pandemii – dobre praktyki",
             "https://www.gov.pl/web/koronawirus/edukacja-muzealna-stacjonarna-w-warunkach-pandemii--dobre-praktyki",
             "Więcej łóżek dla pacjentów z COVID-19 i zaostrzenie obostrzeń w powiatach",
             "https://www.gov.pl/web/koronawirus/wiecej-lozek-dla-pacjentow-z-covid-19-i-zaostrzenie-obostrzen-w-powiatach",
             "Komunikat MSZ dotyczący rozporządzenia ws. zakazów w ruchu lotniczym",
             "https://www.gov.pl/web/koronawirus/komunikat-msz-dotyczacy-rozporzadzenia-ws-zakazow-w-ruchu-lotniczym6",
             "Rozpoczynamy nabór wniosków do programu ratowania firm w trudnościach ekonomicznych – tzw. Polityki Nowej Szansy",
             "https://www.gov.pl/web/koronawirus/httpswwwgovplwebrozwojrozpoczynamy-nabor-wnioskow-do-programu-ratowania-firm-w-trudnosciach-ekonomicznych--tzw-polityki-nowej-szansy",
             "STOP COVID – ProteGO Safe w nowych wersjach",
             "https://www.gov.pl/web/koronawirus/stop-covid--protego-safe-w-nowych-wersjach"
     )
    @Volatile private var  crawler_output = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var client = Client("192.168.1.77",10201)
        var output = client.read()
        print(output)

        val adapter=  ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, info);
        val text = findViewById<ListView>(R.id.links)
        text.setMovementMethod
        text.setAdapter(adapter)
    }

 }



