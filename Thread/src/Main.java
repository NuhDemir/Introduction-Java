public class Main {

    public class WaitExample {
        public static void main(String[] args) {
            final Object lock = new Object();

            Thread thread1 = new Thread(() -> {
                synchronized (lock) {
                    try {
                        System.out.println("Thread 1 bekliyor...");
                        lock.wait(); // lock nesnesinin üzerindeki kilidi bırakır ve uyuyan duruma geçer
                        System.out.println("Thread 1 uyandı!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (lock) {
                    try {
                        Thread.sleep(2000); // 2 saniye beklet
                        System.out.println("Thread 2 notify() çağırıyor...");
                        lock.notify(); // bekleyen diğer iş parçacığını uyandırır
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread1.start();
            thread2.start();
        }
    }
}