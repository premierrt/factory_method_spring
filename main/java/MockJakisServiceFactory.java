/**
 * Created by rafal on 11.03.17.
 */
public class MockJakisServiceFactory implements  JakisServiceFactoryMethodClass {
    @Override
    public JakisService createJakisService() {
        //tutaj robi duzo rzeczy zwiazanych z tworzeniem obiektu
        return new MockJakisServiceImpl();
    }
}
