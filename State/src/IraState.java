class IraState extends DogState{
	private static IraState s = new IraState();
	private IraState() {}

	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		moto.changeState(NemuruState.getInstance());
	}
	public void tabeta(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
	}
	public void okita(Dog moto) {
		//変化なし
	}
	public String toString() {
		return "いらいら状態";
	}
}
