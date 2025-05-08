public class App {
    public static void main(String[] args) throws Exception {
        //HDMI
        HDMI HDMI1 = new HDMI();
        //VGA
        VGA Adapter = new VGAtoHDMIAdapter(HDMI1);

        Monitor monitor = new Monitor();

        System.out.println();
        monitor.turnon(Adapter);
        System.out.println();

    }
}
