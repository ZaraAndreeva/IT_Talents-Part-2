package musicInstruments;

import musicShop.MusicShop.MusicInstruments;

public class Udarni extends MusicInstrument{

	public enum UdarniInstr implements IMusicInstruments{BARABANI, TARAMBUKA, TUPAN, DAIRE}
	
	public Udarni(UdarniInstr instr, String name, double price, int capacity) {
		super(instr, MusicInstruments.UDARNI, name, price, capacity);
	}

}
