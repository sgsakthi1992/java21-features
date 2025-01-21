import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThread {

  public static void main(String[] args) {
    //try(var executor = Executors.newFixedThreadPool(99999)) {
    try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
      IntStream.range(0, 99999).forEach(i -> {
        executor.submit(() -> {
          try {
            Thread.sleep(Duration.ofSeconds(1));
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          System.out.println(i);
          return i;
        });
      });

    }
  }

}
