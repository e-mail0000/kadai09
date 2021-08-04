class TanoshiiState extends DogState{
	private static TanoshiiState s = new TanoshiiState();
	private TanoshiiState() {}

	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(NemuruState.getInstance());
	}
	public void okita(Dog moto) {
		//変化なし
	}
	public String toString() {
		return "楽しい状態";
	}
}
