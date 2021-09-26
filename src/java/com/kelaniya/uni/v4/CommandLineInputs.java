<<<<<<< HEAD
package java.com.kelaniya.uni.v4;

public class CommandLineInputs {

    private final String[] args;

    //Constructor fo the class
    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }

public String getOperator(){

    //Make sure to validate the arguments before using
    if(args.length==0){
        System.out.println("Please provide the operation as an argument");
        return "";
    }
    String operator=args[0];

    if(operator.equals("add")||operator.equals("sub")||operator.equals("mul")||operator.equals("div")){
        System.out.println("Please provide add,sub, mul or div as the operator argument");
        return "";
    }
    return  operator;
}

}
=======
package java.com.kelaniya.uni.v4;

public class CommandLineInputs {

    private final String[] args;

    //Constructor fo the class
    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }

public String getOperator(){

    //Make sure to validate the arguments before using
    if(args.length==0){
        System.out.println("Please provide the operation as an argument");
        return "";
    }
    String operator=args[0];

    if(operator.equals("add")||operator.equals("sub")||operator.equals("mul")||operator.equals("div")){
        System.out.println("Please provide add,sub, mul or div as the operator argument");
        return "";
    }
    return  operator;
}

}
>>>>>>> 59c9e61ad90e8ee88233248d694dbcf9b23cfc8d
