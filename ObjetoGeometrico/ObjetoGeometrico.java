package ObjetoGeometrico;

abstract public class ObjetoGeometrico {
  protected double area;
  protected double perimetro;
  protected String cor;

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return cor;
  }

  public void setPerimetro(double perimetro) {
    this.perimetro = perimetro;
  }

  public double getPerimetro() {
    return perimetro;
  }

  public abstract double getArea();

}
