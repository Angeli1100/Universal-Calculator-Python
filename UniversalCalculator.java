//SC12203 Object-Oriented Programming (OOP)
//Mini Project Title Selection: 1. Universal Calculator
//Session 2019/2020 Semester 2
//Name: Angeli Anak David
//Matric Number: BS19110452
//Date Submission: 14 August 2020 (Friday)
//Lecturer: Mdm. Norhafiza Binti Hamzah

import java.util.Scanner;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

	public class UniversalCalculator {
	public static void main (String args []){

		UniversalCalculator clc = new UniversalCalculator();
		int option;
		char a;

		//Introduction to User
								System.out.println("__Welcome to Magic Universal Calculator__");
								System.out.println("Geometric Calculator: Calculator A ");
								System.out.println("Converter Calculator: Calculator B ");

		while(clc.yesno(clc) != 'y')
		{
		//User choose the calculator
		System.out.println("Please choose the calculator: A or B ");

		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);


		if ( a == 'A' || a == 'a')
		{
		//User can choose which method he/she want to apply

		System.out.println("Calculator you choose: Geometric Calculator");
		System.out.println("Please choose the method:");
		System.out.println(" 1 = Area of Rectangle/Square");
		System.out.println(" 2 = Area of Triangle");
		System.out.println(" 3 = Area of Circle");
		System.out.println(" 4 = Diameter");
		System.out.println(" 5 = Regular Polygon");
		System.out.println(" 6 = Circumference");
		option = sc.nextInt();

		clc.AreaofPolygons (sc, option);
		System.out.println();

		//Declare for Timestamp for each method User choose
		if (option == 1)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Geometric Calculator" + " : " + "Area of Rectangle/Square");
		}
		else if (option == 2)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Geometric Calculator" + " : " + "Area of Triangle");
		}
		else if (option == 3)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Geometric Calculator" + " : " + "Area of Circle");
		}
		else if (option == 4)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Geometric Calculator" + " : " + "Diameter");
		}
		else if (option == 5)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Geometric Calculator" + " : " + "Regular Polygon");
		}
		else if (option == 6)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Geometric Calculator" + " : " + "Circumference");
		}
		System.out.println();
		}

		else if(a == 'B' || a == 'b')
		{
			//User choose the method he/she want to apply

		System.out.println("Calculator you choose: Converter Calculator");
		System.out.println("Please choose the method: ");
		System.out.println("1 = Length");
		System.out.println("2 = Temperature");
		System.out.println("3 = Volume");
		option = sc.nextInt();

		clc.Converter (sc, option);
		System.out.println();

		//Timesatamp for each method User choose
		if (option == 1)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Converter Calculator" + " : " + "Length");
		}
		else if (option == 2)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Converter Calculator" + " : " + "Temperature");
		}
		else if (option == 3)
		{
		System.out.println (clc.DateToTimestamp () + " " + "Converter Calculator" + " : " + "Volume");
		}
		System.out.println ();
		}
	}
		}

