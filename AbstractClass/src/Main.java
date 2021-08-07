public class Main {

    public static void main(String[] args) {
	// write your code here

        CustomerManager customerManager= new CustomerManager();
        customerManager.databaseManager = new MysqlDatabaseManager(); // sadece burayı değişiyoruz database türü değişmek için.
        customerManager.getCustomers();
        BaseDatabaseManager database = new MysqlDatabaseManager(); //abstract sınıf kendi objesine newlenemez.
        database.getInfo();

    }
}
