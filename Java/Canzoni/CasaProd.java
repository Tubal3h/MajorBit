class CasaProd {
	private CdMusicale cdmusicale;
	private Canzone[] canzone;
	
	public CasaProd(CdMusicale cdmusicale, Canzone[] canzone){
		this.cdmusicale = cdmusicale;
		this.canzone = canzone;
	}
	
	public CdMusicale getCdMusicale(){
		return cdmusicale;
	}

	public Canzone[] getCanzone(){
		return canzone;
	}

}