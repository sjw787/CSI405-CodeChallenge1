import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor{
  public static void main(String[] args){
    PrintTask task1 = new PrintTask("Task 1");
    PrintTask task2 = new PrintTask("Task 2");
    PrintTask task3 = new PrintTask("Task 3");
    
    System.out.println("Starting Excecutor");
    
    ExecutorService threadExecutor = Executors.newCachedThreadPool();
    
    threadExecutor.execute(task1);
    threadExecutor.execute(task2);
    threadExecutor.execute(task3);
    
    threadExecutor.shutdown();
    
    System.out.println("Tasks started, main ends");
    
  }
}