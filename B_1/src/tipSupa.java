public class tipSupa {

    private String numeSupa;

    private static tipSupa instanta = null;

    private tipSupa(String numeSupa){
        this.numeSupa= numeSupa;
    }

    public String getNumeSupa(){
        return numeSupa;
    }
    public void setNumeSupa(String numeSupa){
        this.numeSupa=numeSupa;
    }

    public static tipSupa getInstanta(String numeSupa){
        if (instanta==null){
            instanta=new tipSupa(numeSupa);
        }
        return instanta;
    }
}
