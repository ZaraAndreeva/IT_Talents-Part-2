package musicInstruments;

import musicShop.MusicShop.MusicInstruments;

public class Elektronni extends MusicInstrument{
	
	public enum ElektronniInstr implements IMusicInstruments{SINTEZATOR, BAS_KITARA, ELEKTRICHESKA_CIGULKA}
	
	public Elektronni(ElektronniInstr instr, String name, double price, int capacity) {
		super(instr, MusicInstruments.ELEKTRONNI, name,  price, capacity);
	}

	



}
