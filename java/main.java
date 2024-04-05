class main { 
    public static void main (string []
    args) {

System.out.println
("Inicializando....");
System.out.println("Car....");
Car car = new Car ("AMQ123", new 
Account("Andres Loiza", "ADN1235", "andresl@hotmail.com", "12365"));
car.passenger = 4;
car.printDatacar();

System.out.println("Uberx....");
UberX uberx = new UberX ("MKL185", new Account ("Maria Loyola", "JKL12365", 
"marial@hotmail.com", "125478"), "Toyota", "Corolla");
UberX.printDatacar();

System.out.println("Uberblack");
Uberblack uberblack = new uberblack("2MKL1234", new Account("Jose Sanchez","JHL2345",
"jose@gmail.com"),"23434","NISSN","corolla");
Uberblack.printDatacar();
