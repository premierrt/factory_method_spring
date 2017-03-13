/**
 * Created by rafal on 11.03.17.
 */
public class Main {




    public static void main (String[] args){

         int flaga=1;

        if (flaga ==1 ){
           // DefaultJavasFacade facade = new DefaultJavasFacade(new DefaultServiceFactory());
            DefaultJavasFacade facade = new DefaultJavasFacade(new MockJakisServiceFactory());
            facade.sayHello();
            facade.getDate();
        }



    }

}
