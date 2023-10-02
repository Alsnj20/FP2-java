class Caras{
  public static void main(String[] args){    
    int launch = 1000000;
    int[] sided = new int[4];
    for(int i=0; i<launch; i++){
	    //llenando un aleatorio de Nro r
      int n = generateSide();
      for(int j=0; j<4; j++){
        if(n == j)
	      sided[j]++;
      }
    }
    System.out.println("Salida para simulación de "+launch+" lanzamientos:");
    System.out.println("Numero de veces de cada caso ocurrido(0, 1, 2, 3)");
    generateFrequency(sided);
  }
  public static int generateSide(){
    return (int)(Math.random()*4);
  }
  public static void generateFrequency(int[] arr){
    for(int i=0; i<arr.length; i++){
      System.out.println(i+" "+arr[i]+" "+generateBar(arr[i]));
    }
  }
  public static String generateBar(int n){
    String bar = "";
    for(int i=0; i<n/10000; i++){
      bar += "*";
    }
    return bar;
  }
}

