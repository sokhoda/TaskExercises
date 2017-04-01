package deadlock;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Thread1 implements Runnable {
    private ObjThreadSafe myObject;
    private ObjThreadSafe hisObject;

    @Override
    public void run() {
        myObject.meth(hisObject);
    }
}
