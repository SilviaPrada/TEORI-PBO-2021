package Exercise1;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int tunjangan, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji(){
        return gaji;
    }
    
    public int getTunjangan() {
        return tunjangan;
    }
}
