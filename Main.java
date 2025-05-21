public class Main {
 public static void main(String[] args) {
        operacion op = new operacion();
        int result1 = op.sumar(5, 10);
        System.out.println("Resultado de la suma de enteros: " + result1);
        double result2 = op.sumar(5.5, 10.5);
        System.out.println("Resultado de la suma de dobles: " + result2);
        int result3 = op.sumar(5, 10, 15);
        System.out.println("Resultado de la suma de tres enteros: " + result3);
        
        int result4 = op.sumar(-5, 10);
        System.out.println("Resultado de la suma con un número negativo: " + result4);

        op.imprimirNumerosimpares(5);
    }

}
