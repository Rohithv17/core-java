public class ExceptionHandling2 {

    public static int divideValues(int a , int b) throws Exception{
        if(b==0){
            throw new Exception("denominator should not be zero");
        }
        return a/b;
    }

    public static void main(String[] args) {

        try{
            System.out.println(divideValues(10,0));

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("executing by default");
        }
    }
}
