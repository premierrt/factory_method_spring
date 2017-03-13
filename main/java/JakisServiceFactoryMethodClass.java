/**
 * Created by rafal on 11.03.17.
 */
public interface JakisServiceFactoryMethodClass {
    /**
     *     tutaj robi duzo rzeczy zwiazanych z tworzeniem obiektu
        *
     * W zależności od impelmentacji tworzy obiekt implementująacy interfejs JakisService
     * https://pl.wikipedia.org/wiki/Metoda_wytw%C3%B3rcza_(wzorzec_projektowy)
     * We wzorcu występują dwie ogólne klasy bądź interfejsy definiujące pewien typ zasobów (Product)
     * oraz sposób ich tworzenia (Creator, metoda factoryMethod()).
     * Od nich wyprowadza się konkretne klasy zasobów (ConcreteProduct) wraz z tworzącymi je klasami wytwórczymi (ConcreteCreator),
     * które dostarczają odpowiednią implementację metody factoryMethod().
     * Komponent pragnący tworzyć zasoby i operować na nich, korzysta z ogólnych interfejsów Product oraz Creator,
     * umożliwiając wybór konkretnej implementacji w sposób dynamiczny[1].
     *
     *
     * Wzorzec hermetyzuje proces tworzenia obiektów, zamykając go za ściśle zdefiniowanym interfejsem.
     * Właściwość ta jest wykorzystywana, gdy tworzenie nowego obiektu jest złożoną operacją
     * (np. wymaga wstrzyknięcia dodatkowych zależności).
     * @return obiekt implementująacy interfejs JakisService
     */
 JakisService createJakisService() ;
//w tej metodzie bedzie sie dzialo duzo rzeczy zwiazanych z towrzniem obikety, a na koniec zostanie stworzony i zworcony nowy obiekt
    // w kodzie klasy ktora korzysta z tego obiektu bedzie tylko wywolanie tej metody, a nie cala powyzsza logika
}
