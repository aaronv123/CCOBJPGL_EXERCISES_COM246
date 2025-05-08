//adapter
class VGAtoHDMIAdapter implements VGA{
    private HDMI hdmi;

    public VGAtoHDMIAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void connectwithVGA() {
        System.out.println("Adapting VGA to HDMI.");
        hdmi.connectwithHDMI();
    }
    
}
