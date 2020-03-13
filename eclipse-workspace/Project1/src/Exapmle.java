
class Exapmle {
	public int i;

	public Exapmle(int i) {
		this.i = 1;
	}

	public static void main(String... ar) {

		Exapmle a1 = new Exapmle(334);
		Exapmle a2 = a1;
		a2.i = 998;
		System.out.println(a2.i + "\t" + a1.i);// ...............?????
	}
}
