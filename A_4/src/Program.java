public class Program {
public static void main(String[]args) throws CloneNotSupportedException {
    IReteta reteta= new Reteta();
    reteta.incarcaReteta();

    IReteta copieReteta = null;
    copieReteta = reteta.copiaza();

    System.out.println(copieReteta.toString());
}
}
