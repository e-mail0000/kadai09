class NemuruState extends DogState{
	private static NemuruState s = new NemuruState();
	private NemuruState() {}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto) {
		//変化なし
	}
	public void tabeta(Dog moto) {
		//変化なし
	}
	public void okita(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}
	public String toString() {
		return "犬は眠っている…";
	}
}
