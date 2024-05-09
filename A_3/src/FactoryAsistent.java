public class FactoryAsistent implements Factory{
    @Override
    public PersonalSpital createPersonal(){
        return new Asistent();
    }
}
