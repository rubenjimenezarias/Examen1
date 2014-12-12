
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
    public void comer(Alimento comida, float gramos)
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
        //calculamos los porcentajes de los alimentos
        float total = (proteina + carbo + grasa);
        float porproteina = (proteina*100)/total;
        float porcarbo = (carbo*100)/total;
        float porgrasa = (grasa*100)/total;
        
        // mostramos los datos por pantalla el estado del estomago del usuario
        System.out.println("Nombre: " + nomusu);
        if (porproteina <= 0){
            System.out.println("Proteina: " + proteina + " gramos.");
        }
        else {
            System.out.println("Proteina: " + proteina + " gramos.   " + porproteina + "%.");
        }
        if (porcarbo <= 0){
            System.out.println("Proteina: " + carbo + " gramos.");
        }
        else {
            System.out.println("Proteina: " + carbo + " gramos.   " + porcarbo + "%.");
        }
        if (porgrasa <= 0){
            System.out.println("Proteina: " + grasa + " gramos.");
        }
        else {
            System.out.println("Proteina: " + grasa + " gramos.   " + porgrasa + "%.");
        }
        System.out.println("Calorias: " + caloria + " gramos.");
    }
    /**
     * Devuelve el nombre del Usuario
     */
    public String nombre()
    {
        return nomusu;
    }
    /**
     * Devuelve las calorias del usuario
     */
    public float caloria()
    {
        return caloria;
    }
    /**
     * Comparamos entre dos usuarios quien ha comido mas calorias y lo mostramos por pantalla
     */
    public void compararCalorias(Usuario compararCon)
    {
        if (caloria > compararCon.caloria()){
            System.out.println(nomusu + " ha comido mas calorias que " + compararCon.nombre());
        }
        else if (caloria < compararCon.caloria()){
            System.out.println(compararCon.nombre() + " ha comido mas calorias que " + nomusu);
        }
        else {
            System.out.println("Los dos han comido la misma cantidad de calorias.");
        }
    }
}
