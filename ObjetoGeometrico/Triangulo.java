package ObjetoGeometrico;

public class Triangulo extends ObjetoGeometrico {
  private double base;
  private double altura;

  public Triangulo(double b, double a) {
    base = b;
    altura = a;
  }

  @Override
  public double getArea() {
    area = (base * altura) / 2;  // Calculando a área
    return area;
  }

  @Override
  public double getPerimetro() {
    perimetro = 3 * base;  // Assumindo um triângulo equilátero
    return perimetro;
  }
}
