public class Worker implements IWorkable, IEatable, IPayable {
    @Override
    public void work() {
        System.out.println("Kendi çalışanımız çalışıyor.");
    }

    @Override
    public void eat() {
        System.out.println("Kendi çalışanımız yemek yiyor..");
    }

    @Override
    public void pay() {
        System.out.println("Kendi çalışanımız maaş alıyor.");
    }
}
