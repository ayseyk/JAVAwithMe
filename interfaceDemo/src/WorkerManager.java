public class WorkerManager {

    IWorkable workable;
    IEatable eatable;
    IPayable payable;

    public WorkerManager(IWorkable workable) {
        this.workable = workable;
    }

    public WorkerManager(IWorkable workable, IEatable eatable, IPayable payable) {
        this.workable = workable;
        this.eatable = eatable;
        this.payable = payable;
    }

    void work() {
        workable.work();
    }

    void eat() {
        eatable.eat();
    }

    void pay() {
        payable.pay();
    }
}
