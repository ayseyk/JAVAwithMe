public class ProductManager {
    public void add(Product product) {

        //ProductValidator validator = new ProductValidator();

        if (ProductValidator.isValid(product)) { //if (validator.isValid(product))...
            System.out.println("Veri tabanına eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }
}
