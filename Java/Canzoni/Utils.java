class Utils {
	//
	public static void clearConsole() {

        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Impossibile pulire la console");
        }
    }
	//____

	public void listSongs(Canzone[] arr) {
		System.out.println("_________________________________________________________");
		System.out.println("|                                                        |");
		System.out.println("|                     Lista canzoni:                     |");
		System.out.println("|________________________________________________________|");
		for(int i=0; i<arr.length; i++) {
			System.out.println("________________________________________________________");
			System.out.println("|      Nome:"+arr[i].getCantante());
			System.out.println("|      Titolo:"+arr[i].getCantante());
			System.out.println("|      Durata:"+arr[i].getDurata());
			System.out.println("|________________________________________________________");
		}
	}

	public float mediaCanzone(Canzone[] arr){
		double sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i].getDurata();
		}
		return (float)(sum /= 60)/arr.length;
	}
	
	public int qtSinger(Canzone[] arrCanzone) {
		int count = 0;
		String[] cantanti = new String[arrCanzone.length];
		for(int i = 0; i < arrCanzone.length; i++){
			String cantanteCorrente = arrCanzone[i].getCantante();
			boolean trovato = false;
			for(int j = 0; j < count; j++){
				if(cantanti[j].equals(cantanteCorrente)){
					trovato = true; 
					break;
				}
			}
			if(!trovato){
				cantanti[count] = cantanteCorrente;  
				count++;  
			}
		}
		return count;
	}
	
	public String[] listCantanti(Canzone[] arrCanzone){
		
		int count = 0;
		String[] cantanti = new String[qtSinger(arrCanzone)];
		for(int i = 0; i < arrCanzone.length; i++){
			String cantanteCorrente = arrCanzone[i].getCantante();
			boolean trovato = false;
			for(int j = 0; j < count; j++){
				if(cantanti[j].equals(cantanteCorrente)){
					trovato = true; 
					break;
				}
			}
			if(!trovato){
				cantanti[count] = cantanteCorrente;  
				count++;  
			}
		}
		return cantanti;
	}

	public int qtSingerSongs(String nome, Canzone[] arrCanzone) {
		int qt = 0;
		for(int i=0; i<arrCanzone.length; i++){
			if(arrCanzone[i].getCantante().equals(nome)){
				qt++;
			}
		}
		return qt;
	}

	public Canzone[] singerSongs(String nome,Canzone[] arrCanzone) {
		Canzone[] arr = new Canzone[qtSingerSongs(nome,arrCanzone)];
		int qt = 0;
		for(int i=0; i<arrCanzone.length; i++){
			if(nome.equals(arrCanzone[i].getCantante())){
				arr[qt] = arrCanzone[i];
				qt++;
			}
		}
		return arr;
	}

	public CasaProd[] fullAlbum(Canzone[] arrCanzone, CdMusicale cdMusicale) {	
		String[] arrCantanti = listCantanti(arrCanzone);
		CasaProd[] arrAlbum = new CasaProd[listCantanti(arrCanzone).length];

		for(int i=0; i<arrCantanti.length; i++){
			arrAlbum[i] = new CasaProd(cdMusicale, arrCanzone);

		}
		return arrAlbum;
	}
}