import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char []kullaniciCevaplari = new char[5];
		char []dogruCevaplar = {'B','C','A','D','A'};
		int soruSayisi=0;
		int dogruSayaci=0;
		
		while(soruSayisi!=5) {
			int i=0;
			soru1();
			char cevap =scan.next().charAt(0);
			if(cevap == dogruCevaplar[i]) {
				System.out.println("Do�ru");
				kullaniciCevaplari[i] = cevap;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanl��");
				kullaniciCevaplari[i] = cevap;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru2();
			char cevap2 =scan.next().charAt(0);
			if(cevap2 == dogruCevaplar[i]) {
				System.out.println("Do�ru");
				kullaniciCevaplari[i] = cevap2;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanl��");
				kullaniciCevaplari[i] = cevap2;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru3();
			char cevap3 =scan.next().charAt(0);
			if(cevap3 == dogruCevaplar[i]) {
				System.out.println("Do�ru");
				kullaniciCevaplari[i] = cevap3;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanl��");
				kullaniciCevaplari[i] = cevap3;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru4();
			char cevap4 =scan.next().charAt(0);
			if(cevap4 == dogruCevaplar[i]) {
				System.out.println("Do�ru");
				kullaniciCevaplari[i] = cevap4;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanl��");
				kullaniciCevaplari[i] = cevap4;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			
			soru5();
			char cevap5 =scan.next().charAt(0);
			if(cevap5 == dogruCevaplar[i]) {
				System.out.println("Do�ru");
				kullaniciCevaplari[i] = cevap5;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanl��");
				kullaniciCevaplari[i] = cevap5;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
	}
		if(dogruSayaci == 5) {
			System.out.println("M�kemmel");
		}
		else if(dogruSayaci == 4) {
			System.out.println("�ok �yi");
		}
		else {
			System.out.println("K�resel �s�nma hakk�nda bilgilerinizi tazeleme zaman�");
		}
		System.out.println();
		System.out.println("KULLANICININ CEVAPLARI");
		System.out.println("*************************");
		for(char i : kullaniciCevaplari) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		System.out.println("DO�RU CEVAPLAR");
		System.out.println("*************************");
		for(char i : dogruCevaplar) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		

	}
	public static void soru1() {
		System.out.println("Hangi gezegenin atmosferi k�resel �s�nma ile yok edilmektedir?");
		System.out.println("A-J�piter\nB-Ven�s\nC-Mars\nD-Merk�r");
		
	}
	public static void soru2() {
		System.out.println("K�resel �s�nmaya kar�� en savunmas�z hayvan hangisidir?");
		System.out.println("A-Kar Leopar�\nB-Kutup Ay�s�\nC-Deniz Gergedan�\nD-Tukan");
		
	}
	public static void soru3() {
		System.out.println("Hangisi k�resel �s�nman�n bir etkisi olabilir?");
		System.out.println("A-Deniz seviyesinin y�kselmesi\nB-Daha fazla ada tar�m�\nC-Daha �ok volkanik p�sk�rme\nD-Daha fazla heyelan ger�ekle�mesi");
		
	}
	public static void soru4() {
		System.out.println("A�a��dakilerden hangisi toksik bir sera gaz�d�r?");
		System.out.println("A-Nitrojen\nB-Oksijen\nC-Karbonmonoksit\nD-Metan");
		
	}
	public static void soru5() {
		System.out.println(" Kirlilik havaya yay�ld�k�a ne azal�r?");
		System.out.println("A-Ozon tabakas�\nB-Okyanuslar\nC-Ya�mur ormanlar�\nD-Karbondioksit");
		
	}

}

