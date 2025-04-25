package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val odev_ornegi1 = Odev_2()
    val sonuc1 = odev_ornegi1.soru1(30.2)
    println("Cevap : $sonuc1")

    val odev_ornegi2 = Odev_2()
    odev_ornegi2.soru2(3,2)

    val odev_ornegi3 = Odev_2()
    val sonuc3 = odev_ornegi3.soru3(4)
    println("Cevap : $sonuc3")

    val odev_ornegi4 = Odev_2()
    odev_ornegi4.soru4("Palmiye")

    val odev_ornegi5 = Odev_2()
    val sonuc4 = odev_ornegi4.soru5(3)
    println("Cevap : $sonuc4")

    val odev_ornegi6 = Odev_2()
    val sonuc5 = odev_ornegi6.soru6(15)
    println("Cevap : $sonuc5")

    val odev_ornegi7 = Odev_2()
    val sonuc6 = odev_ornegi7.soru7(40)
    println("Cevap : $sonuc6")

}