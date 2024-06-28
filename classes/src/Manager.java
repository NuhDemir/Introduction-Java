public class Manager {

    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 =new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int num1 = 10; 
        int num2 = 20;
        num2 = num1;
        num1 =30;
        System.out.println(num2);

        int[] numbers1 = new int[]{1,2,3};
        int[] numbeers2 = new int[]{4,5,6};
        numbeers2 = numbers1;
        numbers1[0]=10;
        System.out.println(numbeers2[0]);

    }


}




