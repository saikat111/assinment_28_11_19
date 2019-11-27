public class T {
   static void th(){
        try{  System.out.println("inside try");
            throw new NullPointerException("saikat");

        }
        catch(NullPointerException e){
            System.out.println("inside c");
            System.out.println(e);
            throw e;
        }

    }

    public static void  main(String args[]){
        try{
            th();

        }
        catch(NullPointerException e){
            System.out.println("inside main");

        }


    }
}
