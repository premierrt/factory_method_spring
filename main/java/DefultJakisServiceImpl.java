import java.util.Date;

/**
 * Created by rafal on 11.03.17.
 */
public class DefultJakisServiceImpl implements JakisService {

    @Override
    public String getDate() {
        return String.valueOf(new Date());
    }
}
