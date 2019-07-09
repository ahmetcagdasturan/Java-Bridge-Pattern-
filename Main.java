
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		İsletimSistemi İOS_UnitTest = new İOS(new UnitTest());
		İOS_UnitTest.testeBasla();
		
		İsletimSistemi İOS_EntegrasyonTesti = new İOS(new EntegrasyonTesti());
		İOS_EntegrasyonTesti.testeBasla();
		
		İsletimSistemi İOS_SistemTesti = new İOS(new SistemTesti());
		İOS_SistemTesti.testeBasla();

		
		İsletimSistemi Android_UnitTest = new Android(new UnitTest());
		Android_UnitTest.testeBasla();
		
		İsletimSistemi Android_EntegrasyonTesti = new Android(new EntegrasyonTesti());
		Android_EntegrasyonTesti.testeBasla();
		
		İsletimSistemi Android_SistemTesti = new Android(new SistemTesti());
		Android_SistemTesti.testeBasla();
		
		
	}

}
