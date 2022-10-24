
public class StaticKullanimi {

	private static int deger1 = 5;
	int deger2 = 6;
	static int deger3 = 12;
	static int  deger4 = 2;
	
	public int toplam() {
		return deger1 + deger2;
	}
	public static int carp(){
		return deger3 * deger4;
	}
	public int getDeger1() {
		return deger1;
	}
	public static void setDeger1(int deger1) {
		StaticKullanimi.deger1 = deger1;
	}
	
	
}
