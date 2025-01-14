public class Rabatterad extends Merchandise {
    private double discountInPercent;
    public Rabatterad(String name, double pris, int stock, double discountInPercent){
        super(name, pris, stock);
        setDiscountInPercent(discountInPercent);
    }
    public double getDiscountInPercent(){
        return this.discountInPercent;
    }
    public void setDiscountInPercent(double discount){
        this.discountInPercent = discount;
    }
    public double discount(){ // discount will be used in the mask.discount, plasticKnife.discount and fakeBlood.discount just the way purchase method is made and used in the kund.purchase because they  follow the instances upon which they are built for
        if (getPris() >= 50.00){ // you get the price that this method is applied to, and if the price of the item is above 50.00, then it will apply the discount (specified in the main class as 50 percent in mask)
            setPris(getPris() * getDiscountInPercent()); // set the new price (the price of the item this method is applied to times 50 percent as stated in the main class)
        }
        return getPris(); // You return the getters and not the setters, because setters do not return
    }
}
/*
comparison
    void purchase(double priCe) { // purchase bakal di pake di kund.purchase, yang dalem purchasenya itu int double priCe, apa itu int double priCe?, priCe will access the price of each item in merchandise, so that double priCe will refer to price in Merchandise class, and not kund
        amountOfThingsBought = amountOfThingsBought + 1;
        finalPrice = finalPrice + priCe; // plasticKnife.getpris nya di ambil, di tambahkan ke priCe, jadinya 0 = 0 + 238.50 equals to finalPrixe 238.50. But the Rabatterad wants only to have the price in the merchandise so you
    }
 */
