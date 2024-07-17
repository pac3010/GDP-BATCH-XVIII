public class Main {
    public static void main(String[] args) {


        int[] arrBilanganBulat = {1,2,3,4,5,6,7,8,9,10};

            int[] newGanjilArr = main3(arrBilanganBulat);
            for(int i : newGanjilArr){
                System.out.println(i);
            }

        Animal animal = new Animal();
        animal.sound();


    }
    
    // public static int main2(int valueDua, int valueTiga){
    //   return valueDua + valueTiga;
    // }
    //method untuk mengolah bilangan ganjil, masukin array, di return, trus display
    public static int[] main3 (int[] arr ){
        int count = 0;
        
        for (int value : arr) {
            if (value % 2 != 0) {
                count++;
            }
        }

        int[] ganjilArr = new int[count];
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                ganjilArr[j] = arr[i];
                j++;
            }
        }
        return ganjilArr;
    }
}

class Animal {
    public void sound(){
        System.out.println(Cat.meowing()); 
    }
}
class Cat {
    public static String meowing(){
        return "Meow!";
    }
}