public class TreeMissingCheck {
 public static void main(String[] args) throws Exception {

 arbolbinario.Arbol tree=new arbolbinario.Arbol();tree.buscar(99,null);
 for(int n:new int[]{5,3,7,1,4})tree.insertaNodo(n);
 arbolbinario.NodoArbol root=(arbolbinario.NodoArbol)CheckSupport.field(tree,"Raiz");
 CheckSupport.equal(tree.tamaño(root),5);CheckSupport.equal(tree.altura(root),2);
 java.io.ByteArrayOutputStream output=new java.io.ByteArrayOutputStream();java.io.PrintStream original=System.out;
 try {System.setOut(new java.io.PrintStream(output));tree.buscar(99,root);}finally{System.setOut(original);}
 CheckSupport.check(output.toString().contains("No encontrado"),"Missing search is controlled");

 CheckSupport.done();
 }
}
