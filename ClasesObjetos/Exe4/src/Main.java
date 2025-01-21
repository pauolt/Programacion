public class Main {

    static class alumno {
        String name;
        float mark;

        void setName(String name){
            this.name = name;

        }

        void setMark(float mark){
            this.mark = mark;

        }

        String getName(){
            return name;
        }


        Float getMark(){
            return mark;
        }

    }

    public static void main(String[] args) {

        alumno alumno1 = new alumno();
        alumno1.setName("Paco");
        alumno1.setMark(8.5f);


        alumno alumno2 = new alumno();
        alumno2.setName("Juan");
        alumno2.setMark(4.75f);

        System.out.println("Nombre: " +  alumno1.getName() + " Nota: " + alumno1.getMark());
        System.out.println("Nombre: " +  alumno2.getName() + " Nota: " + alumno2.getMark());
    }
}