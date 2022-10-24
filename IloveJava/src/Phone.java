import java.awt.Toolkit;

public class Phone {
	
	private String marka;
	private String model;
	private int ram = 8;
	private int hafiza = 256;
	private int fiyat = 13400;
	private boolean durum;
	private int sesDuzeyi = 0;
	
	public Phone(){
		durum = false;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHafiza() {
		return hafiza;
	}

	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	public boolean isDurum() {
		return durum;
	}

	public void setDurum(boolean durum) {
		this.durum = durum;
	}

	public int getSesDuzeyi() {
		return sesDuzeyi;
	}

	public void setSesDuzeyi(int sesDuzeyi) {
		this.sesDuzeyi = sesDuzeyi;
	}

	
	
	public void telefonuAc() {
		if(durum == false) {
			durum = true;
			System.out.println("Telefon açýk");
			Toolkit.getDefaultToolkit().beep();
		}
		else
			System.out.println("Telefon açýk");
	}
	public void telefonuKapat() {
		if(durum == false)
			System.out.println("Telefon kapalý");
		else {
			durum = false;
			System.out.println("Telefon kapandý");
		}
			
	}
	public void sesAc() {
		if(sesDuzeyi < 10) {
			sesDuzeyi++;
			System.out.println(sesDuzeyi);
		}
		else {
			System.out.println("Maksimum ses düzeyi");
		}
	}
	public void sesKis() {
		if(sesDuzeyi <= 0) {
			System.out.println("Minimum ses düzeyi");
		}
		else {
			sesDuzeyi--;
			System.out.println(sesDuzeyi);
		}
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
	
	
	
	
	
}
