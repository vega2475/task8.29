import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


import static java.lang.System.out;

public class InputAndOutput {

    void readMtx() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        ArrayList<String> lines = new ArrayList<>();
        while (br.ready()) {
            lines.add(br.readLine());
        }
        int matrixHeight = lines.size();

        Integer[][] matrix = new Integer[matrixHeight][];

        for(int i = 0; i < matrixHeight; ++i) {
            String[] nums = lines.get(i).split("\s*,\s*");
            matrix[i] = new Integer[nums.length];
            for(int j = 0; j < nums.length; ++j) {
                matrix[i][j] = Integer.valueOf(nums[j]);
            }
        }

        for (int i = 0; i < matrixHeight; ++i) {
            //System.out.println(Arrays.toString(matrix[i]));
           out.println(Arrays.toString(matrix[i]).replaceAll("^\\[|]$", ""));
        }
    }




}
