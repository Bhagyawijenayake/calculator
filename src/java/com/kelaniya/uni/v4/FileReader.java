<<<<<<< HEAD
package java.com.kelaniya.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public Double[] getNumbers() throws IOException {

        //Read the numbers text file
        List<String> numbersStrs= Files.readAllLines(Paths.get("C:\\Users\\user\\Desktop\\Software construction git repo\\calculator\\src\\java\\com\\kelaniya\\uni\\numbers.txt"));
        double number1=Integer.parseInt(numbersStrs.get(0));
        double number2=Integer.parseInt(numbersStrs.get(1));
        return new Double[] {number1,number2};

    }
=======
package java.com.kelaniya.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public Double[] getNumbers() throws IOException {

        //Read the numbers text file
        List<String> numbersStrs= Files.readAllLines(Paths.get("C:\\Users\\user\\Desktop\\Software construction git repo\\calculator\\src\\java\\com\\kelaniya\\uni\\numbers.txt"));
        double number1=Integer.parseInt(numbersStrs.get(0));
        double number2=Integer.parseInt(numbersStrs.get(1));
        return new Double[] {number1,number2};

    }
>>>>>>> 59c9e61ad90e8ee88233248d694dbcf9b23cfc8d
}