
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a); // dodanie 1 do a =2, potem wypisuje 2
		System.out.println(a++); // wypisuje zmienna a równa 2, potem dodaje do niej 1
		System.out.println(a); //wypisze 3
		b=a++; //podstawia pod b zmienna a = 3 a potem zwieksza a  o 1
		System.out.println(b); // wypisuje 3
		b=++a; // zwieksza a o 1 z 4 do 5 , podstawia na b
		System.out.println(++a); // zwieksza a z 5 do 6 a potem wyswietla
	}

}
