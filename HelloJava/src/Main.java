public class Main {

    public static void main(String[] args) {
        // write your code here
        /*System.out.println("Hello Java!");
        int number = 5;
        String message = "My number is: ";
        System.out.println("My number is: " + number);
        System.out.println(message + number + " /with message string");

        byte myLittleNumber = -128; //-128 ile 127 arasındaki sayiları tutar.
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("--" + i);

        int[] myNumberArray = {1, 2, 3, 4, 5}; //new int[5];
        // myNumberArray = {1,2,3,4,5}; ERROR

        for (int num : myNumberArray) {
            System.out.println(num);
        }
        System.out.println(message.charAt(5));
        char some = message.charAt(5);
        System.out.println(some);
        System.out.println(message.startsWith("B")); // true ya da false döndürür.*//*


        for (String kelime : message.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(message.substring(2, 7));*/

       /* int number= 28;
        int total=0;

        for(int i=1; i<number; i++){
            if(number % i==0){
                total += i;
            }
        }
        if(total==number){
            System.out.println(number +" Sayisi bir mükemmel sayidir.");
        }else{
            System.out.println(number +" Sayisi bir mükemmel sayi değildir.");
        }
*/

        /*int[] myArray = new int[] {1,2,3,4,5,6};
        int num= 55;
        boolean isNumber = false;

         for(int i=0; i< myArray.length;i++){
             if(num==myArray[i]){
                 System.out.println(num +" Dizinin bir elemanıdır.");
                 isNumber=true;
                 break;
             }
         }
        if(!isNumber){
            System.out.println(num +" Dizinin elemanı değildir.");
        }
    }*/

        int sum= sumFunc(1,2,3,4,5); //istediğin kadar yazıyorsun, arkada arraya çevrilip fonksiyona iletiliyor.
        System.out.println(sum);

}
    public static int sumFunc(int ... numbers){
        int sum=0;
        for(int number: numbers){
            sum+=number;
        }
        return sum;
    }
}