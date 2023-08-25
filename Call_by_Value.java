public class Call_by_Value {
    int a;
    int b;

       static void Add(int s,int t)
        {
           s = 20;t=50;
            System.out.println("Result from method "+ (s + t));
        }
    public static void main(String[] args) {
        Call_by_Value obj = new Call_by_Value();
       
        obj.a = 10;
        obj.b = 40;
        System.out.println("beforing passing value "+ (obj.a+obj.b));

    Add(obj.a,obj.b);
        System.out.println("Sum of two numbers is "+ (obj.a+obj.b));





    }
    
}
