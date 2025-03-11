record Alumno(String nombre){}

class ListaAlumnos {
    Alumno[] alumnos = new Alumno[2];
    int size;

    void grow(){
        if (size == alumnos.length){
            Alumno[] nuevo = new Alumno[alumnos.length*2];
            for (int i = 0; i < alumnos.length; i++){
                nuevo[i] = alumnos[i];
            }
            alumnos = nuevo;
        }
    }

    void add(int pos, Alumno alumno){
        grow();
        alumnos[size] = alumno;
        size++;
    }

    void add(Alumno alumno){
        grow();
        alumnos[size] = alumno;
        size++;
    }

    void print(){
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i] != null){
                System.out.println(alumnos[i].nombre());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaAlumnos listaAlumnos = new ListaAlumnos();
        listaAlumnos.add(new Alumno("Paco"));
        listaAlumnos.add(new Alumno("Juan"));
        listaAlumnos.add(new Alumno("SI"));
        listaAlumnos.add(new Alumno("No"));


        listaAlumnos.print();
        listaAlumnos.add(new Alumno("Pepe"));
        listaAlumnos.add(new Alumno("J"));
        listaAlumnos.add(new Alumno("W"));
        listaAlumnos.add(new Alumno("T"));
        System.out.println();
        listaAlumnos.print();



    }
}