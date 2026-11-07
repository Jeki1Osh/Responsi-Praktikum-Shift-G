public class Main {
    public static void main(String[] args){
        mobilSedan mobil1 = new mobilSedan("avanza", 4,5);
        mobilSport mobil2 = new mobilSport("McLaren",4,2);

        mobil1.namaMerek();
        mobil1.statusMobil();
        mobil1.setMesin(true);
        mobil1.statusMobil();

        mobil2.namaMerek();
        mobil2.statusMobil();
        mobil2.setMesin(true);
        mobil2.statusMobil();
        mobil2.nyalakanSportMode();
        mobil2.statusMobil();
        mobil2.matikanSportMode();
        mobil2.statusMobil();
    }
}
