public class Call_by_Ref {
    int a;
    int b;

        private static void Add(Call_by_Ref obj, Call_by_Ref delta)
        {
            obj.a = 20;
            System.out.println("Result from method "+ (obj.a + obj.b));
        }
        
        public static void main(String[] args) {
        Call_by_Ref obj = new Call_by_Ref();
       
        obj.a = 10;
        obj.b = 40;
        System.out.println("beforing passing value "+ (obj.a+obj.b));

        Call_by_Ref.Add(obj,obj);
        System.out.println("Sum of two numbers is "+ (obj.a+obj.b));





    }
    
}
