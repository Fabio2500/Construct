class Circulo{
 float raio;
 float diametro;

public void mostrar_dados(){
System.out.println("raio :" + raio);
System.out.println("diametro: " + diametro);
}
	
public Circulo(float raio){
this.raio = raio;
this.diametro = raio*2;
this.mostrar_dados();
}

}
