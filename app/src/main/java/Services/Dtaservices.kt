package Services

import model.Category
import model.Product

object Dtaservices {

    val catagories = listOf(
        Category("SHIRTS", "shirt image"),
        Category("HODDIES", "hoddie image"),
        Category("HATS", "hat image"),
        Category("DIGITAL", "digital image")

    )

    val hats = listOf(
        Product("Devslopes benny graphic", "$18","hat01"),
        Product("Devslopes hat black", "$20","hat02"),
        Product("Devslopes hat whote", "$18","hat03"),
        Product("Devslopes hat snapback", "$22","hat04")
    )
    val hoodies = listOf(
        Product("Devslopes hoddie grey","$28","hoddie01"),
        Product("Devslopes hoddie red","$32","hoddie02"),
        Product("Devslopes grey hoddie ","$28","hoddie03"),
        Product("Devslopes hoddie black","$28","hoddie04")
    )
    val shirts = listOf(
        Product("Devslopes shirt black","$18","shirt01"),
        Product("Devslopes badge light red","$20","shirt02"),
        Product("Devslopes logo shirt red ","$22","shirt03"),
        Product("Devslopes hustle","$22","shirt04"),
        Product("Kickflip studio", "$18", "shirt05")
    )
}