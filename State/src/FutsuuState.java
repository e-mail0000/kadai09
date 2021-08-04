class FutsuuState extends DogState {
	private static FutsuuState s = new FutsuuState();
	private FutsuuState() {}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto) {
		moto.changeState(IraState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}
	public void okita(Dog moto) {
		//変化なし
	}
	public String toString() {
		return "普通状態";
	}
}
