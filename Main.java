package Example1;


public class Main {

public static void main(String[] args) {
		
		KitchenAppliances1 Breakfastmaker = new KitchenAppliances1();
		System.out.println("The Brand of Breakfastmaker: " + Breakfastmaker.brand);
		System.out.println("The Voltage of Breakfastmaker: " + Breakfastmaker.voltage);
		System.out.println("The Oven Capacity of Breakfastmaker: " + Breakfastmaker.ovenCapacity);
		Breakfastmaker.bake();
		Breakfastmaker.toast();
		Breakfastmaker.fry();
		
		System.out.println();
		
		KitchenAppliances2 MicrowaveOven = new KitchenAppliances2();
		System.out.println("The Brand of Microwave Oven: " + MicrowaveOven.brand);
		System.out.println("The Model of Microwave Oven: " + MicrowaveOven.model);
		System.out.println("The Oven Capacity of Microwave Oven: " + MicrowaveOven.ovenCapacity);
		MicrowaveOven.bake();
		MicrowaveOven.grill();
		MicrowaveOven.defrost();
		

	}


}
