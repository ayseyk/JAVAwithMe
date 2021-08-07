public abstract class BaseDatabaseManager {
    public abstract void getData();

    public final void getInfo(){ //ovverride edilemez.
        System.out.println("Database erişimi başarılı.");
    }
}
