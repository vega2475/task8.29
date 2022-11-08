package VSU.CS.VEGA;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputAndOutput output = new InputAndOutput();
        String error = "You entered a non-rectangular matrix, please check the data and re-enter.";
        try {
            output.readMtx();
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.err.print(error);
        }


    }
}