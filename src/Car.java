public class Car {

String brand;
String model;
double engineCapacity;
String bodyColor;
int yearOfProduction;
String countryOfManufacture;

Car (){
    brand = " default";
    model = " default";
    countryOfManufacture = " default";
    engineCapacity = 1.5;
    bodyColor = " Белый";
    yearOfProduction = 2000;
}

Car (String brand,String model, double engineCapacity,String bodyColor,int yearOfProduction,String countryOfManufacture) {
    this.brand = brand;
    this.yearOfProduction = yearOfProduction;
    this.engineCapacity= engineCapacity;
    this.bodyColor = bodyColor;
    this.model = model;
    this.countryOfManufacture =countryOfManufacture;

}

void cars(){
    System.out.println("Марка автомобиля " + brand + ", модель " + model +  ", год выпуска " + yearOfProduction + ", произведена в " + countryOfManufacture + ", объем двигателя " + engineCapacity + " л., цвет кузова " + bodyColor);
}
}
