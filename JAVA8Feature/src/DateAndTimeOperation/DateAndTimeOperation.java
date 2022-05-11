package DateAndTimeOperation;

import java.time.LocalDateTime;

public class DateAndTimeOperation {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        dateTime.toLocalDate();
    }
}
