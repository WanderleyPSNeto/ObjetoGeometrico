package ObjetoGeometrico;

public class Circunferencia extends ObjetoGeometrico {
  private double raio;

  public Circunferencia(double r) {
    raio = r;
  }

  @Override
  public double getArea() {
    area = Math.PI * Math.pow(raio, 2);  // Calculando a área
    return area;
  }

  @Override
  public double getPerimetro() {
    perimetro = 2 * Math.PI * raio;  // Calculando o perímetro
    return perimetro;
  }
}
