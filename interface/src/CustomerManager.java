public class CustomerManager {

    private ICustomerDal customerDal; //2.yolda bu public

    public CustomerManager(ICustomerDal customerDal){ //2.yolda bu yok
        this.customerDal=customerDal;
    }
    //new OracleCustomerDal() bu parantez içindekine atanmış oluyor.

    public void add(){
        customerDal.Add();
    }
}
