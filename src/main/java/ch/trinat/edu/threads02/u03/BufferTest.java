package ch.trinat.edu.threads02.u03;

public class BufferTest {
    public static void main(String[] args) {
        System.out.println("Starting Producers and Consumers");
        BufferN buffer = new BufferN(10);
        ProducerThread Producer1 = new ProducerThread("Producer1", buffer);
        ProducerThread Producer2 = new ProducerThread("Producer2", buffer);
        ConsumerThread Consumer1 = new ConsumerThread("Consumer1", buffer);
        ConsumerThread Consumer2 = new ConsumerThread("Consumer2", buffer);

        Producer1.start();
        Producer2.start();
        System.out.println("Producers started");

        Consumer1.start();
        Consumer2.start();
        System.out.println("Consumers started");

    }
}
