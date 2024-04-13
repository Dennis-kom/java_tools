public class Singleton {

    // Instance Variables
    private static Singleton instance;
    private String title;

    /**Constructor**/
    public Singleton(){}

    /**Returning the instance of current object while keeps only one instance of it**/
    public static synchronized Singleton getInstance(){

        if(instance ==  null){
            instance = new Singleton();
        }

        return instance;
    }
    /**Returning the title of instance if the instance exists otherwise throw exception*/
    public String getInstanceTitle() throws ExceptionInInitializerError {
        if(instance == null) throw new ExceptionInInitializerError();
        return instance.title;
    }

}
