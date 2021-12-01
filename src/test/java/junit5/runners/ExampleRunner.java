package junit5.runners;

import junit5.listeners.ExampleListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class ExampleRunner extends BlockJUnit4ClassRunner {
    private ExampleListener exampleListener;
    
    public ExampleRunner(Class klass) throws InitializationError {
        super(klass);
        exampleListener= new ExampleListener();
    }
    public void run(final RunNotifier notifier){
        notifier.addListener(exampleListener);
        super.run(notifier);
    }
    
}
