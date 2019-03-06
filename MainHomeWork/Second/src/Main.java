

public class Main {
    public static void main(String[] args) {
        String [][] arr = {{"4","2","7","6"}, {"7","9","2","6"}};
        try {
            ArrayExeption.sumArrayElements(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}