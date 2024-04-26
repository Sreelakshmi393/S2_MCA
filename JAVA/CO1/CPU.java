public class CPU{
int price;

class Processor{
int no_of_cores;
String manufacturer;
Processor(int no_of_cores, String manufacturer){
this.no_of_cores = no_of_cores;
this.manufacturer = manufacturer;
}
}

static class RAM{
int memory;
String manufacturer;
RAM(int memory, String manufacturer){
this.memory = memory;
this.manufacturer = manufacturer;
}
}

public static void main(String[] args){
CPU cpu = new CPU();
CPU.Processor processor = cpu.new Processor(10,"Intel");
CPU.RAM ram = new CPU.RAM(4,"Intel");

System.out.println("Information of processor");
System.out.println("Number of cores : " + processor.no_of_cores);
System.out.println("Manufacturer : "+processor.manufacturer);

System.out.println("Information of RAM");
System.out.println("Memory in GB : " +ram.memory);
System.out.println("Manufacturer : "+ram.manufacturer);

}
}