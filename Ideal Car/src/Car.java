
public class Car
	{
		private	int weight;
		private int horsepower;
		private int torque;
		private int wheelbase;
		private String color;
		private double topSpeed;
		private String make;
		private String model;
		private int year;
		private String nickname;
		private int miles;
		private int price;
		
		public Car(int w, int h, int t, int wB,  String c,double tS, String m, String mo, int y,String n, int mi, int p)
			{
				weight =w;
				horsepower=h;
				torque = t;
				wheelbase = wB;
				color = c;
				topSpeed = tS;
				make = m;
				model = mo;
				year = y;
				nickname =n;
				miles = mi;
				price = p;
			}
		public int getWeight()
			{
				return weight;
			}
		public void setWeight(int weight)
			{
				this.weight = weight;
			}
		public int getHorsepower()
			{
				return horsepower;
			}
		public void setHorsepower(int horsepower)
			{
				this.horsepower = horsepower;
			}
		public int getTorque()
			{
				return torque;
			}
		public void setTorque(int torque)
			{
				this.torque = torque;
			}
		public int getWheelbase()
			{
				return wheelbase;
			}
		public void setWheelbase(int wheelbase)
			{
				this.wheelbase = wheelbase;
			}
		
			
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public double getTopSpeed()
			{
				return topSpeed;
			}
		public void setTopSpeed(double topSpeed)
			{
				this.topSpeed = topSpeed;
			}
		public String getMake()
			{
				return make;
			}
		public void setMake(String make)
			{
				this.make = make;
			}
		public String getModel()
			{
				return model;
			}
		public void setModel(String model)
			{
				this.model = model;
			}
		public int getYear()
			{
				return year;
			}
		public void setYear(int year)
			{
				this.year = year;
			}
		public String getNickname()
			{
				return nickname;
			}
		public void setNickname(String nickname)
			{
				this.nickname = nickname;
			}
		public int getMiles()
			{
				return miles;
			}
		public void setMiles(int miles)
			{
				this.miles = miles;
			}
		public int getPrice()
			{
				return price;
			}
		public void setPrice(int price)
			{
				this.price = price;
			}
	}
