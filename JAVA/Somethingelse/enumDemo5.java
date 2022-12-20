enum fruits {
    mango(10) , orange(30) , banana(20), apple(50) , papaya(60) ;
    int price;
    fruits(int p){
        price=p;
    }
    public int get_price(){
        return price;
    }
}
class enumDemo5{
    public static void main (String [] args){
        fruits ap, ap2, ap3;
        System.out.println("fruits constants "+ " and their ordinal values:");
        for (fruits s: fruits.values())
        System.out.println(s+" "+s.ordinal());
        ap=fruits.banana;
        ap2=fruits.orange;
        System.out.println(ap.get_price());
    }
}
