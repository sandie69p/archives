public class Main {
  public static void main(String[] args) {
    System.out.print("inserisci una temperatura celsius °C: ");
    double celsius = System.console();

    parseDouble(celsius);

    double fahrenheit = (celsius * 9 / 5) + 32;

    System.out.println("Temperatura fahrenheit °F: " + fahrenheit);
  }
}
