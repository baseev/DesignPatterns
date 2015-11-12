package patterns.creational.builder;

public class Computer
{
    private String RAM;
    private Long HDD;
    
    public Computer(ComputerBuilder computerBuilder)
    {
        this.RAM = computerBuilder.RAM;
        this.HDD = computerBuilder.HDD;
    }    
    
    public String getRAM()
    {
        return RAM;
    }
    public void setRAM(String rAM)
    {
        RAM = rAM;
    }
    public Long getHDD()
    {
        return HDD;
    }
    public void setHDD(Long hDD)
    {
        HDD = hDD;
    }
    
    
    public static class ComputerBuilder {
        public String RAM;
        public Long HDD;
        
        public ComputerBuilder setRAM(String rAM)
        {
            RAM = rAM;
            return this;
        }
        
        public ComputerBuilder setHDD(Long hDD)
        {
            HDD = hDD;
            return this;
        }
        
        public Computer build() {
            return new Computer(this);
        }
        
    }
}
