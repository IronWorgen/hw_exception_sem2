public class Task2 {
    /**
     *  в задании нет массива intArray -> может возникнуть ArrayIndexOutOfBoundsException
     *  бесполезный участок кода, т.к всегда возникает ArithmeticException
     *  чтобы исправить надо изменить d. На что менять непонятно.
     */
    public  void task2(){
        int[] intArray= new int[8];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        }
    }

}
