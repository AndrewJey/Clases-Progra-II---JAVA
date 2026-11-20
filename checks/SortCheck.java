public class SortCheck {
 public static void main(String[] args) throws Exception {

 java.util.Random random=new java.util.Random(81);
 for(int size=0;size<100;size++)for(int method=0;method<4;method++){
  int[] values=new int[size];for(int i=0;i<size;i++)values[i]=random.nextInt(31)-15;
  int[] expected=values.clone();java.util.Arrays.sort(expected);
  if(method==0)odernamientos.Odernamientos.insercion(values);
  if(method==1)odernamientos.Odernamientos.seleccion(values);
  if(method==2)odernamientos.Odernamientos.shell(values);
  if(method==3)odernamientos.Odernamientos.quicksort(values,0,values.length-1);
  CheckSupport.check(java.util.Arrays.equals(values,expected),"Sort matches JDK oracle");
 }

 CheckSupport.done();
 }
}
