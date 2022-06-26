import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncoder implements IEncoder{

    @Override
    public String encode(String msg) {
        String urlResult = null;
        try {
            urlResult = URLEncoder.encode(msg,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        return urlResult;
    }
}
