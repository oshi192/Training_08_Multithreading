import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    List<Doc> queue = new ArrayList();

    void fillQueye(){
        for (int i = 0; i < 200; i++) {
            queue.add(new Doc(DocType.Biologist)) ;
        }
        for (int i = 0; i < 250; i++) {
            queue.add(new Doc(DocType.Mathematics)) ;
        }
        Collections.shuffle(queue);
    }
}
