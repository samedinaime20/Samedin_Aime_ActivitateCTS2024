public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital createPersonal(){
        return new Brancardier();
    }
}
