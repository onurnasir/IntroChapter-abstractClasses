public abstract class GameCalculator {
    /*public void hesapla(){
        System.out.println("Puanınız : 100");
    }*/

    public abstract void hesapla(); //Bu kullanımda tüm extends olan class'lar hesapla'yı kullanacak ama kendine göre override etmek zorundadır.Yani kendi bloğunu yazmalıdır.
    //Buarada birden fazla abstact kullanımı ve final yapıları tek bir classta olabilir.Herhangi bir sınırlama yoktur.
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
