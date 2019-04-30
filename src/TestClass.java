public class TestClass {
    public static void main(String[] args) throws Exception {/*
        Singleton test = Singleton.getInstance();
        test = Singleton.getInstance();
        Singleton like = Singleton.getInstance();
        System.out.println(Singleton.count);*/

        int SIZE = 1000;
        Thread[] arr = new Thread[SIZE];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Thread(new Flash());
            arr[i].start();
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i].join();
        }
        System.out.println(Singleton.count);
    }
}
