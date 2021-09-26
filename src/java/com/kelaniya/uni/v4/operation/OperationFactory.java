<<<<<<< HEAD
package java.com.kelaniya.uni.v4.operation;

//Factory design pattern
public class OperationFactory {

    public Operation getInstance(String operator){

        Operation operation=null;

        if(operator.equals("add"))
        {
            operation=new Addoperation();

        }else if(operator.equals("sub"))
        {
            operation=new Suboperation();

        }else if(operator.equals("mul"))
        {
            operation=new Muloperation();
        }else if(operator.equals("div"))
        {
            operation=new Divoperation();
        }

        return operation;
    }

}
=======
package java.com.kelaniya.uni.v4.operation;

//Factory design pattern
public class OperationFactory {

    public Operation getInstance(String operator){

        Operation operation=null;

        if(operator.equals("add"))
        {
            operation=new Addoperation();

        }else if(operator.equals("sub"))
        {
            operation=new Suboperation();

        }else if(operator.equals("mul"))
        {
            operation=new Muloperation();
        }else if(operator.equals("div"))
        {
            operation=new Divoperation();
        }

        return operation;
    }

}
>>>>>>> 59c9e61ad90e8ee88233248d694dbcf9b23cfc8d
