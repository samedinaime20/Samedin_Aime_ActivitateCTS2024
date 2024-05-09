public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital createPersonal(){
        return new Medic();
    }
}
