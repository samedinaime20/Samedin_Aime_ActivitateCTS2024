public class Program {
    public static void main(String[]args){
        tipSupa supa1 = tipSupa.getInstanta("Supa de tomate");
        tipSupa supa2= tipSupa.getInstanta("Ciorba de burta");
        tipSupa supa3 = tipSupa.getInstanta("Supa crema de linte");

        System.out.println(supa1.getNumeSupa());
        System.out.println(supa2.getNumeSupa());
        System.out.println(supa3.getNumeSupa());
    }
}
