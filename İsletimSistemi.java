
public abstract class İsletimSistemi {

	private TestSeviye testSeviyesi;
	
	public İsletimSistemi(TestSeviye testSeviyesi) {
		
		this.testSeviyesi = testSeviyesi;
	}
	
	public void testeBasla() {
		
		testSeviyesi.testIslem();
	}
}
