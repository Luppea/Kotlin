package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev_2 {
    fun soru1(derece: Double) : Double {
        return derece * 1.8 + 32
    }

    fun soru2(uzunkenar: Int,kisakenar: Int) {
        val cevre = 2*(uzunkenar + kisakenar)
        println("Cevap : $cevre")
    }

    fun soru3(sayi: Int): Int {
        var faktoriyel = 1
        for (i in 1..sayi) {
            faktoriyel *= i
        }
        return faktoriyel
    }

    fun soru4(kelime: String){
        val uzunluk = kelime.length
        println("Cevap : $uzunluk")
    }

    fun soru5(kenar_sayisi: Int) : Int {
        return (kenar_sayisi - 2) * 180
    }

    fun soru6(gun_sayisi: Int) : Int {
        if(gun_sayisi > 20){
            val calisma_ucreti = 1600
            val mesai_ucreti = 20*8*(gun_sayisi - 20)
            return (calisma_ucreti + mesai_ucreti)
        }else{
            val calisma_ucreti = gun_sayisi*8*10
            return calisma_ucreti
        }
    }

    fun soru7(kota_miktari: Int) : Int {
        if (kota_miktari > 50){
            val asim_ucreti = (kota_miktari-50)*4
            return 100 + asim_ucreti
        }else{
            return 100
        }
    }


}