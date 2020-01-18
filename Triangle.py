
class Triangle:
    def __init__(self,_a,_b,_c):
        self.a=_a
        self.b=_b
        self.c=_c
        self.cote=self.distance()
        self.surface=0
        self.perimetre=0
    def is_align(self):
        return self.a[0]==self.b[0] and self.b[0]==self.c[0]

# Nous avons créer la fonction distance pour calculer la longueur du segment entre deux points    
    def distance(self):
        return [(((self.a[0]-self.b[0])**2)+((self.a[1]-self.b[1])**2))**(0.5),(((self.c[0]-self.b[0])**2)+((self.c[1]-self.b[1])**2))**(0.5),(((self.a[0]-self.c[0])**2)+((self.a[1]-self.c[1])**2))**(0.5)]
    def typeTriangle(self):
        if self.is_align():
            return "C'EST UN TRIANGLE PLAT"
        elif self.cote[0]==self.cote[1] and self.cote[2]==self.cote[1]:
            return "C'EST UN TRIANGLE EQUILATERAL" 
        elif self.cote[0]==self.cote[1] or self.cote[1]==self.cote[0] or self.cote[2]==self.cote[0]:
            return "C'EST UN TRIANGLE ISOCELE"

            
          

a=[0,0]
b=[0,0]
c=[0,0]

print("=================================================")
print("### 1. Saisir les informations d'un triangle ====")
print("### 2. Afficher les informations d'un triangle ==")
print("### 3. Type du triangle =========================")
print("### 4. La superficie ============================")
print("### 5. Trier selon la superficie ================")
print("### 6. QUITER ===================================")
print("=================================================")

menu=input("Choisissez une option SVP!!! \n")
if menu == "1":
    print("=================================================")
    print("===== Saisir les informations d'un triangle =====")
    print("=================================================")
    print("INSERER LA VALEUR DE X1 :")
    a[0]=int(input())
    print("INSERER LA VALEUR DE Y1 :")
    a[1]=int(input())
    print("INSERER LA VALEUR DE X2 :")
    b[0]=int(input())
    print("INSERER LA VALEUR DE Y2 :")
    b[1]=int(input())
    print("INSERER LA VALEUR DE X3 :")
    c[0]=int(input())
    print("INSERER LA VALEUR DE Y3 :")
    c[1]=int(input())
    struct_triangle=Triangle(a,b,c)
    print(struct_triangle.cote[0])
    print(struct_triangle.cote[1])
    print(struct_triangle.cote[2])
