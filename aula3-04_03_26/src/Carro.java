public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla");
        Carro carro2 = new Carro("Honda", "Civic");

        System.out.println("Marca: " + carro1.marca + ", Modelo: " + carro1.modelo);
        System.out.println("Marca: " + carro2.marca + ", Modelo: " + carro2.modelo);
    }
}