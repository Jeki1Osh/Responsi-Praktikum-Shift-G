public abstract class Kendaraan{
    protected String merek;
    protected int roda, kursi;
    protected boolean Mesin;

    Kendaraan(String merek, int roda, int kursi){
        this.merek = merek;
        this.roda = roda;
        this.kursi = kursi;
    }

    public String getMerek(){
        return merek;
    }

    public void namaMerek(){
        System.out.println(getMerek());
    }

    public void setMesin(boolean mesin){
        this.Mesin = mesin;
    }

    public abstract void statusMobil();

}
