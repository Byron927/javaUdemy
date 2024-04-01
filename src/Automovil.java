public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindraje;
    private int capacidadTanque = 40;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje) {
        this(fabricante, modelo, color);
        this.cilindraje = cilindraje;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje, int capacidadTanque) {
        this(fabricante, modelo, color, cilindraje);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }


    //Estos son los metodos: verDetalle, acelerar, frenar
    //Cuando tenía los detalles de sout en el main, me refería a los atributos con la palabra auto porque
    //así la había llamado en la instancia, pero cuando estoy acá en la clase Automovil ya los llamo con "this":
    public String verDetalle() {
        return "auto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.color = " + this.getColor() +
                "\nauto.cilindraje = " + this.getCilindraje();
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    //Las dos variables aquí adentro son locales del método acelerarFrenar, no de la clase
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeCombustible) {
        return km / (capacidadTanque * porcentajeCombustible);
    }

    //Este código Java es la implementación del método equals en una clase llamada Automovil.
    //El método equals se utiliza para comparar dos objetos y determinar si son iguales según algún criterio específico.
    @Override
    public boolean equals(Object obj) {
        //Si el objeto es de un tipo diferente de Automovil entonces retorne falso
        if(!(obj instanceof Automovil)){
            return false;
        }
        //Siempre debemos comparar un objeto del mismo tipo, por eso acá se hace el cast, porque "obj" es de tipo
        //"Object" y yo lo necesito de tipo Automovil
        Automovil objAutomovil = (Automovil) obj;
        //Los String siempre los comparamos con equals
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(objAutomovil.getFabricante())
                && this.modelo.equals(objAutomovil.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
