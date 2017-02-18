package musicInstruments;

import musicShop.MusicShop.MusicInstruments;

public class Strunni extends MusicInstrument{

	public enum StrunniInstr implements IMusicInstruments{CIGULKA, VIOLA, KONTRABAS, ARFA, KITARA, GUDULKA}
	
	public Strunni(StrunniInstr instr, String name, double price, int capacity) {
		super(instr, MusicInstruments.STRUNNI, name, price, capacity);
	}

	
}
