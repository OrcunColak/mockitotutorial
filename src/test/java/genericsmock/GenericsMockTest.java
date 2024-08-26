package genericsmock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericsMockTest {

    public interface IQueue<T> {
        T dequeue();
    }

    @Test
    void testMockGenericQueue() {
        IQueue<String> queue = Mockito.mock();

        // Use the mock in your tests
        Mockito.when(queue.dequeue()).thenReturn("TestItem");

        // Example usage
        String item = queue.dequeue();
        assertEquals("TestItem" , item);
    }
}
