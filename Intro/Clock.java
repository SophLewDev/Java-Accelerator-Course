import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

class Clock {
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatTo = DateTimeFormatter.ofPattern("HH::mm");
    String formattedDate = dateTime.format(formatTo);

    System.out.printf("The current " + ANSI_RED + "time" + ANSI_RESET + " is %s \n", formattedDate);
  }
}