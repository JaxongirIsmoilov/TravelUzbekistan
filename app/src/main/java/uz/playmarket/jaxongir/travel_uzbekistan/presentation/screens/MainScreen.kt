package uz.playmarket.jaxongir.travel_uzbekistan.presentation.screens

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.playmarket.jaxongir.travel_uzbekistan.R
import uz.playmarket.jaxongir.travel_uzbekistan.data.PlaceData
import uz.playmarket.jaxongir.travel_uzbekistan.data.placeList
import uz.playmarket.jaxongir.travel_uzbekistan.databinding.ScreenMainBinding
import uz.playmarket.jaxongir.travel_uzbekistan.domain.repository.PlaceClickListener
import uz.playmarket.jaxongir.travel_uzbekistan.presentation.adapter.ItemAdapter

class MainScreen : Fragment(R.layout.screen_main), PlaceClickListener {
    private lateinit var binding: ScreenMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadPlaces()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = ScreenMainBinding.bind(view)
        binding.recycle.adapter = ItemAdapter(placeList, ) {
            Log.d("TTT", "onViewCreated:worked ")
            onClick(it)
        }
        binding.infoBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreen_to_infoScreen)
        }
    }

    private fun loadPlaces() {
        val book1 = PlaceData(
            R.drawable.bukhara_old_town,
            "Bukhara Old Town",
            "Location: Bukhara",
            "A relaxed excursion in the old town with descriptions of eye-catching monuments, centuries-old crafts and unique traditions. Features coffee breaks and a vehicle where necessary. Travellers will see how the history of Bukhara developed over 2000 centuries with the influence of the Great Silk Road Islam. The excursion will also describe the principles of trade based on Islam which can be experienced by interacting with craftsmen who sell their own products."
        )
        placeList.add(book1)

        val book2 = PlaceData(
            R.drawable.registon,
            "Registon",
            "Location: Samarkand",
            "Located in the center of Samarkand, the Registan Square with its medieval edifices is certainly one of the most impressive squares in the world." +

                    "The legend has it that the square was a place of public executions from the 15th to the early 20th centuries, and they strew it with sand to absorb the blood shed there. Therefore, the square was named Registan: reg (‘sand’) and stan (‘place’) - ‘a sand place’. It was also a place where people, summoned with trumpets, gathered to listen to government decrees announced. Initially, at the beginning of the 15th century, the square did not have the grand madrasahs standing on its three sides today. (A madrasah is an Islamic college; also spelled madrasa, madarasaa, medresa, madrassa, madraza, madarsa, medrese.) They were built later, in the 15th and the 17th centuries.The Registan Square, paved with fired bricks and cobbles, and the architectural ensemble of its three edifices, masterpieces of medieval Islamic architecture, have been UNESCO World Heritage Sites since 2001. The central building of the ensemble is Tilla-Qori Madrasah (also spelled Tilla-Kori, Tillya-Kori, Tilya-Kori, Tilla-Kori); Ulugbek Madrasah (also spelled Ulugh Beg, Ulughbeg, Ulugh-Beg) and Sher-Dor Madrasah (also spelled Sher Dor, Sherdor, Shir Dor, Shirdor) stand to the left and right of it respectively." +

                    "The madrasahs date from different times. Ulugbek Madrasah, the earliest of them, was built in 1417 - 1420 by order of Ulugbek, Tamerlane’s grandson. Two centuries later, by order of Samarkand governor Yalangtush Bahadur (also spelled Yalangtush Bakhodur, Yalangtosh Bahodir) Sher-Dor Madrasah and Tilla-Qori Madrasah were built. They replaced the khanaka (a Sufi hospice and monastery; also spelled khanqah, khaniqah, khanqa, khaneqa, khanegah, khaneqah) and the caravanserai that had been built under Ulugbek. Each of the madrasahs features unique decorations: fascinating tile mosaics, delicate stone carvings, splendid gilt ceilings, etc." +

                    "There was a period when Registan Square madrasahs stayed in a state of disrepair and were empty. In the 17th - 18th centuries, Samarkand was in crisis: the khanate’s capital had been moved to Bukhara, and the Silk Road highway passing through the city had ceased to function. At the end of the 18th century Samarkand came back to normal life again, with a lot of shops and other small facilities opened in the square. In 1875, the square was leveled and paved, and became the major city center again." +

                    "Today various festivals, holidays and shows are held in the square. The madrasahs have been fully restored by now and are open for visitors. There is a number of shops offering local handicrafts housed in them."
        )
        placeList.add(book2)

        val book3 = PlaceData(
            R.drawable.shahizinda,
            "Shah i Zinda",
            "Location: Samarkand",
            "A shrine to Qusam, a cousin of the Prophet Mohammed, existed here on the edge of Afrosiab for around seven centuries before Timur (Tamerlane) and later Ulugbek buried their family and favourites near the sanctity of the original shrine." +
                    "The most beautiful tomb is the Shodi Mulk Oko Mausoleum (1372), resting place of a sister and niece of Timur, second on the left after the entry stairs. The exquisite majolica and terracotta work here – notice the minuscule amount of space between the tiles – was of such exceptional quality that it merited almost no restoration." +
                    "After remarkably surviving more than seven centuries with only minor touch-up work, many of the tombs were aggressively and controversially restored in 2005. As a result, much of the brilliant mosaic, majolica and terracotta work you see today is not original." +
                    "Shah-i-Zinda is an important place of pilgrimage, so enter with respect and dress conservatively. Just outside the entrance are the foundations of a 15th-century tahorathana (bathhouse). At the end of the pathway between the mausoleums, the complex opens up into Samarkand's main cemetery, which is a fascinating place to walk."
        )
        placeList.add(book3)

        val book4 = PlaceData(
            R.drawable.bakhouddin,
            "Bahauddin Naqshband Complex",
            "Location: Bukhara",
            "At a distance of 12 km from Bukhara there is a memorial complex of the Islamic saint Baha-ud-Din Naqshband (also spelled Bakhautdin Nakshbandi), the famous Asian philosopher and Sufi. The complex is a Muslim shrine where pilgrims from all the parts of the Islamic world come. Once the village Kasri Orifon was located at the site of the complex. It was famous for its pagan holidays and ancient customs…" +
                    "Baha-ud-Din Naqshband lived in 1318 - 1389. He founded a Sufi order, which was later named Naqshbandi (also spelled Naqshbandiyyah, Naksibendi, Naksbandi, Nakshbandi) after him. His teachings became a polestar for many Asian people of the time and still remains topical today. The principle Baha-ud-Din Naqshband followed all his life is quite simple: ‘let the heart be with God and the hands be with work.’ It is also reflected in the symbol of the order - a heart with the word Allah inside. Baha-ud-Din Naqshband was the spiritual adviser of the great Tamerlane and taught him to be modest, decent and kind." +
                    "The famous Sufi made 32 hajj pilgrimages to Mecca, and today his mausoleum is also a Central Asian ‘Mecca’. They believe that if one walks to the mausoleum from Bukhara three times, it will equal one hajj. Believers from many Muslim countries got together at the site to pray, asking forgiveness for their sins and asking for fulfillment of their wishes."
        )
        placeList.add(book4)

        val book5 = PlaceData(
            R.drawable.itchan_kala,
            "Itchan Kala",
            "Location: Xorazm",
            "Itchan Kala is the inner town (protected by brick walls some 10 m high) of the old Khiva oasis, which was the last resting-place of caravans before crossing the desert to Iran. Although few very old monuments still remain, it is a coherent and well-preserved example of the Muslim architecture of Central Asia. There are several outstanding structures such as the Djuma Mosque, the mausoleums and the madrasas and the two magnificent palaces built at the beginning of the 19th century by Alla-Kulli-Khan."
        )
        placeList.add(book5)

        val book6 = PlaceData(
            R.drawable.labihovuz,
            "Lyabi-Khauz",
            "Location: Bukhara",
            "Architectual ensemble Lyabi-Khauz is formed with three large monumental buildings: Kukeldash Madrasah in the north, khanaka and Nodir Divan-begi in the west and in the east. From the south the square was closed with Trade Street. The center of old Bukhara large ensemble became a reservoir." +
                    "The name «Lyabi-Khauz» means «at reservoir». According to the old legend, for a long time knan gardener Nadir Divan-begi could not buy a lot for planned building, where a house of alone woman was. Then all-powerful vizier ordered to built a channel under women's house, and the water began to washaway walls, unhappy women had to sell this lot. The khan hauz secretly was called «khauz of violence», what in arabian inscription gives numerical meaning of building date - 1620." +
                    "The khauz rectangular (36 – 46 meters height), stretched from the east to the west, is buried in shadow of venerable chinaras. Its shores are formed with stair launch to the water, made from massive blocks of yellow limestone. In old times there was «tea bazar», there sold sweets, dainties, bread and made food."
        )
        placeList.add(book6)

        val book7 = PlaceData(
            R.drawable.ulugbek_observatory,
            "Ulugbek Observatory",
            "Location: Samarkand",
            "Among historical monuments of Samarkand observatory takes particular place, constructed by Ulugbek in 1428-1429 on one of the hills on height, at the bottom of Chupanata altitude." +
                    "By Babur’s words, which saw the observatory, it was three-storied covered with beautiful glazed titles building of round form 46 meters in diameter, 30 meters in height. In the main hall huge instrument was placed for observations of Moon, Sun, and other stars of the vault of heaven." +
                    "Observatory was unique construction for its time.The basis of observatory was giant goniometer vertical circle), radius of circle was equal 40,212 meters, and the length of arc was 63 meters. The main instrument-sextant was oriented with amazing exactness by line of meridian from south to north."
        )
        placeList.add(book7)

//        placeList.add(book1)
//        placeList.add(book2)
//        placeList.add(book3)
//        placeList.add(book4)
//        placeList.add(book5)
//        placeList.add(book6)
    }

    override fun onClick(placeData: PlaceData) {
        val action = MainScreenDirections.actionMainScreenToDetailsScreen(placeData)
        findNavController().navigate(action)
    }
}