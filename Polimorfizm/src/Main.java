public class Main {

    public static void main(String[] args) {
	// write your code here
        GameCalculator gameCalculator = new CalculateForMen(); // sadece burayı değiştirmek yeterli olacak.
        classUI yeniEkran= new classUI();
        yeniEkran.ekran(gameCalculator); //alt çocuklardan biri ile erişmiş olduk polimorfizm bu.
    }
}
