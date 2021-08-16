public class Main {
//interface ile polimorfizm
    public static void main(String[] args) {
	// write your code here
        /*ICustomerDal customerDal= new OracleCustomerDal(); //interfaceler newlenemezler, çocuğunu newleyebilir.
        customerDal.Add();*/

        CustomerManager customerManager= new CustomerManager(new OracleCustomerDal());

       // customerManager.customerDal= new OracleCustomerDal(); //2.yol
        customerManager.add();
    }
}
//2.yolda constructorsız kullanım olduğu için customerManager.customerDal= new OracleCustomerDal();
// tanım unutulabilir ve program hata veriyor, bunu engellemek için constructorlu kullanım yapılıyor.

