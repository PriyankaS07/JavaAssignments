 class Singleton {

   private static Singleton singleton = new Singleton( );

   private Singleton() { }

   /* Static 'instance' method */
   public static Singleton getInstance( ) {
      return singleton;
   }

   protected static void demoMethod( ) {
      System.out.println("Hi from singleton");
   }
}
public class SingletonTest {

   public static void main(String[] args) {
      Singleton tmp = Singleton.getInstance( );
      tmp.demoMethod( );
      Singleton tmp1 = Singleton.getInstance( );
      tmp1.demoMethod( );
      System.out.println(tmp);
      System.out.println(tmp1);
   }
}

 /*class Childclass extends Singleton{

} */