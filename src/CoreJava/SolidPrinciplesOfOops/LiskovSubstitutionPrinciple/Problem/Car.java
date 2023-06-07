package CoreJava.SolidPrinciplesOfOops.LiskovSubstitutionPrinciple.Problem;

public class Car extends Vehicle{
    @Override
    public Integer getNumberOfWheels(){
        return 4;
    }
}
