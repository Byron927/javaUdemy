
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciando el objeto
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindraje(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        System.out.println("Son iguales?" + (nissan == nissan2));
        System.out.println("Son iguales con equals?" + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300, 0.6f));


    }
}