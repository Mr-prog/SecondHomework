import java.net.SocketOption;
import java.util.SimpleTimeZone;




public class ArrayExeption {

    private static String msgLength = "MyArraySizeException: Размеры должны быть 4X4";
    private static String msgData = "MyArrayDataException: wrong data at element";


    public static int sumArrayElements(String[][] data) throws MyArraySizeException, MyArrayDataException {



        for (String[] row : data) {
            if (row.length !=4) throw new MyArraySizeException(msgLength);
        }

        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                try {
                    sum += Integer.parseInt(data[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format(msgData, i+1, j+1, data[i][j]));
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
}
