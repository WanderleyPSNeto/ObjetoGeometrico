package ObjetoGeometrico;

public class Quadrado extends ObjetoGeometrico {
  private double lado;

  public Quadrado(double l) {
    lado = l;
  }

  @Override
  public double getArea() {
    area = Math.pow(lado, 2);  // Calculando a área
    return area;
  }

  @Override
  public double getPerimetro() {
    perimetro = 4 * lado;  // Calculando o perímetro
    return perimetro;
  }
}
