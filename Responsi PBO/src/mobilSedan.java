public class mobilSedan extends Kendaraan{
    private final int pintu = 4;

    mobilSedan(String merek, int roda, int kursi){
        super(merek, roda, kursi);
    }

    @Override
    public void statusMobil() {
        if (!Mesin){
            System.out.println("Mobil dalam keadaan mati");
        }
        else{
            System.out.println("Mobil dalam keadaan menyala");
        }
    }
}
