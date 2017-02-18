package musicInstruments;

import musicShop.MusicShop.MusicInstruments;

public class Klavishni extends MusicInstrument{
	
	public enum KlavishniInstr implements IMusicInstruments{ORGAN, PIANO, AKORDEON}
	
	public Klavishni(KlavishniInstr instr, String name, double price, int capacity) {
		super(instr, MusicInstruments.KLAVISHNI, name, price, capacity);
	}

}
