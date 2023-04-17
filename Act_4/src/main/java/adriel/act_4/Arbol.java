package adriel.act_4;

/**
 *
 * @author Adriel Sanchez 219220991 @ Unison
 */
public class Arbol {

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(int i, Object fruta) {
        Nodo n = new Nodo(i);
        n.contenido = fruta;

        if (raiz == null) {
            raiz = n;

        } else {
            Nodo aux = raiz;
            while (aux != null) {
                n.padre = aux;
                if (n.llave >= aux.llave) {
                    aux = aux.derecho;
                } else {
                    aux = aux.izquierdo;
                }
            }

            if (n.llave < n.padre.llave) {
                n.padre.izquierdo = n;
            } else {
                n.padre.derecho = n;
            }
        }

    }

    public void inOrden(Nodo n) {
        if (n != null) {
            inOrden(n.izquierdo);
            System.out.println("Indice " + n.llave + " Contenido " + n.contenido);
            inOrden(n.derecho);
        }
    }

    public void preOrden(Nodo n) {
        if (n != null) {
            System.out.println("Indice " + n.llave + " Contenido " + n.contenido);
            preOrden(n.izquierdo);
            preOrden(n.derecho);
        }
    }

    public void postOrden(Nodo n) {
        if (n != null) {
            postOrden(n.izquierdo);
            postOrden(n.derecho);
            System.out.println("Indice " + n.llave + " Contenido " + n.contenido);

        }
    }

    private class Nodo {

        public Nodo padre;
        public Nodo izquierdo;
        public Nodo derecho;
        public int llave;
        public Object contenido;

        public Nodo(int indice) {
            llave = indice;
            derecho = null;
            izquierdo = null;
            padre = null;
            contenido = null;
        }
    }
}
