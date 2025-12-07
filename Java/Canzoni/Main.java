class Main {
	public static void main(String[] args){
		//crea oggetto utils per poter utilizzare i suoi metodi
		Utils utils = new Utils();
		// array di canzoni
		Canzone[] arrCanzoni = {
			// Miley Cyrus
			new Canzone("Flower", 200, "Miley Cyrus"),
			new Canzone("Wrecking Ball", 246, "Miley Cyrus"),
			new Canzone("Midnight Sky", 206, "Miley Cyrus"),
			new Canzone("Plastic Hearts", 217, "Miley Cyrus"),
			new Canzone("Used to Be Mine", 214, "Miley Cyrus"),
			new Canzone("Party in the U.S.A.", 214, "Miley Cyrus"),
			new Canzone("The Climb", 203, "Miley Cyrus"),
			new Canzone("We Can't Stop", 193, "Miley Cyrus"),
			new Canzone("Adore You", 209, "Miley Cyrus"),
			new Canzone("When I Was Your Man", 189, "Miley Cyrus"),

			// Morgan Wallen
			new Canzone("Last Night", 163, "Morgan Wallen"),
			new Canzone("Whiskey Myers", 198, "Morgan Wallen"),
			new Canzone("One Thing at a Time", 174, "Morgan Wallen"),
			new Canzone("I Had Some Help", 181, "Morgan Wallen"),
			new Canzone("More Than My Hometown", 191, "Morgan Wallen"),
			new Canzone("Dangerous", 213, "Morgan Wallen"),
			new Canzone("Thought You Should Know", 186, "Morgan Wallen"),
			new Canzone("Somebody's Heartbreak", 204, "Morgan Wallen"),
			new Canzone("Chasin' You", 197, "Morgan Wallen"),
			new Canzone("Bad Habit", 195, "Morgan Wallen"),

			// SZA
			new Canzone("Kill Bill", 153, "SZA"),
			new Canzone("The Weekend", 179, "SZA"),
			new Canzone("Good Days", 210, "SZA"),
			new Canzone("Drew Barrymore", 234, "SZA"),
			new Canzone("Shirt", 195, "SZA"),
			new Canzone("Hit Different", 208, "SZA"),
			new Canzone("Open Arms", 217, "SZA"),
			new Canzone("Love Galore", 244, "SZA"),
			new Canzone("Babylon", 187, "SZA"),
			new Canzone("Garden (Say It Like Dat)", 181, "SZA"),

			// Taylor Swift
			new Canzone("Anti-Hero", 201, "Taylor Swift"),
			new Canzone("Shake It Off", 211, "Taylor Swift"),
			new Canzone("Love Story", 194, "Taylor Swift"),
			new Canzone("Blank Space", 231, "Taylor Swift"),
			new Canzone("All Too Well", 330, "Taylor Swift"),
			new Canzone("Cruel Summer", 207, "Taylor Swift"),
			new Canzone("Style", 231, "Taylor Swift"),
			new Canzone("Cardigan", 238, "Taylor Swift"),
			new Canzone("You Belong With Me", 232, "Taylor Swift"),
			new Canzone("Enchanted", 365, "Taylor Swift"),

			// Rema & Selena Gomez
			new Canzone("Calm Down", 239, "Rema & Selena Gomez"),
			new Canzone("Essence", 228, "Rema & Selena Gomez"),
			new Canzone("Persuasion", 201, "Rema & Selena Gomez"),
			new Canzone("Beamer", 247, "Rema & Selena Gomez"),
			new Canzone("Paloma", 219, "Rema & Selena Gomez"),
			new Canzone("Wave", 256, "Rema & Selena Gomez"),
			new Canzone("Neon Light", 214, "Rema & Selena Gomez"),
			new Canzone("Electric", 222, "Rema & Selena Gomez"),
			new Canzone("Moonlight", 193, "Rema & Selena Gomez"),
			new Canzone("Diamonds", 238, "Rema & Selena Gomez")
		};
		//esercizio random
		//System.out.printf("Tempo medio delle canzoni: %.2f\n",utils.mediaCanzone(arrCanzoni));
		//cdMusicale.setCanzone(arrCanzoni[1]);
		//Canzone[] album = cdMusicale.getCanzone();
		
		//carica array con i nomi dei cantanti di tipo stringa
		String[] arrCantanti = utils.listCantanti(arrCanzoni);
		//array di tipo CdMusicali con oggetti CdMusicali
		CdMusicale[] album = new CdMusicale[arrCantanti.length];
		//carica l'array
		for(int i=0; i<arrCantanti.length; i++){
			album[i] = new CdMusicale("Album di: "+ arrCantanti[i], utils.qtSingerSongs(arrCantanti[i],arrCanzoni));
		}
		//array di tipo CasaProdo composto da Oggetti CdMusicali e Lista canzoni cantanti
		CasaProd[] albums = new CasaProd[arrCantanti.length];
		//array di tipo casaprod contenente cdmusicale e lista canzoni
		for(int i=0; i<arrCantanti.length; i++){
			albums[i] = new CasaProd(album[i], utils.singerSongs(arrCantanti[i], arrCanzoni));
		}
		//stampa album e lista canzoni album
		for(int i=0; i<albums.length; i++){
			System.out.println(" ________________________________________________");
			System.out.println("|                                                |");
			System.out.println("|                 Album n: "+ (i+1) +".                    |");
			System.out.println("|________________________________________________|");
			System.out.println(" _________________");
			System.out.println("|                 \\\\");
			System.out.println("|      Nome:" + albums[i].getCdMusicale().getTitolo());
			System.out.println("|_________________//");
			


			System.out.println(" ________________________________________________");
			System.out.println("|                                                |");
			System.out.println("|                 Lista Canzoni:                 |");
			System.out.println("|________________________________________________|");
			for(int j=0; j<albums[i].getCanzone().length; j++) {
				System.out.println((j+1)+") " + albums[i].getCanzone()[j].getTitolo());
			}
		}
		
		
	}
}