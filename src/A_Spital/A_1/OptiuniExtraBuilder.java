package A_Spital.A_1;

public class OptiuniExtraBuilder {
    private boolean isPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciCamera;
    private boolean hasHalatInterior;

    public OptiuniExtraBuilder(){
        this.isPatRabatabil = false;
        this.hasMicDejun = false;
        this.hasPapuciCamera = false;
        this.hasHalatInterior = false;
    }

    public OptiuniExtra build(){
        return new OptiuniExtra(isPatRabatabil , hasMicDejun , hasPapuciCamera , hasHalatInterior);
    }
    public OptiuniExtraBuilder setPatReglabil(boolean isPatRabatabil){
        this.isPatRabatabil = isPatRabatabil;
        return this;
    }
    public OptiuniExtraBuilder setHasMicDejun(boolean hasMicDejun){
        this.hasMicDejun = hasMicDejun;
        return this;
    }
    public OptiuniExtraBuilder setHasPapuciCamera(boolean hasPapuciCamera){
        this.hasPapuciCamera = hasPapuciCamera;
        return this;
    }
    public OptiuniExtraBuilder setHasHalatInterior(boolean hasHalatInterior){
        this.hasHalatInterior = hasHalatInterior;
        return this;
    }
}
