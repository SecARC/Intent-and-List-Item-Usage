package com.example.week06_lecture.Service;

import com.example.week06_lecture.Model.Drink;
import com.example.week06_lecture.R;

import java.util.ArrayList;

public class DrinkService {
    public static final String EXTRA_DRINK = "com.example.week06_lecture.EXTRA_DRINK";

    public static ArrayList<Drink> getDrinks(){
        ArrayList<Drink> list = new ArrayList<Drink>();

        list.add(new Drink("Latte",
                "Latte, İtalyanca'da Süt anlamına gelmektedir. Asıl adı Caffe Latte Machiatodur. Espresso, buharla ısıtılmış kıvamlı süt dolu bir kupaya eklenir. Genellikle ince ve uzun bardakta servis edilir. İsteğe göre üzerine süt köpüğü ve tatlı krema eklenir.",
                R.drawable.latte));
        list.add(new Drink("Cappuccino",
                "Cappuccino, İtalyan yapımı bir kahve türüdür. Espresso ve sıcak sütün kaynatılmasıyla meydana gelir.",
                R.drawable.cappuccino));
        list.add(new Drink("Turkish Coffee",
                "Türk kahvesi, daha çok Türk kültüründe önemli yere sahip Osmanlı İmparatorluğu'dan günümüze kadar gelmiş en eski kahve hazırlama ve pişirme metotlarındandır. Kendine has tadı, köpüğü, kokusu, sunuluş biçimiyle özgün bir kimliği ve geleneği vardır. Telvesi ile ikram edilen tek kahve türüdür.",
                R.drawable.turkishcoffee));

        return list;
    }
}
