//Ashly
public class MathEquation {
    public static void main(String[] args) {
        double x = 2.0; // Valor de la variable independiente
        double y = calculateEquation(x);
        
    System.out.println("El valor de y es: " + y);
    
    }
    //Isabela
    public static double calculateEquation(double x) {
        double raiz = Math.sqrt(Math.pow(x, 2) + 1);
        double logaritmo = Math.log(x);
        double integral = integrate(x, 3, 2);
        double derivada = derivative(x, 4, 3);
        double resultado = (raiz + logaritmo) / (integral + derivada);
        return resultado;
}
    //Laura

    public static double integrate(double x, double a, double b) {
        // Implementación de la integral definida de x^a + bx
        return (Math.pow(x, a + 1) / (a + 1)) + (b * x);
    }
public static double derivative(double x, double a, double b) {
        // Implementación de la derivada de x^a + bx
