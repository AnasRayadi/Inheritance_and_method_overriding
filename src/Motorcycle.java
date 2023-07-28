public class Motorcycle extends Vehicle{
    public boolean hasSidecar;
    public Motorcycle(String brand,String model,int year,boolean hasSidecar){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.hasSidecar=hasSidecar;
    }
    @Override
    public void displayInfo(){
        System.out.println("Brand: "+brand+"\nModel: "+model+"\nYear: "+year+"\nHas Sidecar: "+hasSidecar);
    }
}
