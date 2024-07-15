import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> dictionary = new HashMap<>();
    Random random = new Random();
    ArrayList<String> selectedWords = new ArrayList<>();
    
    //definir variables de rtas en 0
    int correctAnswers = 0;
    int incorrectAnswers = 0;
    
    dictionary.put("algoritmo", "algorithm");
    dictionary.put("base de datos", "database");
    dictionary.put("código", "code");
    dictionary.put("desarrollo", "development");
    dictionary.put("interfaz", "interface");
    dictionary.put("programación", "programming");
    dictionary.put("archivo", "file");
    dictionary.put("consola", "console");
    dictionary.put("aplicación", "application");
    dictionary.put("red", "network");
    dictionary.put("nube", "cloud");
    dictionary.put("sistema", "system");
    dictionary.put("servidor", "server");
    dictionary.put("seguridad", "security");
    dictionary.put("libreria", "library");
    dictionary.put("experiencia", "experience");
    dictionary.put("lenguaje", "language");
    dictionary.put("marco de trabajo", "framework");
    dictionary.put("respuesta", "response");
    dictionary.put("usuario", "user");
    
    ArrayList<String> spanishWords = new ArrayList<>(dictionary.keySet());
    
    while (selectedWords.size() < 5) {
      int i = random.nextInt(spanishWords.size());
      String selectedWord = spanishWords.get(i);
      if (!selectedWords.contains(selectedWord)) {
        selectedWords.add(selectedWord);
      }
    }
    
    System.out.println("=============================================================================");
    System.out.println("Bienvenido a este programa donde probaremos qué tanto sabes de inglés");
    System.out.println("vas a traducir 5 palabras aleatorias, tema: tecnología: ");
    System.out.println("=============================================================================");
    
    for (String spanishWord : selectedWords) {
      System.out.printf("-> Traduce la palabra '%s' al inglés: \n", spanishWord);
      String userAnswer = scanner.nextLine();
      
      if (dictionary.get(spanishWord).equalsIgnoreCase(userAnswer)) {
        System.out.println("Es correcto");
        System.out.println("---------------------");
        correctAnswers++;
      } else {
        incorrectAnswers++;
        System.out.println("Es incorrecto");
        System.out.println("---------------------");
      }
    }
    
    // Imprimir resultado
    System.out.println("============================================================");
    System.out.printf("Las respuestas que tuviste correctas fueron: %d \n", correctAnswers);
    System.out.printf("Las respuestas que tuviste incorrectas fueron: %d \n", incorrectAnswers);
    
    // cerrar scanner
    scanner.close();
  }
}
