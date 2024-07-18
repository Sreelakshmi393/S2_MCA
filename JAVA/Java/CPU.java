public class CPU {
    double price;
    class Processor{
        int no_of_cores;
        String manufacturer;
        Processor(int no_of_cores, String manufacturer){
            this.no_of_cores = no_of_cores;
            this.manufacturer = manufacturer;
        }
        void display(){
            System.out.println();
            System.out.print("Processor information");
            System.out.println();
            System.out.print("Number of cores : "+ this.no_of_cores);
            System.out.println();
            System.out.print("Manufacturer: "+ this.manufacturer);
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        RAM(int memory, String manufacturer){
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        void display(){
            System.out.print("RAM information");
            System.out.println();
            System.out.print("Memory : "+ this.memory);
            System.out.println();
            System.out.print("Manufacturer: "+ this.manufacturer);
        }
    }
    public static void main(String[] args) {
        CPU obj = new CPU();
        CPU.Processor p = obj.new Processor(5, "Intel");
        CPU.RAM r = new CPU.RAM(8, "ABCD");
        r.display();
        p.display();
    }
}
