import java.io.*;
import java.nio.charset.StandardCharsets;

@SaveTo(path = "text.txt")
public class TextContainer {
    String text = "text line про";
    @Saver
    public void save(String path) throws IOException {
        File file = new File(path);
        try (OutputStream op = new FileOutputStream(file)){
            byte [] bytes = text.getBytes();
            op.write(bytes);
        } catch (IOException e){
            e.printStackTrace();
        }


    }


}
