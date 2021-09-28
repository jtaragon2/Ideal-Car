
public class Car
	{
		private		int weight;
		private int horsepower;
		private int wheelbase;
		private double turningRadius;
		private String color;
		private double topSpeed;
		private String make;
		private String model;
		private int year;
		
		public Car(int w, int h, int wB, double tR, String c,double t, String m, String mo, int y)
			{
				weight =w;
				horsepower=h;
				wheelbase = wB;
				turningRadius = tR;
				color = c;
				topSpeed = t;
				make = m;
				model = mo;
				year = y;
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
		public int getWheelbase()
			{
				return wheelbase;
			}
		public void setWheelbase(int wheelbase)
			{
				this.wheelbase = wheelbase;
			}
		public double getTurningRadius()
			{
				return turningRadius;
			}
		public void setTurningRadius(double turningRadius)
			{
				this.turningRadius = turningRadius;
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
	}
