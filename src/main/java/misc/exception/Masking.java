package misc.exception;

import misc.domain.Bird;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Masking {
    private final Bird bird;

    public Masking(Bird bird) {
        this.bird = bird;
    }

    public void custom(OutputStream os, ObjectOutputStream oos) throws
            IOException{
        Bird clon = null;

        try {
            clon.getColor();
            oos.writeObject(clon);
        }
        finally {
            oos.close();
        }


    }
}
