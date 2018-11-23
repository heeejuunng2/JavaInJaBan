package day1024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Pokemon implements Comparable<Pokemon>{
	String name;
	int lv,hp;
	
	Pokemon(String name,int lv,int hp) {
		this.name = name;
		this.lv = lv;
		this.hp = hp;
	}
	@Override
	public String toString() {
		return name+"/LV."+lv+"/HP."+hp;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pokemon) {
			Pokemon p = ((Pokemon)obj);
			return name.equals(p.name)&&lv==p.lv&&hp==p.hp;
			//true
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (name+hp+lv).hashCode();
	}
	
	//ÀÌ¸§¼ø Á¤·Ä, ÀÌ¸§ÀÌ °°À¸¸é lv³ôÀº¼ø, lvµµ °°À¸¸é Ã¼·Â ³ôÀº¼ø
	@Override
	public int compareTo(Pokemon o) {
		if(name.equals(o.name)) {
			if(lv==o.lv) {
				return o.hp-hp;
			}
			return o.lv-lv;
		}
		return name.compareTo(o.name);
	}
	
}//end of Pokemon class

public class PokemonEx01 {//main class

	public static void main(String[] args) {
		HashSet<Pokemon> hs = new HashSet<>();
		
		hs.add(new Pokemon("ÇÇÄ«Ãò", 1, 10));
		hs.add(new Pokemon("Çª¸°", 2, 100));
		hs.add(new Pokemon("¸Á³ª´¨", 1, 1000));
		hs.add(new Pokemon("Åä°ÔÇÇ", 10, 100));
		hs.add(new Pokemon("¸Á³ª´¨", 5, 10));
		hs.add(new Pokemon("ÇÇÄ«Ãò", 1, 10000));
		hs.add(new Pokemon("Çª¸°", 2, 100));
		
		Iterator<Pokemon> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("======TreeSet======");
		TreeSet<Pokemon> ts = new TreeSet<>();
		
		ts.add(new Pokemon("ÇÇÄ«Ãò", 1, 10));
		ts.add(new Pokemon("Çª¸°", 2, 100));
		ts.add(new Pokemon("¸Á³ª´¨", 3, 1000));
		ts.add(new Pokemon("Åä°ÔÇÇ", 10, 100));
		ts.add(new Pokemon("¸Á³ª´¨", 5, 10));
		ts.add(new Pokemon("ÇÇÄ«Ãò", 1, 10000));
		ts.add(new Pokemon("Çª¸°", 2, 100));
		
		it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}//end of main method

}//end of main class
