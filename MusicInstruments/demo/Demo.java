package demo;

import musicInstruments.Duhovi;
import musicInstruments.Duhovi.DuhoviInstr;
import musicInstruments.Elektronni;
import musicInstruments.Elektronni.ElektronniInstr;
import musicInstruments.Klavishni;
import musicInstruments.Klavishni.KlavishniInstr;
import musicInstruments.MusicInstrument;
import musicInstruments.Strunni;
import musicInstruments.Strunni.StrunniInstr;
import musicInstruments.Udarni;
import musicInstruments.Udarni.UdarniInstr;
import musicShop.MusicShop;

public class Demo {

	public static void main(String[] args) {
		
		MusicInstrument strunen = new Strunni(StrunniInstr.KITARA, "Deviser L- 840 Zebrawood", 249.90, 2);
		MusicInstrument strunen2 = new Strunni(StrunniInstr.KITARA, "Fender Squier", 249.90, 5);
		MusicInstrument strunen3 = new Strunni(StrunniInstr.KITARA, "Fender CD-60SCE ALL MAH", 560, 4);
		MusicInstrument strunen4 = new Strunni(StrunniInstr.CIGULKA, "Stagg VN-4/4 XHG ", 1015, 5);
		MusicInstrument duhov = new Duhovi(DuhoviInstr.FLEITA, "Artemieva AFL 111", 784, 3);
		MusicInstrument duhov2 = new Duhovi(DuhoviInstr.KLARINET, "SCL-20 Bb German System", 405, 3);
		MusicInstrument duhov3 = new Duhovi(DuhoviInstr.TROMPET, "Jupiter JTR-410", 427, 4);
		MusicInstrument elektronni = new Elektronni(ElektronniInstr.BAS_KITARA, "Yamaha TRBX204", 538, 5);
		MusicInstrument elektronni2 = new Elektronni(ElektronniInstr.BAS_KITARA, "LTD F-105", 960, 3);
		MusicInstrument elektronni3 = new Elektronni(ElektronniInstr.SINTEZATOR, "Yamaha YPT-255", 253, 6);
		MusicInstrument klavishni = new Klavishni(KlavishniInstr.PIANO, "Niendorf", 1590, 1);
		MusicInstrument klavishni2 = new Klavishni(KlavishniInstr.AKORDEON, "Hohner-Tango VC", 700, 3);
		MusicInstrument udarni = new Udarni(UdarniInstr.BARABANI, "ALESIS COMPACT 7", 280, 7);
		
		MusicShop magazin = new MusicShop();
		magazin.addInstruments(strunen3);
		magazin.addInstruments(strunen);
		magazin.addInstruments(strunen2);
		magazin.addInstruments(strunen4);
		magazin.addInstruments(duhov);
		magazin.addInstruments(klavishni2);
		magazin.addInstruments(duhov2);
		magazin.addInstruments(elektronni2);
		magazin.addInstruments(elektronni);
		magazin.addInstruments(duhov3);
		magazin.addInstruments(klavishni);
		magazin.addInstruments(udarni);
		magazin.addInstruments(elektronni3);
		
		magazin.sellInstrument(strunen2, 5);
		magazin.sellInstrument(duhov, 3);
		magazin.sellInstrument(elektronni3, 2);
		
		magazin.printListWithInstruments();
		
		magazin.spravkiZaRabota();
	
		
	}
}
