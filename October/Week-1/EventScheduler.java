// Name: Kunjan

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Event
{
    private String name;
    private LocalDateTime startTime;

    public Event(String name, LocalDateTime startTime)
    {
        this.name = name;
        this.startTime = startTime;
    }

    public String getName()
    {
        return name;
    }

    public LocalDateTime getStartTime()
    {
        return startTime;
    }
}

public class EventScheduler
{
    public static void main(String[] args)
    {
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        LocalDateTime now = LocalDateTime.now();

        Event lecture = new Event(
            "Java Lecture",
            now.plusHours(2)
        );

        Event interview = new Event(
            "Placement Interview",
            now.plusDays(2).plusHours(3)
        );

        System.out.println("==============================");
        System.out.println("       EVENT SCHEDULER");
        System.out.println("==============================");

        displayEvent(lecture, now, formatter);
        displayEvent(interview, now, formatter);
    }

    public static void displayEvent(
        Event event,
        LocalDateTime now,
        DateTimeFormatter formatter)
    {
        Duration timeRemaining =
            Duration.between(now, event.getStartTime());

        System.out.println();
        System.out.println("Event: " + event.getName());
        System.out.println(
            "Starts: "
            + event.getStartTime().format(formatter)
        );

        System.out.println(
            "Time remaining: "
            + timeRemaining.toHours()
            + " hours"
        );
    }
}