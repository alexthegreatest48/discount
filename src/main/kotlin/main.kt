fun main() {
    val cart = 1000
    val discount_amount1 = 100
    val discount_amount2 = 5
    val discount_mon = 1
    val monthly = true;

    var cart_price = if (cart <= 1000) cart else if (cart > 1000 && cart <= 10000) cart - discount_amount1 else cart * (1-discount_amount2)

    if (monthly == true){
        cart_price = cart_price * (1-discount_mon)
    }

    println(cart_price)
}