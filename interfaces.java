public class interfaces implements Aritmeticos {
    public static void main(String[] args) {
        interfaces cal = new interfaces();

        System.out.println("Suma: " + cal.suma(2, 6));
        System.out.println("Resta: " + cal.resta(8, 3));
        System.out.println("Multiplicacion: " + cal.multiplicacion(4, 5));

        int x = 10;
        int y = 2;
        if (y != 0) {
            System.out.println("Division: " + cal.division(x, y));
        } else {
            System.out.println("No se puede dividir por 0");
        }
    }

    public int suma(int x, int y) {
        return x + y;
    }

    public int resta(int x, int y) {
        return x - y;
    }

    public int multiplicacion(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("No se puede dividir por 0");
            return 0; 
        }
    }
}

interface Aritmeticos {
    int suma(int x, int y);

    int resta(int x, int y);

    int multiplicacion(int x, int y);

    int division(int x, int y);
}
