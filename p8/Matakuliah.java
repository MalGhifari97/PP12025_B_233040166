package p8;

public class Matakuliah {
	 private String kode;
	    private String nama;
	    private int sks;

	    public Matakuliah(String kode, String nama, int sks) {
	        this.kode = kode;
	        this.nama = nama;
	        this.sks = sks;
	    }

	    public String getKode() {
	        return kode;
	    }

	    public String getNama() {
	        return nama;
	    }

	    public int getSks() {
	        return sks;
	    }
}
