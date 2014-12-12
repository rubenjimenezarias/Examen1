
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // Atributo nombre del usuario
    private String nomusu;
    //Atributos de lo que ha ingerido el usuario.
    private float proteina;
    private float carbo;
    private float grasa;
    private float caloria;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombre)
    {
        // initialise instance variables
        nomusu = nombre;
        proteina = 0;
        carbo = 0;
        grasa = 0;
        caloria = 0;
    }

    /**
     * Sumamos lo ingerido al usuario
     */
    public void comer(Alimento comida, int gramos)
    {
        // cogemos el alimento 
        proteina = proteina + ((comida.proteina()/100)*gramos);
        carbo = carbo + ((comida.carbo()/100)*gramos);
        grasa = grasa + ((comida.grasa()/100)*gramos);
        caloria = caloria + ((comida.caloria()/100)*gramos);
    }
    
    /**
     * Mostramos por pantalla lo que el usuario lleva ingerido
     */
    public void estadoComidaIngerida()
    {
        // mostramos los datos por pantalla el estado del estomago del usuario
        System.out.println("Nombre: " + nomusu);
        System.out.println("Proteina: " + proteina + " gramos.");
        System.out.println("Carbohidratos: " + carbo + " gramos.");
        System.out.println("Grasa: " + grasa + " gramos.");
        System.out.println("Calorias: " + caloria + " gramos.");
    }
}
