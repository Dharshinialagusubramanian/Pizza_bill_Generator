package PizzaBillGenerator;

 class Pizza {
	private int Price;
	private boolean veg;
	private int ExtraCheeseAdded=100;
	private int ExtraToppingsAdded=150;
	private int BackpackPrice=20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isTakeAway=false;
	
	public Pizza(boolean veg) {
		super();
		this.veg=veg;
		if(this.veg)
		{
			this.Price=300;
		}
		else
		{
			this.Price=400;
		}
		basePizzaPrice=this.Price;
	}
	public void addExtraCheese()
	{
		isExtraCheeseAdded=true;
		//System.out.println("Extra Cheese Added");
		this.Price +=ExtraCheeseAdded;
	}
	public void addExtraToppings()
	{
		isExtraToppingsAdded=true;
		//System.out.println("Extra Toppings Added");
		this.Price +=ExtraToppingsAdded;
	}
	public void Takeaway()
	{
		isTakeAway=true;
		//System.out.println("Take Away");
		this.Price +=BackpackPrice;
		
	}
	public void getbill()
	{
		String bill = "";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isExtraCheeseAdded)
		{
			bill += "Extra Cheese Added: "+ExtraCheeseAdded+"\n";
		}
		if(isExtraToppingsAdded)
		{
			bill += "Extra Toppings Added: "+ExtraToppingsAdded+" \n";
		}
		if(isTakeAway)
		{
			bill +="Take away: "+BackpackPrice;
		}
		bill += "Bill: "+this.Price +" \n";
		System.out.println(bill);
	}
 }
	
	class DeluxPizza extends Pizza
	{
		public DeluxPizza(boolean veg) {
			super(veg);
			super.addExtraCheese();
			super.addExtraToppings();
		}

		@Override
		public void addExtraCheese() {
			
			super.addExtraCheese();
		}

		@Override
		public void addExtraToppings() {
			 
			super.addExtraToppings();
		}
	}


public class Main {

	public static void main(String[] args) {
		boolean veg;
		Pizza basePizza=new Pizza(veg=true);
		basePizza.addExtraCheese();
		basePizza.addExtraToppings();
		basePizza.Takeaway();
		basePizza.getbill();
		DeluxPizza dp=new DeluxPizza(veg=false);
		dp.addExtraCheese();
		dp.addExtraToppings();
		dp.getbill();
	
		

	}

}
