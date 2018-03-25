package builder.simple1;

/**
 * 作者: zengqinrui on 18/2/27 21:47
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 电脑->要创建的对象
 * 备注:
 */
public class Computer {

    private String memory; // 内存
    private String display; // 显卡
    private String cpu;


    // 私有构造函数
    private Computer() {

    }

    private Computer(WindowComputerBuild builder) {
        this.memory = builder.getMemory();
        this.display = builder.getDisplay();
        this.cpu = builder.getCpu();
    }


    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * 作者: zengqinrui on 18/2/27 21:48
     * 邮箱：zengqinrui@szy.cn
     * 功能描述: 定义构建电脑的规范
     * 备注: 也可不用定义规范，直接使用
     */
    public interface Builder {

        Builder setMemory(String memory);

        Builder setDisplay(String display);

        Builder setCpu(String cpu);

        Computer build();
    }

    /**
     * 创建苹果电脑的规范，方式一(推荐用这种), 保证了Computer实体类的干净
     */
    public static class MacBookProComputerBuild implements Builder {


        private Computer computer;

        public MacBookProComputerBuild() {
            computer = new Computer();
        }


        @Override
        public Builder setCpu(String cpu) {
            computer.setCpu(cpu);
            return this;
        }

        @Override
        public Builder setDisplay(String display) {
            computer.setDisplay(display);
            return this;
        }

        @Override
        public Builder setMemory(String memory) {
            computer.setMemory(memory);
            return this;
        }


        @Override
        public Computer build() {
            return computer;
        }
    }

    /**
     * 方式二，在build方法中，将this（builder)传入要构造的对象里面
     */
    public static class WindowComputerBuild implements Builder{

        private String memory;
        private String display;
        private String cpu;

        @Override
        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        @Override
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        @Override
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public String getMemory() {
            return memory;
        }

        public String getDisplay() {
            return display;
        }

        public String getCpu() {
            return cpu;
        }

        @Override
        public Computer build() {
            return new Computer(this);
        }
    }
}
