package ObjetoGeometrico;

public class Retangulo extends ObjetoGeometrico {
  private double comprimento;
  private double altura;

  public Retangulo(double c, double a) {
    comprimento = c;
    altura = a;
  }

  @Override
  public double getArea() {
    area = comprimento * altura;  // Calculando a área
    return area;
  }

  @Override
  public double getPerimetro() {
    perimetro = 2 * (comprimento + altura);  // Calculando o perímetro
    return perimetro;
  }
}
