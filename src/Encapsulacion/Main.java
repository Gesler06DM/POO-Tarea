package Encapsulacion;

public class Main {

	public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
    }

    public static void ejercicio1() {
        System.out.println("========== Ejercicio 1 Persona");

        Persona per1 = new Persona("Gesler", "Duque", 19);
        Persona per2 = new Persona("Daniel", "Medina", 18);
        Persona per3 = new Persona("Lucia", "Martinez", 20);

        System.out.println("\nPersona 1:");
        per1.mostrar();

        System.out.println("\nPersona 2:");
        per2.mostrar();

        System.out.println("\nPersona 3:");
        per3.mostrar();

        System.out.println();
    }

    public static void ejercicio2() {
        System.out.println("ejercico 2 Rectangulo");

        Rectangulo rec1 = new Rectangulo(3, 2);
        Rectangulo rec2 = new Rectangulo(4, 2);

        System.out.println("\nRectangulo 1:");
        System.out.println("Area: " + rec1.area());
        System.out.println("Perimetro: " + rec1.perimetro());

        System.out.println("\nRectangulo 2:");
        System.out.println("Area: " + rec2.area());
        System.out.println("Perimetro: " + rec2.perimetro());

        if (rec1.area() > rec2.area()) {
            System.out.println("\nEl rectangulo 1 tiene mayor area.");
        } else if (rec2.area() > rec1.area()) {
            System.out.println("\nEl rectangulo 2 tiene mayor area.");
        } else {
            System.out.println("\nAmbos rectangulos tienen la misma area.");
        }

        System.out.println();
    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3 Producto");

        Producto prod1 = new Producto(1, "Cama imperial", 1200);
        Producto prod2 = new Producto(2, "Refrigerador", 8000);

        System.out.println("\nProducto 1 antes del descuento:");
        prod1.mostrar();

        System.out.println("\nProducto 2 antes del descuento:");
        prod2.mostrar();

        prod1.aplicarDescuento(10);
        prod2.aplicarDescuento(20);

        System.out.println("\nProducto 1 despues del 10% de descuento:");
        prod1.mostrar();

        System.out.println("\nProducto 2 despues del 20% de descuento:");
        prod2.mostrar();

        System.out.println();
    }

    public static void ejercicio4() {
        System.out.println("Ejercico 4 cuenta");

        Cuenta cuenta1 = new Cuenta("Maria Lopez", 1000);

        cuenta1.depositar(500);
        cuenta1.retirar(300);
        cuenta1.retirar(1500);
        cuenta1.depositar(200);

        System.out.println();
        cuenta1.mostrarSaldo();

        System.out.println();
    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5 Libro");

        Libro lib1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 417);
        Libro lib2 = new Libro("El principito", "Antoine de Saint-Exupery", 96);
        Libro lib3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        System.out.println("\nLibro 1:");
        lib1.mostrar();
        System.out.println("Es largo? " + lib1.esLargo());

        System.out.println("\nLibro 2:");
        lib2.mostrar();
        System.out.println("Es largo? " + lib2.esLargo());

        System.out.println("\nLibro 3:");
        lib3.mostrar();
        System.out.println("Es largo? " + lib3.esLargo());

        System.out.println();
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6: Calculadora");

        Calculadora cal = new Calculadora();

        double num1 = 20;
        double num2 = 5;
        double num3 = 0;

        System.out.println("\nNumeros: " + num1 + " y " + num2);
        System.out.println("Suma: " + cal.sumar(num1, num2));
        System.out.println("Resta: " + cal.restar(num1, num2));
        System.out.println("Multiplicacion: " + cal.multiplicar(num1, num2));
        System.out.println("Division: " + cal.dividir(num1, num2));

        System.out.println("\nValidacion de division entre cero:");
        System.out.println("Division: " + cal.dividir(num1, num3));

        System.out.println();
    }
	}

