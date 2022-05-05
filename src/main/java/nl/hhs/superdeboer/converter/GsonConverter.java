package nl.hhs.superdeboer.converter;

import com.google.gson.Gson;

public interface GsonConverter{
    default String toJson() {
        Gson converter = new Gson();

        return converter.toJson(this);
    }
}
