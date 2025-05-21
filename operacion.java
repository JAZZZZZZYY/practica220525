public class operacion {
      public int sumar(int a, int b) {
       if (a<0 || b<0) {
          System.out.println("No se puede sumar numeros negativos");
          return 0;
           
       }

          return a + b;
      }
      public double sumar(double a, double b) {
          return a + b;
      }
      public int sumar(int a, int b, int c) {
          return a + b + c;
      }

      public void imprimirNumerosimpares(int a) {
          System.out.println("Números impares hasta " + a + ":");
          for (int i = 1; i <= a; i++) {
              if (i % 2 != 0) {
                  System.out.println("Número impar " + i);
              }
          }
          System.out.println();
      }
}
