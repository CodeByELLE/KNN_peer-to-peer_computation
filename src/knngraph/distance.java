package knngraph;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class distance {
	
	public ArrayList<Double> x 		= new ArrayList<Double>();
	public ArrayList<Double> y 		= new ArrayList<Double>();
	public static int i=0;
	
	 distance()
	{
		do
		{
			//choosing the metric
			Scanner scan=new Scanner(System.in);
			System.out.println("Choose your metric of similarity by number:\n"
	        		+ "1.Euclidean \t2.Cosine \t3.Manhattan \t4.Hamming");
	        

	        System.out.print("\nEnter number : ");
			i=scan.nextInt();
			
		}while(i!=1&&i!=2&&i!=3&&i!=4);		
		
	}
	
	public static double driver(ArrayList<Double> x, ArrayList<Double> y)
	{
		double ss=0;
		switch (i) {
        case 1:
        	ss = Euclidean(x,y); 
            break;
        case 2:
             ss = cosineSimilarity(x,y); 
            break;
        case 3:
        	 ss = Manhattan(x,y); 
            break;
        case 4:
        	
        	 ss = hamming(x,y); 
            break;
       

        default:
            System.out.println("Not the case");
            break;}
		
		
		return ss;
		
	}

	public static double Euclidean(double x[], double y[]) {
		  
		  double ds=0.0;
		  for(int n=0;n<x.length;n++)
		   ds += Math.pow(x[n]-y[n],2.0);
		  
		  ds=Math.sqrt(ds);
		  return  ds;  
		 }
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	public static double Euclidean(ArrayList<Double> x, ArrayList<Double> y) {
		  
		  double ds=0.0;
		  for(int n=0;n<x.size();n++)
		   ds += Math.pow(x.get(n)-y.get(n),2.0);
		  
		  ds=Math.sqrt(ds);
		  DecimalFormat df = new DecimalFormat("0.00");      
		  return  round(ds,2);  
		 }


	public static double Manhattan(double x[], double y[]) {
		  
		  double ds=0.0;
		  for(int n=0;n<x.length;n++)
		   ds += Math.abs(x[n]-y[n]);   
		  return  ds;  
		 }
	
	public static double Manhattan(ArrayList<Double> x, ArrayList<Double> y) {
		  
		  double ds=0.0;
		  for(int n=0;n<x.size();n++)
		   ds += Math.abs(x.get(n)-y.get(n));   
		  return  ds;  
		 }
	
	public static double cosineSimilarity(double[] vectorA, double[] vectorB) {
	    double dotProduct = 0.0;
	    double normA = 0.0;
	    double normB = 0.0;
	    for (int i = 0; i < vectorA.length; i++) {
	        dotProduct += vectorA[i] * vectorB[i];
	        normA += Math.pow(vectorA[i], 2);
	        normB += Math.pow(vectorB[i], 2);
	    }   
	    return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
	}
	
	public static double cosineSimilarity(ArrayList<Double> vectorA, ArrayList<Double> vectorB) {
	    double dotProduct = 0.0;
	    double normA = 0.0;
	    double normB = 0.0;
	    for (int i = 0; i < vectorA.size(); i++) {
	        dotProduct += vectorA.get(i) * vectorB.get(i);
	        normA += Math.pow(vectorA.get(i), 2);
	        normB += Math.pow(vectorB.get(i), 2);
	    }   
	    return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
	}
	
	public static double hamming(double[] source, double[] target) { 

		double distance=0; 
	       
	      if (source.length!= target.length) return distance; 
	      for(int i=0;i<source.length;i++) { 
	          if (source[i]!=target[i]) distance++; 
	      } 
	       
	      return distance; 
	  }
	
	public static double hamming(ArrayList<Double> source, ArrayList<Double> target) { 

		double distance=0; 
	       
	      if (source.size()!= target.size()) return distance; 
	      for(int i=0;i<source.size();i++) { 
	          if (source.get(i)!=target.get(i)) distance++; 
	      } 
	       
	      return distance; 
	  }

	public static String Euclidean(Object[] e1, Object[] e2) {
		// TODO Auto-generated method stub
		return null;
	} 
}
