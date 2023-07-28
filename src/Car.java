public class Car extends Vehicle{
        public int numDoors;
        public Car(String brand,String model,int year,int numDoors){
                this.brand=brand;
                this.model=model;
                this.year=year;
                this.numDoors=numDoors;
        }
        @Override
        public void displayInfo(){
                System.out.println("Brand: "+brand+"\nModel: "+model+"\nYear: "+year+"\nNumber of Doors: "+numDoors);
        }
}
