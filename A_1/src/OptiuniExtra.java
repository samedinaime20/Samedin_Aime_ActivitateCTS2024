public class OptiuniExtra {
    private boolean isPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciCamera;
    private boolean hasHalatInterior;

   public OptiuniExtra(){
       super();
       this.isPatRabatabil = false;
       this.hasMicDejun = false;
       this.hasPapuciCamera = false;
       this.hasHalatInterior = false;
   }
   public OptiuniExtra(boolean isPatRabatabil , boolean hasMicDejun , boolean hasPapuciCamera , boolean hasHalatInterior){
       super();
       this.isPatRabatabil = isPatRabatabil;
       this.hasMicDejun = hasMicDejun;
       this.hasPapuciCamera = hasPapuciCamera;
       this.hasHalatInterior = hasHalatInterior;
   }

    public boolean isPatRabatabil() {
        return isPatRabatabil;
    }

    public void setPatRabatabil(boolean isPatRabatabil) {
        this.isPatRabatabil = isPatRabatabil;
    }

    public boolean isHasMicDejun(){
       return hasMicDejun;
    }

    public void setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
    }

    public boolean isHasPapuciCamera() {
        return hasPapuciCamera;
    }

    public void setHasPapuciCamera(boolean hasPapuciCamera) {
        this.hasPapuciCamera = hasPapuciCamera;
    }

    public boolean isHasHalatInterior() {
        return hasHalatInterior;
    }

    public void setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
    }

    @Override
    public String toString(){
       return "OptiuniExtra [" +
               "isPatRabatabil=" + isPatRabatabil+
               ", hasMicDejun=" + hasMicDejun+
               ", hasPapuciCamera=" + hasPapuciCamera+
               ", hasHalatInterior=" + hasHalatInterior+
               ']';
    }
}

