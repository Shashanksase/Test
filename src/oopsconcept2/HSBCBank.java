package oopsconcept2;

public class HSBCBank implements Usbank,BrazilBank  {
//Is-a-Relationship

	@Override
	public void credit() {
		System.out.println("HSBC Credit");
	}

	@Override
	public void transfermoney() {
		// TODO Auto-generated method stub

	}

	public void debit() {
		System.out.println("HSBC Debit");
	}

	public void Specialcard() {
		System.out.println("HSCB -- Special card");
	}

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank();
		hs.Specialcard();
		// Usbank us= new Usbank(); //As Usbank is an interface we can't create the
		// object
		// as it's abstract in nature.
		// BrazilBank br = new BrazilBank();
		Usbank b = new HSBCBank();
		b.credit();
		hs.debit();
		hs.mutual();
		hs.cryptocurrency();
		hs.cryptocurrency(18);
		hs.debit();

		System.out.println(BrazilBank.min_bal);

	}

	@Override
	public void mutual() {
		System.out.println("HSBC-- mutual");

	}

	@Override
	public void cryptocurrency() {
		System.out.println("Us bank or brazil bank ?");

	}

	public void cryptocurrency(int i) {
		System.out.println("Integer cypto");
		System.out.println(i);

	}
	

}
