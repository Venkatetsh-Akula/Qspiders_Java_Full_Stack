public class ClassCastExceptionDriver {
    public static void main(String[] args){
        ClassCastExceptionSubClassC u=new ClassCastExceptionSubClassC();
        ClassCastExceptionClassA v=u;
        ClassCastExceptionSubClassB z=(ClassCastExceptionSubClassB)v;
        z.demo();
        z.check();
        // z.test(); CTE there is no relation between class file of C and B no typeCast can't be formed 
    }
}
