public class DatabaseHelper {
    public static class Crud{ //create read update delete
        public static void Delete(){
            System.out.println("Silme işlemi yapıldı.");
        }
        public static void Update(){
            System.out.println("Güncelleme işlemi yapıldı.");
        }
    }

    public static class Connection{
        public static void createConnection(){
            System.out.println("Bağlantı oluşturuldu.");
        }
    }
}
