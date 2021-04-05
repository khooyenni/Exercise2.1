package Example1;


public class Main {

public static void main(String[] args) {
		
		BreakfastMaker Sunpentown = new BreakfastMaker();
		System.out.println("The Brand of Breakfastmaker: " + Sunpentown.brand);
		System.out.println("The Voltage of Breakfastmaker: " + Sunpentown.voltage);
		System.out.println("The Oven Capacity of Breakfastmaker: " + Sunpentown.ovenCapacity);
		Sunpentown.bake();
		Sunpentown.toast();
		Sunpentown.fry();
		
		System.out.println();
		
		Tablet Huawei = new Tablet();
		System.out.println("The Brand of Tablet: " + Huawei.brand);
		System.out.println("The Model of Tablet: " + Huawei.model);
		System.out.println("The Oven Capacity of Tablet: " + Huawei.colour);
		Huawei.call();
		Huawei.youtube();
		Huawei.notification();
		

	}


}
