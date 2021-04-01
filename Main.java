package Example1;


public class Main {

public static void main(String[] args) {
		
		BreakfastMaker Sunpentown = new BreakfastMaker();
		System.out.println("Brand: " + Sunpentown.brand);
		System.out.println("Voltage: " + Sunpentown.voltage);
		System.out.println("Oven Capacity: " + Sunpentown.ovenCapacity);
		Sunpentown.bake();
		Sunpentown.toast();
		Sunpentown.fry();
		
		System.out.println();
		
		MicrowaveOven Sharp = new MicrowaveOven();
		System.out.println("Brand: " + Sharp.brand);
		System.out.println("Model: " + Sharp.model);
		System.out.println("Oven Capacity: " + Sharp.ovenCapacity);
		Sharp.bake();
		Sharp.grill();
		Sharp.defrost();
		

	}


}
