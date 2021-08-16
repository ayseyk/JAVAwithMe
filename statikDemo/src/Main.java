public class Main {

    public static void main(String[] args) {
	// write your code here

        ProductManager manager= new ProductManager();
        Product product= new Product(1,"laptop",15000);
        manager.add(product);

        DatabaseHelper.Crud.Delete();

    }
}
