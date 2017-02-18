package musicInstruments;

import musicShop.MusicShop.MusicInstruments;

public class Duhovi extends MusicInstrument{

	public enum DuhoviInstr implements IMusicInstruments{TROMPET, TROMBON, TUBA, FLEITA, KLARINET}

	public Duhovi(DuhoviInstr instr, String name, double price, int capacity) {
		super(instr, MusicInstruments.DUHOVI, name, price, capacity);
	}

}
