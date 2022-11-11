package Hafta6lab;

import java.util.HashMap;
import java.util.Scanner;

public class AnketHashIle {
	
	
	public static String Maxed(HashMap<String, Integer> puanlar) {
		int max = 0;
		String soru = null;
		for (String i : puanlar.keySet()) {
			if (puanlar.get(i) > max) {
				max = puanlar.get(i);
				soru = i;
			}
		}
		
		return soru;
	}
	
	public static String Mined(HashMap<String, Integer> puanlar) {
		int min = 11;
		String soru = null;
		for (String i : puanlar.keySet()) {
			if (puanlar.get(i) < min) {
				min = puanlar.get(i);
				soru = i;
			}
		}
		
		return soru;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int puan;
		String istek;
		HashMap<String, Integer> puanlar = new HashMap<String, Integer>();
		puanlar.put("kuresel ne kadar onemli?", 0);
		puanlar.put("siyaset ne kadar onemli?", 0);
		puanlar.put("enerji kaynaklari ne kadar onemli?", 0);
		puanlar.put("teknolojik gelisim ne kadar onemli?", 0);
		puanlar.put("kultur ne kadar onemli?", 0);
		int girenkisi=0;
		
		while (true) {
			System.out.print("Forma baslamak icin (b) cikmak icin (q)");
			istek = s.next();
			if (istek.equals("q")) {
				System.out.print("en yuksek puan: "+Maxed(puanlar)+ 
						"aldigi puan :"+ puanlar.get(Maxed(puanlar))+"\n");
				System.out.print("en dusuk puan: "+Mined(puanlar)+
						"aldigi puan: "+ puanlar.get(Mined(puanlar))+"\n");
				
			}
				
			
			if (istek.equals("b")) {
				if (girenkisi == 0)
					girenkisi=1;
				else {
					girenkisi--;
				}
				
				for (String i : puanlar.keySet()) {
					int currentpuan = puanlar.get(i);
					System.out.println(i+ "aldigi puan ort: "+puanlar.get(i)/girenkisi);
					puan = s2.nextInt();
					if (puan > 10 || puan < 0) {
						System.out.println("lütfen 1 ile 10 arasinda bir deger girin >\n");
						while (puan > 10 || puan < 0)
							
							puan = s2.nextInt();
							continue;
					}
					
					currentpuan += puan;
					puanlar.put(i, currentpuan);
					
				}
			}
			
			
			girenkisi++;
		}
	}
	
	
	
	
	
}
