package com.example.goodhealth.models

class Product {

    var name:String = ""
    var price:String = ""
    var location:String = ""
    var email:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String,  price: String,location: String,email: String, imageUrl: String, id: String) {
        this.name = name
        this.price = price
        this.location= location
        this.email= email
        this.imageUrl = imageUrl
        this.id = id
    }

}