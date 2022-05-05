package nl.hhs.superdeboer.shoppinglist;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nl.hhs.superdeboer.converter.GsonConverter;
import nl.hhs.superdeboer.converter.LocalDateAdapter;
import nl.hhs.superdeboer.product.Flessen;
import nl.hhs.superdeboer.product.Product;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingListService {

    public static void convertListToJson(ArrayList<Product> products, String fileName) {

        String file = (new File("").getAbsolutePath() + "/src/main/resources/storage/" + fileName);

        try {
            Gson converter = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();

            FileWriter fileWriter = new FileWriter(file);
            converter.toJson(products, fileWriter);

            fileWriter.flush();
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void saveFlessen(){
        List<Object> studentList = Flessen.stream().map(student -> (Object) student).toList();
        ArrayList<Object> students = new ArrayList<>(studentList);
        return convertListToJson(flessen, "student.json");
    }

}
