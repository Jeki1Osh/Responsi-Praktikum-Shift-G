public class mobilSport extends Kendaraan{
    private int pintu = 2;
    private boolean sportMode;

    mobilSport(String merek, int roda, int kursi){
        super(merek, roda, kursi);
    }

    public boolean isSportMode(){
        return sportMode;
    }

    public void setSportMode(boolean mode){
        this.sportMode = mode;
    }

    public void nyalakanSportMode(){
        if (!isSportMode()){
            setSportMode(true);
            System.out.println("Mobil dipindah dalam mode Sport.");
        }
        else {
            System.out.println("Mobil dalam keadaan mode Sport.");
        }
    }
    public void matikanSportMode(){
        if (!isSportMode()){
            System.out.println("Mobil dipindah dalam mode Eco.");
        }
        else {
            setSportMode(false);
            System.out.println("Mobil dalam keadaan mode Eco.");
        }
    }

    @Override
    public void statusMobil() {
        if (!Mesin){
            System.out.println("Mesin dalam keadaan mati.");
        }
        else {
            if (isSportMode()){
                System.out.println("Mobil dalam keadaan menyala dan telah di-set mode Sport.");
            }
            else {
                System.out.println("Mobil dalam keadaan menyala dan telah di-set mode Eco.");
            }
        }
    }
}
