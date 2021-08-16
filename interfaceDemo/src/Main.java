public class Main {

    public static void main(String[] args) {
        // write your code here

        /*IWorkable worker= new RobotWorker();
        worker.work();*/

        //robot veya outsource çalışanlara erişmek için tekli constructor çağrılmalı.

        WorkerManager workerManager = new WorkerManager(new Worker(), new Worker(), new Worker());
        workerManager.work();
        workerManager.eat();
        workerManager.pay();

    }
}
