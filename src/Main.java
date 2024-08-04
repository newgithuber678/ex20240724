
public class Main {
    public static void main(String[] args) {
        try {
            int[] nums={0,1,2,3};
            for (int i=0;i<10;i++){
                nums[i]++;
            }
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка");
        }
    }
}