class Empleado {
    String nombre;
    String puesto;
    float nomina;

    Empleado(String nombre, String puesto, float nomina) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.nomina = nomina;

    }
}

class Empresa {
    Empleado[] lista_empleado = new Empleado[100];

    String addEmpleado (String nombre, String puesto, float nomina){
        for (int i = 0; i < lista_empleado.length; i++){
            if (lista_empleado[i] == null){
                lista_empleado[i] = new Empleado(nombre, puesto, nomina);
                return "Empleado añadido";
            }
        }
        return "No se ha podido añadir al empleado";
    }

    String addEmpleado (Empleado empleado){
        for (int i = 0; i < lista_empleado.length; i++){
            if (lista_empleado[i] == null){
                lista_empleado[i] = empleado;
                return "Empleado añadido";
            }
        }
        return "No se ha podido añadir al empleado";
    }

    String delEmpleado (int pos) {
        lista_empleado[pos-1] = null;
        return "Empleado eliminado";
    }

    int nominaTotal (){
        int total = 0;
        for (int i = 0; i < lista_empleado.length; i++){
            if (lista_empleado[i] != null){
                total += (int) lista_empleado[i].nomina;
            }
        }
        return total;
    }

    String getEmpleados () {
        String empleados = "";
        for (int i = 0; i < lista_empleado.length; i++){
            if (lista_empleado[i] != null){
                empleados += lista_empleado[i].nombre + " | " + lista_empleado[i].puesto + " | " + lista_empleado[i].nomina + " | \n";
            }
        }
        return empleados;
    }

}

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", "Junior", 1600);
        Empresa empresa = new Empresa();

        System.out.println(empresa.addEmpleado(e1));
        empresa.addEmpleado("Paco", "Senior", 2140);
        empresa.addEmpleado("Pepe", "Senior", 3140);

        System.out.println(empresa.getEmpleados() + empresa.nominaTotal());
        System.out.println();

        System.out.println(empresa.delEmpleado(1));
        System.out.println(empresa.getEmpleados() + empresa.nominaTotal());

    }
}