package ObjetoGeometrico;

public class QuadroNegro {
  private Quadrado quadrado;
  private Retangulo retangulo;
  private Circunferencia circunferencia;
  private Triangulo triangulo;

  public void limpaQuadro() {
    quadrado = null;
    retangulo = null;
    circunferencia = null;
    triangulo = null;
  }

  public void criaQuadrado(double l) {
    quadrado = new Quadrado(l);
    quadrado.setCor("Verde");
  }

  public void criaRetangulo(double c, double a) {
    retangulo = new Retangulo(c, a);
    retangulo.setCor("Amarelo");
  }

  public void criaTriangulo(double b, double a) {
    triangulo = new Triangulo(b, a);
    triangulo.setCor("Azul");
  }

  public void criaCircunferencia(double r) {
    circunferencia = new Circunferencia(r);
    circunferencia.setCor("Branco");
  }

  public void mostraAreaObjetos() {
    System.out.println("Área dos objetos geométricos:");
    System.out.printf("Quadrado (Área): %.2f\n", quadrado.getArea());
    System.out.printf("Retângulo (Área): %.2f\n", retangulo.getArea());
    System.out.printf("Triângulo (Área): %.2f\n", triangulo.getArea());
    System.out.printf("Circunferência (Área): %.2f\n", circunferencia.getArea());
  }

  public void mostraPerimetroObjetos() {
    System.out.println("\nPerímetro dos objetos geométricos:");
    System.out.printf("Quadrado (Perímetro): %.2f\n", quadrado.getPerimetro());
    System.out.printf("Retângulo (Perímetro): %.2f\n", retangulo.getPerimetro());
    System.out.printf("Triângulo (Perímetro): %.2f\n", triangulo.getPerimetro());
    System.out.printf("Circunferência (Perímetro): %.2f\n", circunferencia.getPerimetro());
  }

  public void mostraCorObjetos() {
    System.out.println("\nCores dos objetos geométricos:");
    System.out.println("Quadrado: " + quadrado.getCor());
    System.out.println("Retângulo: " + retangulo.getCor());
    System.out.println("Triângulo: " + triangulo.getCor());
    System.out.println("Circunferência: " + circunferencia.getCor());
  }

  public static void main(String args[]) {
    QuadroNegro quadroNegro = new QuadroNegro();
    quadroNegro.criaQuadrado(20.12);
    quadroNegro.criaRetangulo(100.10, 40.8);
    quadroNegro.criaTriangulo(12.14, 10.10);
    quadroNegro.criaCircunferencia(20);

    quadroNegro.mostraAreaObjetos();
    quadroNegro.mostraPerimetroObjetos();
    quadroNegro.mostraCorObjetos();
  }
}
