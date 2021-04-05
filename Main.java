package Example1;


public class Main {

public static void main(String[] args) {
		
		KitchenAppliances1 Sunpentown = new KitchenAppliances1();
		System.out.println("The Brand of Breakfastmaker: " + Sunpentown.brand);
		System.out.println("The Voltage of Breakfastmaker: " + Sunpentown.voltage);
		System.out.println("The Oven Capacity of Breakfastmaker: " + Sunpentown.ovenCapacity);
		Sunpentown.bake();
		Sunpentown.toast();
		Sunpentown.fry();
		
		System.out.println();
		
		KitchenAppliances2 Sharp = new KitchenAppliances2();
		System.out.println("The Brand of Microwave Oven: " + Sharp.brand);
		System.out.println("The Model of Microwave Oven: " + Sharp.model);
		System.out.println("The Oven Capacity of Microwave Oven: " + Sharp.ovenCapacity);
		Sharp.bake();
		Sharp.grill();
		Sharp.defrost();
		

	}


}
