public class Main {

    static class planet {
        int size;
        float dist_sun;

        planet(int s, float d) {
            size = s;
            dist_sun = d;
        }
    }

    static class star {
        int size;
        float dist_earth;

        star(int s, float d) {
            size = s;
            dist_earth = d;
        }
    }


    public static void main(String[] args) {

        planet mercurio = new planet(4880, 57.9f);
        planet venus = new planet(12104, 108.2f);
        planet tierra = new planet(12742, 149.6f);
        planet marte = new planet(6779, 227.9f);
        planet jupiter = new planet(139820, 778.5f);
        planet saturno = new planet(116460, 1434);
        planet urano = new planet(50724, 2871.0f);
        planet neptuno = new planet(49224, 4495.0f);
        star sol = new star(1392700, 149.6f);

        System.out.println("Mercurio");
        System.out.println(mercurio.size);
        System.out.println(mercurio.dist_sun);

        System.out.println("Venus");
        System.out.println(venus.size);
        System.out.println(venus.dist_sun);

        System.out.println("Tierra");
        System.out.println(tierra.size);
        System.out.println(tierra.dist_sun);

        System.out.println("Marte");
        System.out.println(marte.size);
        System.out.println(marte.dist_sun);

        System.out.println("Jupiter");
        System.out.println(jupiter.size);
        System.out.println(jupiter.dist_sun);

        System.out.println("Saturno");
        System.out.println(saturno.size);
        System.out.println(saturno.dist_sun);

        System.out.println("Urano");
        System.out.println(urano.size);
        System.out.println(urano.dist_sun);

        System.out.println("Neptuno");
        System.out.println(neptuno.size);
        System.out.println(neptuno.dist_sun);

        System.out.println("Sol");
        System.out.println(sol.size);
        System.out.println(sol.dist_earth);


    }
}