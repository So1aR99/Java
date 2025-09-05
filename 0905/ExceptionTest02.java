public class Main {
    public static void main(String[] args) {
        try{
            int[] arr = new int[3];
            arr[3] = 5;

            System.out.println(arr[3]);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("배열의 개수를 초과하여 입력하셨습니다.");
            
        }catch (Exception e) {
            System.out.println("예외가 발생하였습니다.");
        }

    }
}
