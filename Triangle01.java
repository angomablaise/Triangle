package g_triangle;

public class Triangle01 {
	
	public Triangle01(double a, double b, double c) {
		assign(a, b, c);
	}
	
	public Triangle01(Point p1, Point p2, Point p3) {
		assign(p1.distance(p2), p2.distance(p3), p3.distance(p1));
	}

	private double m_l1, m_l2, m_l3;
	private int superficie;
	
	public int getSuperficie() {
		return superficie;
	}

	public double getL1() {
		return m_l1;
	}

	public double getL2() {
		return m_l2;
	}

	public double getL3() {
		return m_l3;
	}

	public void assign(double a, double b, double c) {
		m_l1 = (a >= 0 ? a : 0.0);
		m_l2 = (b >= 0 ? b : 0.0);
		m_l3 = (c >= 0 ? c : 0.0);
	}
	
	public void afficher() {
		System.out.println("<"+getL1()+", "+getL2()+", "+getL3()+">");
	}
	
	public String str() {
		return "<"+getL1()+", "+getL2()+", "+getL3()+">";
	}
	
	public double perimetre() {
		return getL1()+ getL2() +getL3();
	}
	
	public boolean isocele() {
		return (getL1() == getL2())
			|| (getL2() == getL3())
			|| (getL3() == getL1());
	}
	
	public int superficie_triangle() {
		superficie= (int) ((getL1()+ getL2() +getL3())/2);
		return (int) Math.sqrt(superficie*(superficie-getL1())*(superficie-getL2())*(superficie-getL3()));
	}
	
	public String Type_triangle() {
		String type = "";
		
		double a_carre, b_carre, c_carre;
		
		if((getL1()< 0) || (getL2() < 0) || (getL3() < 0) || (getL1()+getL2() < getL3()) || (getL2()+getL3() < getL1()) || (getL1()+getL3() < getL2())) {
					
					System.out.println("ces longueurs ne peuvent constituer les cotés d'un triangle ");
				}
				else {
					if(getL1()==getL2() && getL2()==getL3() && getL1()==getL3()) {
						type = "TRIAANGLE EQUILATERAL:";
					}
					else {
						if((getL1() + getL3() == getL2()) || (getL1() + getL2() == getL3()) || (getL2() + getL3() == getL1())) {
							type = "TRIAANGLE PLAT";
						}
						else {
							a_carre = getL1() * 2;
							b_carre = getL2() * 2;
							c_carre = getL3() * 2;
							
							if((a_carre == b_carre + c_carre) || (b_carre == a_carre + c_carre) || (c_carre == a_carre + b_carre)) {
								if(getL1() == getL2() || getL1() == getL3() || getL2() == getL3()) {
									type = "TRIANGLE RECTANGLE ISOCELE";
								}
								else
									type = "TRIANGLE RECTANGLE";
							}
							else {
								if(getL1() == getL2() || getL1() == getL3() || getL2() == getL3()) {
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
	
	
	
	
}
