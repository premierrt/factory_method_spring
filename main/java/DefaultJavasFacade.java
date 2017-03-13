/**
 * Created by rafal on 11.03.17.
 */

/**
 * Facaade zawsze korzysta z pol- typu interfejs
 * w konstruktorze jest podawany interfejs tworzacy konkretny wlasciwy obiekt
 */
public class DefaultJavasFacade implements JakasFacade {

    private JakisService jakisService;

    private JakisServiceFactoryMethodClass factoryMethodClass;

    public DefaultJavasFacade(JakisServiceFactoryMethodClass factoryMethodClass) {
        this.factoryMethodClass=factoryMethodClass;
        jakisService=factoryMethodClass.createJakisService();
    }


    public DefaultJavasFacade() {
    }

    @Override
    public String getDate() {
        String data=  jakisService.getDate();
        System.out.println(data);
        return data;
    }

    @Override
    public String sayHello() {
            return "elo elo!!!";
    }
}
