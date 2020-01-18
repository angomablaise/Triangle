package g_triangle;

import java.util.Scanner;

public class Triangle {
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(double coteA, double coteB, double coteC) {
		super();
		this.coteA = coteA;
		this.coteB = coteB;
		this.coteC = coteC;
	}

	private static double coteA;
	private static double coteB;
	private static double coteC;
	private static double superficie;
	
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	static Scanner sc = new Scanner(System.in);
	
	public double getCoteA() {
		return coteA;
	}

	public void setCoteA(double coteA) {
		this.coteA = coteA;
	}

	public double getCoteB() {
		return coteB;
	}

	public void setCoteB(double coteB) {
		this.coteB = coteB;
	}

	public double getCoteC() {
		return coteC;
	}

	public void setCoteC(double coteC) {
		this.coteC = coteC;
	}

	public static double superficie_triangle(double a, double b, double c) {
		superficie= (a + b + c)/2;
		return Math.sqrt(superficie*(superficie-a)*(superficie-b)*(superficie-c));
	}
	
	public static String Type_triangle(double a, double b, double c) {
		String type = "";
		
		double a_carre, b_carre, c_carre;
		
		if((a < 0) || (b < 0) || (c < 0) || (a+b < c) || (b+c < a) || (a+c < b)) {
					
					System.out.println("ces longueurs ne peuvent constituer les cotés d'un triangle ");
				}
				else {
					if(a==b && b==c && a==c) {
						type = "TRIAANGLE EQUILATERAL:";
					}
					else {
						if((a + c == b) || (a + b == c) || (b + c == a)) {
							type = "TRIAANGLE PLAT";
						}
						else {
							a_carre = a * 2;
							b_carre = b * 2;
							c_carre = c * 2;
							
							if((a_carre == b_carre + c_carre) || (b_carre == a_carre + c_carre) || (c_carre == a_carre + b_carre)) {
								if(a == b || a == c || b == c) {
									type = "TRIANGLE RECTANGLE ISOCELE";
								}
								else
									type = "TRIANGLE RECTANGLE";
							}
							else {
								if(a == b || a == c || b == c) {
									type = "TRIANGLE ISOCELE";
								}
								else
									type = "TRIAANGLE SCALENE";
							}
						}
					}
				}
		
		return type;
	}
	
	public Triangle tri_Triangle_Surface(Triangle[] tab) {
		int nb=2;
		return tab[nb];
	}
	
	public static void menu(int option){
		Triangle tr;
		
			switch (option)
			{
				case 1:
					System.out.println("ENTRER LE COTE A DU TRIAANGLE :");
					coteA = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE B DU TRIAANGLE :");
					coteB = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE C DU TRIAANGLE :");
					coteC = sc.nextDouble();
					
					if(coteA > 0 && coteB > 0  && coteC > 0) {
						tr = new Triangle(coteA, coteB, coteC);
					}
					else
						System.out.println("ENTRER LES VALEURS SUPERIEURES A ZERO SVP :");
					
					break;
				case 2:
					System.out.println("ENTRER LE COTE A DU TRIAANGLE :");
					coteA = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE B DU TRIAANGLE :");
					coteB = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE C DU TRIAANGLE :");
					coteC = sc.nextDouble();
					
					if(coteA > 0 && coteB > 0  && coteC > 0) {
						tr = new Triangle(coteA, coteB, coteC);
						System.out.println("Coté A = " + tr.getCoteA() + " Coté B = "+ tr.getCoteB() + " Coté C = " + tr.getCoteC());
						System.out.println("Ce triangle est un "+Type_triangle(tr.getCoteA(), tr.getCoteB(), tr.getCoteC()));
						System.out.println("La superficie de ce triangle est "+superficie_triangle(tr.getCoteA(), tr.getCoteB(), tr.getCoteC()));
					}
					else
						System.out.println("Veuillez Saisir les informations d'un triangle :");
					break;
				case 3:
					System.out.println("ENTRER LE COTE A DU TRIAANGLE :");
					coteA = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE B DU TRIAANGLE :");
					coteB = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE C DU TRIAANGLE :");
					coteC = sc.nextDouble();
					
					if(coteA > 0 && coteB > 0  && coteC > 0) {
						tr = new Triangle(coteA, coteB, coteC);
						System.out.println("Ce triangle est un "+Type_triangle(tr.getCoteA(), tr.getCoteB(), tr.getCoteC()));
					}
					else
						System.out.println("Veuillez Saisir les informations d'un triangle :");
					
					break;
				case 4:
					System.out.println("ENTRER LE COTE A DU TRIAANGLE :");
					coteA = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE B DU TRIAANGLE :");
					coteB = sc.nextDouble();
					
					System.out.println("ENTRER LE COTE C DU TRIAANGLE :");
					coteC = sc.nextDouble();
					
					if(coteA > 0 && coteB > 0  && coteC > 0) {
						tr = new Triangle(coteA, coteB, coteC);
						System.out.println("La superficie de ce triangle est "+superficie_triangle(tr.getCoteA(), tr.getCoteB(), tr.getCoteC()));
					}
					else
						System.out.println("Veuillez Saisir les informations d'un triangle :");
					break;
				case 5:
					System.out.println("Parfait !");
					break;
				default:
					System.out.println("Au revoir!!!.");
					System.exit(0);
					
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		System.out.println("               GESTION TRIANGLE");
		System.out.println("=================================================");
		System.out.println("### 1. Saisir les informations d'un triangle ====");
		System.out.println("### 2. Afficher les informations d'un triangle ==");
		System.out.println("### 3. Type du triangle =========================");
		System.out.println("### 4. La superficie ============================");
		System.out.println("### 5. Trier selon la superficie ================");
		System.out.println("### 6. QUITER ===================================");
		System.out.println("=================================================");
		
		System.out.println("Choisissez une option SVP!!! :");
		
		option = sc.nextInt();
		
		menu(option);
	}

}