//Area of polygon

	private double areaofRectangleSquare;
	private double areaofTriangle;
	private double areaofCircle;
	private double diameter;
	private double circumference;
	private double areaofRegularPolygon;
	private double width;
	private double height;
	private double length;
	private double base;
	private double radius;
	private double apothem;
	private double perimeter;
	double pi = 3.142;

	//Calculate the area of geometric shape method

	public void AreaofPolygons (Scanner sc, int option)
	{
		switch (option)
		{

		//Calculate area of Rectangle/Square
		case 1:
		System.out.println("Calculate the Area of Rectangle/Square:");
		System.out.println("Enter the width of Rectangle/Square:");
		width = sc.nextDouble();

		System.out.println("Enter the length of Rectangle/Square:");
		length = sc.nextDouble();

		//Area of Rectangle/Square= width*height:

		areaofRectangleSquare = width * length;
		System.out.println("Area of Rectangle/Square is " +areaofRectangleSquare);

		break;

		//Calculate area of Triangle
		case 2:
		System.out.println("Calculate the Area of Triangle:");
		System.out.println("Enter the base of triangle:");
		base = sc.nextDouble();

		System.out.println("Enter the height of triangle:");
		height = sc.nextDouble();

		//Area of Triangle = 0.5 * base * height:

		areaofTriangle = 0.5 * base * height;
		System.out.println("Area of Triangle is " +areaofTriangle);

		break;

		//Calculate area of Circle
		case 3:
		System.out.println("Calculate the Area of Circle:");
		System.out.println("Enter the radius of circle:");
		radius = sc.nextDouble();


		//Area of circle = pi * radius * radius

		areaofCircle = pi * radius * radius;
		System.out.println("Area of circle is " +areaofCircle);

		//Calculate diameter of polygon
		case 4:
		System.out.println("Calculate the Diameter of polygon");
		System.out.println("Enter the radius of circle:");
		radius = sc.nextDouble();

		System.out.println("Calculate the value of diameter:");
		//Diamater of circle = radius * radius
		diameter = radius * radius;
		System.out.println("Diameter of polygon is " +diameter);

		break;

		//Calculate area of regular polygon
		case 5:
		System.out.println("Calculate the Area of Regular polygon:");
		System.out.println("Enter the apothem of regular polygon:");
		apothem =sc.nextDouble();

		System.out.println("Enter the perimeter of regular polygon:");
		perimeter = sc.nextDouble();

		//Area of regular perimeter = 0.5 * apothem * perimeter

		areaofRegularPolygon = 0.5 * apothem * perimeter;
		System.out.println("Area of Regular Polygon is " +areaofRegularPolygon);

		break;

		//Calculate the circumference of polygon
		case 6:
		System.out.println("Calculate the Circumference of polygon:");
		System.out.println("Enter the radius of polygon: ");
		radius =sc.nextDouble();

		//Circumference of polygon = 2 * pi * radius

		circumference = 2 * pi * radius;
		System.out.println("Circumference of Polygon is " +circumference);

		break;

		}
	}

		// Convert Centimeter to various unit

		private double lengthincm;
		private double milimeter;
		private double meter;
		private double inch;
		private double foot;
		private double kilometer;
		private double mile;

		//Convert the value of temperature

		public double celcius;
		public double Fehrenheit;

		//Convert the value of Volume

		public double litre;
		public double millilitre;
		public double gallon;


		//Convert the value of length in Centimeter to mm, m, inch, foot, km, mile

		public void Converter (Scanner sc, int option)
		{
			if(option == 1)
			{
			System.out.println ("Please choose which unit of length to convert: ");
			System.out.println ("1 = Centimeter to milimeter");
			System.out.println ("2 = Centimeter to meter");
			System.out.println ("3 = Centimeter to inch");
			System.out.println ("4 = Centimeter to foot");
			System.out.println ("5 = Centimeter to KM");
			System.out.println ("6 = Centimeter to mile");
			int unitlength = sc.nextInt();

			switch (unitlength)

			{

			//Convert CM to MM

			case 1:
			System.out.println("Enter the value of length (Centimeter): ");
			lengthincm = sc.nextDouble();

			//convert to milimeter

			milimeter = lengthincm * 10;
			System.out.println("cm to mm: " +milimeter+ " milimeter");

			break;

			//Convert CM to M

			case 2:
			System.out.println("Enter the value of length (Centimeter): ");
			lengthincm = sc.nextDouble();

			//convert to meter

			meter = lengthincm / 100;
			System.out.println("Length in meter is " +meter+ " meter");

			break;

			//Convert CM to INCh

			case 3:
			System.out.println("Enter the value of length (Centimeter): ");
			lengthincm = sc.nextDouble();

			//convert to inch
			inch = lengthincm / 2.54;
			System.out.println("cm to inch: " +inch+ " inch");

			break;

			//Convert CM to FOOT

			case 4:
			System.out.println("Enter the value of length (Centimeter): ");
			lengthincm = sc.nextDouble();

			//convert to foot

			foot = lengthincm / 30.48;
			System.out.println("cm to foot: " +foot+ " foot");

			break;

			//Convert CM to KM

			case 5:
			System.out.println("Enter the value of length (Centimeter): ");
			lengthincm = sc.nextDouble();

			//convert to kilometer

			kilometer = lengthincm / 100000;
			System.out.println("cm to km: " +kilometer+ " KM");

			break;

			//Convert CM to MILE

			case 6:
			System.out.println("Enter the value of length (Centimeter): ");
			lengthincm = sc.nextDouble();

			//convert to mile
			mile = lengthincm / 160934;
			System.out.println("cm to mile: " +mile+ " mile");

			break;

			}
		}


			//Convert the temperature (Celcius - Fehrenheit and Fehreinheit - Celcius)


			else if (option == 2)
			{
			System.out.println ("Please choose which unit temperature to convert: ");
			System.out.println ("1 = Celcius to Fahrenheit");
			System.out.println ("2 = Fahrenheit to Celcius");
			int unittemperature = sc.nextInt();

			switch (unittemperature)

			{

			//Convert temperature Celcius to Fehrenheit

			case 1:
			System.out.println("Convert Celcius to Fehrenheit:");
			System.out.println("Enter the value of Temperature: ");
			celcius = sc.nextDouble();

			//Temperature in Fehrenheit

			Fehrenheit = (celcius * (9/5)) + 32;
			System.out.println("Celcius to Fehrenheit:" +Fehrenheit+ " F");

			break;

			//Convert temperature Fehrenheit to Celcius

			case 2:
			System.out.println("Convert Fehrenheit to Celcius:");
			System.out.println("Enter the value of Temperature: ");
			Fehrenheit = sc.nextDouble();

			//Temperature in Celcius

			celcius = (Fehrenheit - 32) * 5/9;
			System.out.println("Fehrenheit to Celcius:" +celcius+ " C");

			break;

			}
		}


			//Covert the volume of liquid(litre, millilitre, gallon)


			else if (option == 3)
			{
			System.out.println ("Please choose which unit volume to convert: ");
			System.out.println ("1 = liter to milliliter");
			System.out.println ("2 = liter to gallon");
			int unitvolume = sc.nextInt ();

			switch (unitvolume)

			{

			//Convert litre to millilitre

			case 1:
			System.out.println("Convert Litre to Mililitre:");
			System.out.println("Enter the value of Volume: ");
			litre = sc.nextDouble();

			//litre convert to mililitre

			millilitre = litre * 1000;
			System.out.println("Litre to Mililitre = " +millilitre+ " ml");

			break;

			//Convert litre to gallon

			case 2:
			System.out.println("Convert Litre to gallon:");
			System.out.println("Enter the value of Volume: ");
			litre = sc.nextDouble();

			//litre convert to gallon

			gallon = litre / 4.546;
			System.out.println("Litre to gallon = " +gallon+ " gallon");

			break;

			}
			}
		}

		//Timestamp Method

		public String DateToTimestamp(){

			Date date = new Date();
			Timestamp ts = new Timestamp(date.getTime());
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy MMM dd 'at' HH:mm:ss");

			return formatter.format (ts);
		}


		//User make decision to continue or quit the program - method

		public int yesno (UniversalCalculator clc)
		{
			Scanner userInput = new Scanner (System.in);
			boolean noSelection = false;

			do{
			System.out.print("Do you want to continue the calculation? Y/N ");
			char userChoice = userInput.next().charAt(0);
			switch(userChoice) {

			//User choose Y to quit the program
			case 'y' :case 'Y':
			noSelection = true;

			break;

			//User choose N to continue the program
			case 'n' : case 'N':
			System.out.println("Thank you. Have a nice day. . .");
			System.exit(0);

			break;

			//User did not put a correct variable
			default:
			System.out.println("That is not a valid entry");
			}

			} while (!noSelection);
				return 1;
			}
	}