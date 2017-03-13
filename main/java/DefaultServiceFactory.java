/**
 * Created by rafal on 11.03.17.
 */
public class DefaultServiceFactory implements JakisServiceFactoryMethodClass {


    @Override
    public JakisService createJakisService() {
        return new DefultJakisServiceImpl();
    }
}


