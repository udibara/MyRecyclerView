package id.udibara.santoso.budi.myrecyclerview;

import java.util.ArrayList;

public class SahabatData {
    private static String[] sahabatNames = {
            "Sa'id Bin Zaid Ra",
            "Sawad Bin Ghaziyyah Ra",
            "Itban Bin Malik Ra",
            "Asma Binti Abu Bakar Ra",
    };

    private static String[] sahabatDetails = {
            "Nama dan nasabnya adalah Said bin Zaid bin Amr bin Nufail bin Abdul Uzza al-Adawi. Satu kabilah dengan Umar bin al-Khattab radhiallahu ‘anhu. Ia dilahirkan di Mekah 22 tahun sebelum hijrah. Termasuk salah seorang yang pertama-tama memeluk dengan perantara dakwah Abu Bakar ash-Shiddiq radhiallahu ‘anhu.",
            "Sawad bin Ghaziyyah RA adalah salah seorang Ahlul Badar, dan termasuk dari sedikit sahabat yang menemui syahidnya di medan Perang Badar itu. Pada hari berlangsungnya pertempuran ketika sedang persiapan pasukan, Nabi SAW mengatur barisan dan meluruskannya, seperti ketika meluruskan shaf-shaf shalat. Saat tiba di tempat Sawad, beliau melihat kalau posisinya agar bergeser, tidak lurus dengan anggota pasukan lainnya.",
            "Malik bin Ijlan adalah seorang dari Bani Salim, termasuk tokoh kaum Anshar. Anaknya, Itban, meminta Nabi S.A.W. untuk datang ke rumahnya dan salat di dalamnya agar dijadikan mushalla.",
            "Asma adalah saudari istri Rasulullah, Aisyah RA, namun berbeda ibu. Ia adalah saudara kandung Abdullah bin Abu Bakar. Putri Abu Bakar itu termasuk salah satu wanita di Kota Makkah yang pertama masuk Islam. Setelah 17 sahabat mengucap dua kalimah syahadat, Asma pun kemudian membaiat Rasulullah SAW."
    };

    private static int[] sahabateImages = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
    };

    static ArrayList<Sahabat> getListData() {
        ArrayList<Sahabat> list = new ArrayList<>();
        for (int position = 0; position < sahabatNames.length; position++) {
            Sahabat sahabat = new Sahabat();
            sahabat.setName(sahabatNames[position]);
            sahabat.setDetail(sahabatDetails[position]);
            sahabat.setPhoto(sahabateImages[position]);
            list.add(sahabat);
        }
        return list;
    }
}