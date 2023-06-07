package CoreJava.SolidPrinciplesOfOops.LiskovSubstitutionPrinciple.Solution;

public class Car extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels(){
        return 4;
    }
}
