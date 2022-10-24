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
				System.out.println("Doðru");
				kullaniciCevaplari[i] = cevap;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlýþ");
				kullaniciCevaplari[i] = cevap;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru2();
			char cevap2 =scan.next().charAt(0);
			if(cevap2 == dogruCevaplar[i]) {
				System.out.println("Doðru");
				kullaniciCevaplari[i] = cevap2;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlýþ");
				kullaniciCevaplari[i] = cevap2;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru3();
			char cevap3 =scan.next().charAt(0);
			if(cevap3 == dogruCevaplar[i]) {
				System.out.println("Doðru");
				kullaniciCevaplari[i] = cevap3;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlýþ");
				kullaniciCevaplari[i] = cevap3;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			soru4();
			char cevap4 =scan.next().charAt(0);
			if(cevap4 == dogruCevaplar[i]) {
				System.out.println("Doðru");
				kullaniciCevaplari[i] = cevap4;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlýþ");
				kullaniciCevaplari[i] = cevap4;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
			
			
			soru5();
			char cevap5 =scan.next().charAt(0);
			if(cevap5 == dogruCevaplar[i]) {
				System.out.println("Doðru");
				kullaniciCevaplari[i] = cevap5;
				i++;
				soruSayisi++;
				dogruSayaci++;
			}
			else {
				System.out.println("Yanlýþ");
				kullaniciCevaplari[i] = cevap5;
				i++;
				soruSayisi++;
			}
			System.out.println();
			
	}
		if(dogruSayaci == 5) {
			System.out.println("Mükemmel");
		}
		else if(dogruSayaci == 4) {
			System.out.println("Çok Ýyi");
		}
		else {
			System.out.println("Küresel ýsýnma hakkýnda bilgilerinizi tazeleme zamaný");
		}
		System.out.println();
		System.out.println("KULLANICININ CEVAPLARI");
		System.out.println("*************************");
		for(char i : kullaniciCevaplari) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		System.out.println("DOÐRU CEVAPLAR");
		System.out.println("*************************");
		for(char i : dogruCevaplar) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		

	}
	public static void soru1() {
		System.out.println("Hangi gezegenin atmosferi küresel ýsýnma ile yok edilmektedir?");
		System.out.println("A-Jüpiter\nB-Venüs\nC-Mars\nD-Merkür");
		
	}
	public static void soru2() {
		System.out.println("Küresel ýsýnmaya karþý en savunmasýz hayvan hangisidir?");
		System.out.println("A-Kar Leoparý\nB-Kutup Ayýsý\nC-Deniz Gergedaný\nD-Tukan");
		
	}
	public static void soru3() {
		System.out.println("Hangisi küresel ýsýnmanýn bir etkisi olabilir?");
		System.out.println("A-Deniz seviyesinin yükselmesi\nB-Daha fazla ada tarýmý\nC-Daha çok volkanik püskürme\nD-Daha fazla heyelan gerçekleþmesi");
		
	}
	public static void soru4() {
		System.out.println("Aþaðýdakilerden hangisi toksik bir sera gazýdýr?");
		System.out.println("A-Nitrojen\nB-Oksijen\nC-Karbonmonoksit\nD-Metan");
		
	}
	public static void soru5() {
		System.out.println(" Kirlilik havaya yayýldýkça ne azalýr?");
		System.out.println("A-Ozon tabakasý\nB-Okyanuslar\nC-Yaðmur ormanlarý\nD-Karbondioksit");
		
	}

}

