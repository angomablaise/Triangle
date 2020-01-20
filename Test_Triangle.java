package g_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

import javafx.print.Collation;

public class Test_Triangle {
	
	public static void saisirPoint(String texte, Point p) {
		Scanner sc = new Scanner(System.in);
		System.out.println(texte);
		System.out.println("Veuillez entrer X :");
		double x = sc.nextDouble();
		System.out.println("Veuillez entrer Y :");
		double y = sc.nextDouble();
		p.assign(x, y);
	}
	
	public static void saisirPoints(Point p1, Point p2, Point p3) {
		saisirPoint("Saisir Premier point (x,y)?", p1);
		saisirPoint("Saisir Deuxième point (x,y)?", p2);
		saisirPoint("Saisir Troisième point (x,y)?", p3);
	}
	
	public static void afficherPoints(Point p1, Point p2, Point p3) {
		System.out.print(" P1 = "+p1.str());
		System.out.print(" P2 = "+p2.str());
		System.out.print(" P3 = "+p3.str());
		System.out.println("\n");
	}
	
	public static void test_Points() {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		saisirPoints(p1, p2, p3);
		afficherPoints(p1, p2, p3);
	}
	
	public static void test_Triangle0() {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		saisirPoints(p1, p2, p3);
		afficherPoints(p1, p2, p3);
		Triangle01 tr = new Triangle01(p1, p2, p3);
		System.out.println(" Type de triangle = "+tr.Type_triangle());
		//tr.afficher();
		System.out.println();
	}
	
	public static void test_Triangle() {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		saisirPoints(p1, p2, p3);
		afficherPoints(p1, p2, p3);
		Triangle01 tr = new Triangle01(p1, p2, p3);
		System.out.println(" Superficie = "+tr.superficie_triangle());
		System.out.println(" Type de triangle = "+tr.Type_triangle());
	}
	
	public static void test_Triangle_Trie_Superfifcie() {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		saisirPoints(p1, p2, p3);
		afficherPoints(p1, p2, p3);
		Triangle01 tr = new Triangle01(p1, p2, p3);
		Tri_Triangle_surface();
	}
	
	public static void test_Triangle_Type() {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		saisirPoints(p1, p2, p3);
		afficherPoints(p1, p2, p3);
		Triangle01 tr = new Triangle01(p1, p2, p3);
		System.out.println(" Type de triangle = "+tr.Type_triangle());
		
	}
	
	public static void test_Triangle_superficie() {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		saisirPoints(p1, p2, p3);
		afficherPoints(p1, p2, p3);
		Triangle01 tr = new Triangle01(p1, p2, p3);
		System.out.println(" Superficie = "+tr.superficie_triangle());
	}
	
	public static void Tri_Triangle_surface() {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		
		saisirPoints(p1, p2, p3);
		
		Triangle01[] tab = new Triangle01[] {new Triangle01(p1,p2,p3), new Triangle01(p1,p2,p3), new Triangle01(p1,p2,p3)};
		Arrays.sort(tab);
		
		for(int i=0;i<3;i++)
			System.out.println(tab[i].getSuperficie());
			
		afficherPoints(p1, p2, p3);
	}
	
	public static void menu(int option){
		Triangle tr;
		
			switch (option)
			{
				case 1:
					test_Points();
					break;
				case 2:
					test_Triangle();
					break;
				case 3:
					test_Triangle_Type();
					break;
				case 4:
					test_Triangle_Trie_Superfifcie();
					break;
				default:
					System.out.println("Au revoir!!!.");
					System.exit(0);	
			}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		System.out.println("               GESTION TRIANGLE");
		System.out.println("=================================================");
		System.out.println("### 1. Saisir les informations d'un triangle ====");
		System.out.println("### 2. Afficher les informations d'un triangle ==");
		System.out.println("### 3. Type du triangle =========================");
		System.out.println("### 4. Trier selon la superficie ================");
		System.out.println("### 5. QUITER ===================================");
		System.out.println("=================================================");
		
		System.out.println("Choisissez une option SVP!!! :");
		
		option = sc.nextInt();
		
		menu(option);
		
		/*test_Points();
		test_Triangle0();
		test_Triangle();*/
		
	}

	

}
