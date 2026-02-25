class Bid(val amount: Int, val bidder: String) //creamos la clase Bid con sus propiedades amount y bidder

//ahora creamos la funcion auctionPrice que recibe un objeto de tipo Bid y un entero minimumPrice y devuelve un entero
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    // si el bid es nulo, devolvemos el precio minimo
        if (bid == null) {
            println("No se ha realizado ninguna oferta, el precio mínimo es $minimumPrice")
            return minimumPrice
            // si el monto de la oferta es menor que el precio minimo, devolvemos el precio minimo
        } else if (bid.amount < minimumPrice) {
            println("La oferta de ${bid.bidder} por ${bid.amount} es menor que el precio mínimo de $minimumPrice, se rechaza la oferta")
            return bid.amount


            // si el monto de la oferta es mayor o igual al precio minimo, devolvemos el monto de la oferta
        } else {
            println("La oferta de ${bid.bidder} por ${bid.amount} es aceptada, el precio final es ${bid.amount}")
            return bid.amount
        }
}
    // Fill in the code.
