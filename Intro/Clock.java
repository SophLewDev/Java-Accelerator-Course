import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

class Clock {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatTo = DateTimeFormatter.ofPattern("HH::mm");
    String formattedDate = dateTime.format(formatTo);

    System.out.printf("The current time is %s \n", formattedDate);
  }
}